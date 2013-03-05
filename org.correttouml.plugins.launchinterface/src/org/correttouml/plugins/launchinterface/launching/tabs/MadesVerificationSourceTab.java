package org.correttouml.plugins.launchinterface.launching.tabs;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class MadesVerificationSourceTab extends AbstractSourceConfigurationTab implements ModifyListener{

	protected Text verProjectNameText;
	protected Text outputLocation;
	protected Button checkButton;	
	
	@Override
	public void createBottomControl(final Composite parent) {
		Group verProjectGroup = new Group(parent, SWT.NONE);
		GridLayout controlLayout = new GridLayout(3,false);
		verProjectGroup.setLayout(controlLayout);
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		verProjectGroup.setLayoutData(gd);
		verProjectGroup.setText("Configure the generated verification project");		
		new Label(verProjectGroup, SWT.NONE).setText("Project Name:");
		verProjectNameText = new Text(verProjectGroup, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint =300;
		gd.horizontalSpan=2;
		verProjectNameText.setLayoutData(gd);
		verProjectNameText.addModifyListener(this);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
	}
	
	@Override
	public String getFileLabel() {
		return "UML Model";
	}
	
	public  String getImagePath(){
		return "icons/project.gif";
		
	}
	
	public  String getFileExtension(){
		return "uml";
	}
	
	public  String getSelectionTitle(){
		return "Select the UML model to verify";
	}
	
	public  String getSelectionSubtitle(){
		return "UML models in the Workspace";
	}
	public String getLaunchConfigurationKey() {
		return "SOURCE.UML";
	}
	
	@Override
	public String getTitle() {
		return "Verification Project Configuration";
	}
	
	@Override
	public void modifyText(ModifyEvent e) {
		canSave();
		updateLaunchConfigurationDialog();
	}
	
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
//		
//		super.performApply(configuration);
//		if(canSave()){	
//			configuration.setAttribute(MadesVerificationLaunchConfigurationAttributes.VERIFICATION_PROJECT_NAME, (String)verProjectNameText.getText());
//			configuration.setAttribute(MadesVerificationLaunchConfigurationAttributes.SOURCE,filePath.getText());
//		}
	}
	
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
//		super.initializeFrom(configuration);
//		try {
//			verProjectNameText.setText(configuration.getAttribute(MadesVerificationLaunchConfigurationAttributes.VERIFICATION_PROJECT_NAME, ""));
//			canSave();
//			updateLaunchConfigurationDialog();
//		} 
//		catch (CoreException e) {
//		}
	}
	
	@Override
	public boolean canSave(){
		super.canSave();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for( IProject p : root.getProjects()){
			if(p.getName().equalsIgnoreCase(verProjectNameText.getText())){
				setErrorMessage("Project " + verProjectNameText.getText() + " already exists.");
				return false;
			}
		}
		return true;
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
