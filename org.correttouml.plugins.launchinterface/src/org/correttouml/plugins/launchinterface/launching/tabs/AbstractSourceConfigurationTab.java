package org.correttouml.plugins.launchinterface.launching.tabs;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public abstract class AbstractSourceConfigurationTab
	extends AbstractLaunchConfigurationTab implements ModifyListener{
		
		protected Label fileLabel;
		protected Text filePath;
		protected Button browse;
		protected String source;
		
		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

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
			//browse.addListener(SWT.Selection, new SelectSourceListener(filePath));
			
			fileLabel.setText(getFileLabel() + ": ");
			
			//createBottomControl(control);
			
			control.setBounds(0, 0, 300, 300);
			control.layout();
			control.pack();
			
			canSave();
			
		}
			
		public String getFileLabel() {
			return "Source";
		}

		public abstract void createBottomControl(Composite parent);

		public abstract String getTitle();
		
		public void performApply(ILaunchConfigurationWorkingCopy configuration){
			//TODO:
		}
		
		public void initializeFrom(ILaunchConfiguration configuration){
			//TODO:
		}
		
//		public String getActiveEditorPath(){
//			IWorkbench wb = PlatformUI.getWorkbench();
//			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
//			IWorkbenchPage page = win.getActivePage();
//			IEditorPart part = page.getActiveEditor();
//			
//			if (part.getEditorInput() instanceof FileEditorInput){
//				FileEditorInput fileEditorInput = (FileEditorInput) part.getEditorInput();
//				String path = fileEditorInput.getFile().getFullPath().toString();
//				if (path.endsWith(getFileExtension())){
//					return path;
//				}
//			}
//			
//			return "";
//			
//		}
		
//		public String getActiveEditorName(){
//			IWorkbench wb = PlatformUI.getWorkbench();
//			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
//			IWorkbenchPage page = win.getActivePage();
//			IEditorPart part = page.getActiveEditor();
//			
//			if (part != null && part.getEditorInput() instanceof FileEditorInput){
//				FileEditorInput fileEditorInput = (FileEditorInput) part.getEditorInput();
//				String path = fileEditorInput.getFile().getFullPath().toOSString();
//				if (path.endsWith(getFileExtension())){
//					String fileName = fileEditorInput.getFile().getName();
//					fileName = fileName.substring(0,fileName.length() - getFileExtension().length() + -1);
//					return fileName;
//				}
//			}
//			
//			return "";
//			
//		}
		
//		@Override
//		public Image getImage() {
//			return getPlugin().createImage(getImagePath());
//		}

//		public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
//			String activeEditorName = getActiveEditorName();
//			if (activeEditorName.length() > 0){
//				configuration.rename(newLaunchConfigurationName(activeEditorName));
//				configuration.setAttribute("source", getActiveEditorPath());
//			}
//			
//			PlatformUI.getWorkbench();
//		}

//		protected String newLaunchConfigurationName(String fileName) {
//			
//			if (!launchConfigurationExists(fileName)) return fileName;
//			
//			int i = 1;
//			while (true){
//				String configurationName = fileName + " (" + i + ")";
//				if (!launchConfigurationExists(configurationName)) return configurationName;
//				i++;
//			}
//		}
		
//		private boolean launchConfigurationExists(String name) {
//			ILaunchConfiguration[] cs = new ILaunchConfiguration[]{};
//			try {
//				cs = getLaunchManager().getLaunchConfigurations();
//			}
//			catch (CoreException ex){
//				ex.printStackTrace();
//			}
//			for (int i=0;i<cs.length;i++){
//				ILaunchConfiguration c = cs[i];
//				if (c.getName().equals(name)){
//					return true;
//				}
//			}
//			return false;
//		}
		
//		public void initializeFrom(ILaunchConfiguration configuration) {
//			try {
//				filePath.setText(configuration.getAttribute(getSourceAttributeName(), ""));
//				canSave();
//				updateLaunchConfigurationDialog();
//			} catch (CoreException e) {
//				//Ignore
//			}
//		}
//

//
//		public String getName() {
//			return getTitle();
//		}
//		
//		@Override
//		public boolean canSave(){
//			
//			IFile file = null;
//			
//			try {
//				file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(filePath.getText()));
//			}
//			catch (Exception ex) {
//				// do nothing
//			}
//			
//			if (file == null || !file.exists()){
//				setErrorMessage("Selected file " + filePath.getText() + " does not exist");
//				return false;
//			}
//			else {
//				setErrorMessage(null);
//				return true;			
//			}
//		}
//		
//		public class SelectSourceListener implements Listener{
//			
//			Text text;
//			
//			public SelectSourceListener(Text text) {
//				this.text = text;
//			}
//			
//			public void handleEvent(Event event) {
//				String selected = 
//					BrowseWorkspaceUtil.browseFilePath(getShell(),
//					getSelectionTitle()
//					,getSelectionSubtitle()
//					,getFileExtension()
//					,getPlugin().createImage(getImagePath()));
//				
//				if (selected!=null) text.setText(selected);
//			}
//			
//		}
// 
//		public void modifyText(ModifyEvent e) {
//			canSave();
//			updateLaunchConfigurationDialog();
//		}
//		
//		public abstract EpsilonPlugin getPlugin();
//		
//		public abstract String getImagePath();
//		
//		public abstract String getFileExtension();
//		
//		public abstract String getSelectionTitle();
//		
//		public abstract String getSelectionSubtitle();
//		
//		public abstract void createBottomControl(Composite parent);
//		
//		public String getTitle() {
//			return "Source";
//		}
//		
//		public String getSourceAttributeName() {
//			return "source";
//		}
		
}
