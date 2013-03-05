package org.correttouml.plugins.launchinterface.launching.tabs;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SampleTab extends AbstractLaunchConfigurationTab implements ModifyListener{

	protected Label fileLabel;
	protected Text filePath;
	protected Button browse;
	protected String source;
	protected Shell shell = new Shell();
	
	
	/**
	 * Build the layout of this tab
	 */
	@Override
	public void createControl(Composite parent) {
		FillLayout parentLayout = new FillLayout();
		parent.setLayout(parentLayout);

		Composite control = new Composite(parent, SWT.NONE);
		setControl(control);
		
		GridLayout controlLayout = new GridLayout(1, false);
		control.setLayout(controlLayout);
		
		Group topControl = new Group(control,SWT.BACKGROUND);
		GridLayout topControlLayout = new GridLayout(3, false);
		topControl.setLayout(topControlLayout);
		topControl.setText("UML Model for Verification");
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		topControl.setLayoutData(gd);
		
		
		fileLabel = new Label(topControl, SWT.NONE);
		
		GridData filePathData = new GridData(GridData.FILL_HORIZONTAL);
		filePath = new Text(topControl, SWT.BORDER);
		filePath.setLayoutData(filePathData);
		filePath.addModifyListener(this);
		
		Button browse = new Button(topControl, SWT.NONE);
		browse.setText("Browse Workspace...");
		browse.addSelectionListener(this.getSelectionDialog());
		
		fileLabel.setText("Source .uml model: ");
		//createBottomControl(control);
		
		control.setBounds(0, 0, 300, 300);
		control.layout();
		control.pack();
		
		canSave();
	}


	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute("PATH_TO_MODEL", filePath.getText());
	}

	@Override
	public String getName() {
		return "Corretto UML Launch";
	}

	@Override
	public void modifyText(ModifyEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Returns the dialog box to select the file
	 */
	private SelectionAdapter getSelectionDialog(){
		return new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(shell, SWT.NULL);
				String path = dialog.open();
				filePath.setText(path);
			}
		};
	}

}
