package org.correttouml.plugins.launchinterface.launching.tabs;

import java.util.Collection;

import org.correttouml.plugins.launchinterface.util.ZotSetupUtil;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class ZotConfigurationTab extends AbstractLaunchConfigurationTab
		implements ModifyListener {
	protected Text tbText;
	protected Combo plugin;
	protected Combo solver;
	protected Text propertyText;
	protected Text location;
	protected Text event1;
	protected Text event2;
	protected Combo timeOption1;
	protected Combo timeOption2;
	protected Button browseEvents1;
	protected Button browseEvents2;
	protected ILaunchConfiguration configuration;
	protected String event1XmiId;
	protected String event2XmiId;
	protected String event1Text;
	protected String event2Text;
	protected Text timeOptionValue1;
	protected Text timeOptionValue2;
	protected Combo eventTiming1;
	protected Combo eventTiming2;

	@Override
	public String getName() {
		return "Zot Configuration";
	}

	@Override
	public void createControl(Composite parent) {
		/**
		 * Create container
		 **/
		FillLayout parentLayout = new FillLayout();
		parent.setLayout(parentLayout);
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		GridLayout controlLayout = new GridLayout(1, false);
		container.setLayout(controlLayout);

		/**
		 * Create container contents
		 **/
		createTopControl(container);
		createMiddleControl(container);
		createBottomControl(container);
		container.pack();
		container.layout();
		canSave();
	}

	/**
	 * Create top control
	 **/
	private void createTopControl(Composite parent) {
		Group topControl = new Group(parent, SWT.BACKGROUND);
		GridLayout topControlLayout = new GridLayout(4, false);
		topControl.setLayout(topControlLayout);
		topControl.setText("Zot Setup Information");
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		topControl.setLayoutData(gd);

		/**
		 * Time Bound Label and text field
		 **/
		new Label(topControl, SWT.NONE).setText("Time Bound:");
		tbText = new Text(topControl, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint = 200;
		tbText.setLayoutData(gd);
		tbText.addListener(SWT.Verify, new Listener() {
			public void handleEvent(Event e) {
				ZotSetupUtil.InputIsInt(e.text, e);
			}
		});
		tbText.addModifyListener(this);

		/**
		 * Plug-in Label and text field
		 **/
		new Label(topControl, SWT.NONE).setText("Zot Plugin:");
		plugin = new Combo(topControl, SWT.BORDER | SWT.READ_ONLY);
		gd = new GridData(SWT.FILL, SWT.FILL, true, false);
		gd.widthHint = 200;
		plugin.setLayoutData(gd);
		plugin.addModifyListener(this);

		/**
		 * Property Label and text field
		 **/

		Label propLabel = new Label(topControl, SWT.NONE);

		gd = new GridData(SWT.FILL, SWT.FILL, true, false);
		gd.widthHint = 200;
		gd.horizontalSpan = 2;
		propLabel.setLayoutData(gd);

		/**
		 * Solver Label and field
		 **/
		Label lblSolver = new Label(topControl, SWT.NONE);
		lblSolver.setText("Solver:");
		solver = new Combo(topControl, SWT.BORDER | SWT.READ_ONLY);
		solver.setEnabled(false);
		gd = new GridData(SWT.FILL, SWT.FILL, true, false);
		gd.widthHint = 200;
		solver.setLayoutData(gd);
		solver.addModifyListener(this);

		/**
		 * Add contents of solver combo depending on the contents of the plug-
		 * in combo
		 */
		String items[] = { "eezot", "meezot", "smteezot", "smtmeezot", "ae2zot" };
		plugin.setItems(items);
		plugin.setText("plugin...");
		plugin.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				initializeSolverCombo(plugin, solver);
			}
		});
	}

	/**
	 * Create bottom control
	 **/
	private void createBottomControl(final Composite parent) {
		GridData gd = null;

		Group bottomControl = new Group(parent, SWT.BACKGROUND);
		GridLayout bottomControlLayout = new GridLayout(3, false);
		bottomControl.setLayout(bottomControlLayout);
		bottomControl.setText("Directory of Zot executable");
		gd = new GridData(SWT.FILL, SWT.FILL, true, false);
		bottomControl.setLayoutData(gd);

		/**
		 * Create bottom control contents
		 **/
		Label lblZotLocation = new Label(bottomControl, SWT.NONE);
		lblZotLocation.setText("Zot Directory:");
		location = new Text(bottomControl, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		location.setLayoutData(gd);
		location.addModifyListener(this);

		Button button = new Button(bottomControl, SWT.PUSH);
		button.setText("Browse");
		gd = new GridData(SWT.END);
		button.setLayoutData(gd);
		button.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				createDirectoryDialog(parent, location, "Zot Directory Dialog",
						"Select a directory");
			}
		});
	}

	/**
	 * Create middle control
	 **/
	private void createMiddleControl(final Composite parent) {
		GridData gd = null;
		Group middleControl = new Group(parent, SWT.BACKGROUND);
		middleControl
				.setText("Set property to be verified (event1 implies event2)");
		GridLayout middleControlLayout = new GridLayout(6, false);
		middleControl.setLayout(middleControlLayout);
		gd = new GridData(SWT.FILL, SWT.FILL, true, false);
		middleControl.setLayoutData(gd);

		browseEvents1 = new Button(middleControl, SWT.READ_ONLY);
		browseEvents1.setText("Event 1");
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
		browseEvents1.setLayoutData(gd);
		browseEvents1.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
//				try {
//					UMLElementSelectionDialog dialog = new UMLElementSelectionDialog(
//							ZotConfigurationTab.this.getShell(),
//							getUMLResource(configuration
//									.getAttribute(
//											MadesVerificationLaunchConfigurationAttributes.SOURCE,
//											"")));
//					dialog.setBlockOnOpen(true);
//					dialog.open();
//					event1Text = dialog.getSelectedElementText();
//					event1XmiId = dialog.getSelectedElementXmiId();
//					if (event1Text != null) {
//						event1.setText(event1Text);
//					}
//
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
			}
		});

		event1 = new Text(middleControl, SWT.BORDER | SWT.READ_ONLY);
		event1.setText("Choose event 1");
		event1.setEnabled(false);
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
		event1.setLayoutData(gd);

		eventTiming1 = new Combo(middleControl, SWT.READ_ONLY);
		eventTiming1.setEnabled(true);
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
		eventTiming1.setLayoutData(gd);
		eventTiming1.addModifyListener(this);

		timeOption1 = new Combo(middleControl, SWT.BORDER | SWT.READ_ONLY);
		timeOption1.setEnabled(true);
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
		timeOption1.setLayoutData(gd);
		timeOption1.addModifyListener(this);

		timeOptionValue1 = new Text(middleControl, SWT.BORDER);
		timeOptionValue1.setText("Set Time Option Value 1");
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
		gd.horizontalSpan = 2;
		timeOptionValue1.setLayoutData(gd);
		timeOptionValue1.addModifyListener(this);

		browseEvents2 = new Button(middleControl, SWT.READ_ONLY);
		browseEvents2.setText("Event 2");
		browseEvents2.setEnabled(true);
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
		browseEvents2.setLayoutData(gd);
		browseEvents2.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
//				try {
//					UMLElementSelectionDialog dialog = new UMLElementSelectionDialog(
//							ZotConfigurationTab.this.getShell(),
//							getUMLResource(configuration
//									.getAttribute(
//											MadesVerificationLaunchConfigurationAttributes.SOURCE,
//											"")));
//					dialog.setBlockOnOpen(true);
//					dialog.open();
//					event2Text = dialog.getSelectedElementText();
//					event2XmiId = dialog.getSelectedElementXmiId();
//					if (event2Text != null) {
//						event2.setText(event2Text);
//					}
//
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
			}
		});

		event2 = new Text(middleControl, SWT.BORDER | SWT.READ_ONLY);
		event2.setText("Choose event 2");
		event2.setEnabled(false);
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
		event2.setLayoutData(gd);

		eventTiming2 = new Combo(middleControl, SWT.READ_ONLY);
		eventTiming2.setEnabled(true);
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
		eventTiming2.setLayoutData(gd);
		eventTiming2.addModifyListener(this);

		timeOption2 = new Combo(middleControl, SWT.BORDER | SWT.READ_ONLY);
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
		timeOption2.setLayoutData(gd);
		timeOption2.addModifyListener(this);

		timeOptionValue2 = new Text(middleControl, SWT.BORDER);
		timeOptionValue2.setText("Set Time Option Value 2");
		gd = new GridData(SWT.FILL, SWT.CENTER, true, false);
		gd.horizontalSpan = 2;
		timeOptionValue2.setLayoutData(gd);
		timeOptionValue2.addModifyListener(this);

		String[] timeItems = { "...", "Past", "Future", "Within Past",
				"Within Future", "Lasts", "Lasted", "SomFutr", "Until", "Since" };
		String[] timingItems = { "...", "Start", "Finish" };

		eventTiming2.setItems(timingItems);
		eventTiming2.select(1);
		eventTiming1.setItems(timingItems);
		eventTiming1.select(1);
		timeOption1.setItems(timeItems);
		timeOption2.setItems(timeItems);

		Button button = new Button(middleControl, SWT.PUSH);
		button.setText("Clear Property");
		gd = new GridData(SWT.END);
		gd.horizontalSpan = 2;
		button.setLayoutData(gd);
		button.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				eventTiming1.setText("...");
				eventTiming2.setText("...");
				timeOption1.setText("...");
				timeOption2.setText("...");
				timeOptionValue1.setText("");
				timeOptionValue2.setText("");
				event1.setText("");
				event2.setText("");
			}
		});
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	private void createDirectoryDialog(Composite parent, Text location,
			String title, String message) {
		DirectoryDialog dlg = new DirectoryDialog(parent.getShell());
		dlg.setFilterPath(location.getText());
		dlg.setText(title);
		dlg.setMessage(message);
		String dir = dlg.open();
		if (dir != null) {
			location.setText(dir);
		}
	}

	private void initializeSolverCombo(Combo plugin, Combo solver) {
		if (plugin.getSelectionIndex() != -1) {
			if (plugin.getText().equals("eezot")
					|| plugin.getText().equals("meezot")) {
				String newItems[] = { "minisat" };
				solver.setItems(newItems);
			} else if (plugin.getText().equals("ae2zot")
					|| plugin.getText().equals("smteezot")) {
				String newItems[] = { "yices", "z3" };
				solver.setItems(newItems);
			} else {
				String newItems[] = { "z3" };
				solver.setItems(newItems);
				solver.setText("z3");
			}
			solver.setEnabled(true);
		}
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		this.configuration = configuration;
//		try {
//			tbText.setText(configuration.getAttribute(
//					MadesVerificationLaunchConfigurationAttributes.TIME_BOUND,
//					""));
//			// propertyText.setText(configuration.getAttribute(MadesVerificationLaunchConfigurationAttributes.PROPERTY,""));
//			plugin.setText(configuration.getAttribute(
//					MadesVerificationLaunchConfigurationAttributes.PLUGIN, ""));
//			if (plugin.getSelectionIndex() != -1) {
//				solver.setEnabled(true);
//				initializeSolverCombo(plugin, solver);
//				solver.setText(configuration.getAttribute(
//						MadesVerificationLaunchConfigurationAttributes.SOLVER,
//						""));
//			}
//			location.setText(configuration
//					.getAttribute(
//							MadesVerificationLaunchConfigurationAttributes.ZOT_LOCATION,
//							""));
//
//			event1Text = configuration.getAttribute(
//					MadesVerificationLaunchConfigurationAttributes.EVENT1_TEXT,
//					"");
//			event1XmiId = configuration.getAttribute(
//					MadesVerificationLaunchConfigurationAttributes.EVENT1_ID,
//					"");
//			event1.setText(configuration.getAttribute(
//					MadesVerificationLaunchConfigurationAttributes.EVENT1_TEXT,
//					""));
//
//			event2Text = configuration.getAttribute(
//					MadesVerificationLaunchConfigurationAttributes.EVENT2_TEXT,
//					"");
//			event2XmiId = configuration.getAttribute(
//					MadesVerificationLaunchConfigurationAttributes.EVENT2_ID,
//					"");
//			event2.setText(configuration.getAttribute(
//					MadesVerificationLaunchConfigurationAttributes.EVENT2_TEXT,
//					""));
//
//			timeOption1
//					.setText(configuration
//							.getAttribute(
//									MadesVerificationLaunchConfigurationAttributes.TIME_OPTION_1,
//									""));
//			timeOption2
//					.setText(configuration
//							.getAttribute(
//									MadesVerificationLaunchConfigurationAttributes.TIME_OPTION_2,
//									""));
//
//			timeOptionValue1
//					.setText(configuration
//							.getAttribute(
//									MadesVerificationLaunchConfigurationAttributes.TIME_OPTION_VALUE_1,
//									""));
//			timeOptionValue2
//					.setText(configuration
//							.getAttribute(
//									MadesVerificationLaunchConfigurationAttributes.TIME_OPTION_VALUE_2,
//									""));
//
//			eventTiming1
//					.setText(configuration
//							.getAttribute(
//									MadesVerificationLaunchConfigurationAttributes.EVENT_TIMING_1,
//									""));
//			eventTiming2
//					.setText(configuration
//							.getAttribute(
//									MadesVerificationLaunchConfigurationAttributes.EVENT_TIMING_2,
//									""));
//			updateLaunchConfigurationDialog();
//		} catch (Exception e) {
//			return;
//		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.TIME_BOUND,
//				(String) tbText.getText());
//		// configuration.setAttribute(MadesVerificationLaunchConfigurationAttributes.PROPERTY,
//		// (String) propertyText.getText());
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.PLUGIN,
//				(String) plugin.getText());
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.SOLVER,
//				(String) solver.getText());
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.ZOT_LOCATION,
//				(String) location.getText());
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.EVENT1_TEXT,
//				(String) event1Text);
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.EVENT1_ID,
//				(String) event1XmiId);
//
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.EVENT2_TEXT,
//				(String) event2Text);
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.EVENT2_ID,
//				(String) event2XmiId);
//
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.TIME_OPTION_1,
//				timeOption1.getText());
//		configuration
//				.setAttribute(
//						MadesVerificationLaunchConfigurationAttributes.TIME_OPTION_VALUE_1,
//						timeOptionValue1.getText());
//
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.EVENT_TIMING_1,
//				eventTiming1.getText());
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.EVENT_TIMING_2,
//				eventTiming2.getText());
//		configuration.setAttribute(
//				MadesVerificationLaunchConfigurationAttributes.TIME_OPTION_2,
//				timeOption2.getText());
//		configuration
//				.setAttribute(
//						MadesVerificationLaunchConfigurationAttributes.TIME_OPTION_VALUE_2,
//						timeOptionValue2.getText());
	}

	@Override
	public void modifyText(ModifyEvent e) {
		canSave();
		updateLaunchConfigurationDialog();
	}

	public boolean canSave() {
		return super.canSave();
		// if(location !=null){
		// String path = location.getText();
		// File file= new File(path);
		// if (file == null || !file.exists() || !file.isDirectory()){
		// setErrorMessage("Provided Zot directory is not valid.");
		// return false;
		// }
		// else {
		// setErrorMessage(null);
		// return true;
		// }
		// }
		// return false;
	}

	protected Resource getUMLResource(String path) {

//		ResourceSet resourceSet = new ResourceSetImpl();
//		resourceSet
//				.getResourceFactoryRegistry()
//				.getExtensionToFactoryMap()
//				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
//						new XMIResourceFactoryImpl());
//		try {
//			org.eclipse.emf.common.util.URI fileURI = org.eclipse.emf.common.util.URI
//					.createFileURI(new File(Util.getLocationFromPath(path))
//							.getAbsolutePath());
//			return resourceSet.getResource(fileURI, true);
//
//		} catch (Exception e) {
//			System.err.println(e);
//		}
		return null;
	}

	protected Collection<String> getUMLContents(String path) {
//		Collection<String> list = new ArrayList<String>();
//
//		ResourceSet resourceSet = new ResourceSetImpl();
//		resourceSet
//				.getResourceFactoryRegistry()
//				.getExtensionToFactoryMap()
//				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
//						new XMIResourceFactoryImpl());
//		try {
//			org.eclipse.emf.common.util.URI fileURI = org.eclipse.emf.common.util.URI
//					.createFileURI(new File(Util.getLocationFromPath(path))
//							.getAbsolutePath());
//			Resource resource = resourceSet.getResource(fileURI, true);
//			Model model = (Model) ((Resource) resource).getContents().get(0);
//			TreeIterator<EObject> iter = model.eAllContents();
//			while (iter.hasNext()) {
//				EObject next = (EObject) iter.next();
//				if (next != null
//						&& (next instanceof Message
//								|| next instanceof Interaction
//								|| next instanceof Operation
//								|| next instanceof State
//								|| next instanceof Transition || next instanceof MessageOccurrenceSpecification)) {
//					list.add(Util.getEObjectName(next));
//				}
//			}
//		} catch (Exception e) {
//			System.err.println(e);
//		}
//		return list;
		return null;
	}
}
