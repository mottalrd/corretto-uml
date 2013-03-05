package org.correttouml.plugins.launchinterface.launching;

import java.io.File;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.correttouml.uml2zot.*;

public class MadesVerificationLaunchConfigurationDelegate implements
		ILaunchConfigurationDelegate {

	//private static final Logger LOGGER = Logger.getLogger(MadesVerificationLaunchConfigurationDelegate.class); 
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		/** The UML2ZOT entry point for making the transformation */
		String path_to_model=configuration.getAttribute("PATH_TO_MODEL", "");
		UML2Zot t=new UML2Zot(new File(path_to_model).getAbsolutePath());
		
		//LOGGER.info("Testing "+path_to_model);
		
		//LOGGER.info("Generate the ZOT File");
		t.generateZOTFile(new File("C:/Users/motta/Desktop/tmp/zot_model.lisp").getAbsolutePath());
		//LOGGER.info("Generate the Mappings File");
		t.generateMappingsFile(new File("C:/Users/motta/Desktop/tmp/model.mappings"));
		
	}

	
	

}
