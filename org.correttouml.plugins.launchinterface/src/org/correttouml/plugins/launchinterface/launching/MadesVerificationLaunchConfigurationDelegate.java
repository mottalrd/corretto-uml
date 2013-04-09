package org.correttouml.plugins.launchinterface.launching;

import java.io.File;

import org.correttouml.uml2zot.UML2Zot;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

public class MadesVerificationLaunchConfigurationDelegate implements
		ILaunchConfigurationDelegate {

	//private static final Logger LOGGER = Logger.getLogger(MadesVerificationLaunchConfigurationDelegate.class); 
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		/** The UML2ZOT entry point for making the transformation */
		
		/** Taken from MadesVerificationLaunchConfigurationAttributes **/
		String path_to_model=configuration.getAttribute(MadesVerificationLaunchConfigurationAttributes.PATH_TO_MODEL, "");
		String timebound=configuration.getAttribute(MadesVerificationLaunchConfigurationAttributes.TIME_BOUND, "");
		String zot_location=configuration.getAttribute(MadesVerificationLaunchConfigurationAttributes.ZOT_LOCATION, "");
		String plugin=configuration.getAttribute(MadesVerificationLaunchConfigurationAttributes.PLUGIN, "");
		String solver=configuration.getAttribute(MadesVerificationLaunchConfigurationAttributes.SOLVER, "");
		String output_folder=configuration.getAttribute(MadesVerificationLaunchConfigurationAttributes.OUTPUT_FOLDER, "");
		
		UML2Zot t=new UML2Zot(new File(path_to_model).getAbsolutePath());	
		
//		IWorkspace workspace = ResourcesPlugin.getWorkspace();  
//		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		
		//LOGGER.info("Generate the ZOT File");
		t.generateZOTFile(Integer.parseInt(timebound), plugin, solver, new File(output_folder, "zot_model.lisp").getAbsolutePath());
		
		//LOGGER.info("Generate the Mappings File");
		t.generateMappingsFile(new File(output_folder,"model.mappings"));
		
	}

	
	

}
