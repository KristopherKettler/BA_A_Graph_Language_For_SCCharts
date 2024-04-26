package  info.scce.cinco.product.scchart;

import java.util.ArrayList;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.jabc.cinco.meta.runtime.IStartup;

public class Activator extends AbstractUIPlugin {
	// The plug-in ID
		public static final String PLUGIN_ID = "info.scce.cinco.product.scchart"; //$NON-NLS-1$
		
		/*
		 * (non-Javadoc)
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
		 */
		public void start(BundleContext context) throws Exception {
			System.out.println("GETTING ACTIVATED");
			super.start(context);
			
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			
			IExtensionPoint startuppoint = registry
					.getExtensionPoint("de.jabc.cinco.meta.runtime.startup");
			IExtension[] startupextensions = startuppoint.getExtensions();
			ArrayList<IStartup> startups = loadStartups(context,startupextensions);
			
			executeStartups(startups);
			
		}

		private void executeStartups(ArrayList<IStartup> startups) {
			for(IStartup startup:startups) {
				try {
					startup.startup();
				}catch(Exception e ) {
					RuntimeException ie = new RuntimeException(String.format("Could not execute %s",startup.getClass().getName() ),e);
					ie.printStackTrace();
				}
			}
		}
		
		private ArrayList<IStartup> loadStartups(BundleContext context,IExtension[] extensions){
			ArrayList<IStartup> startups = new ArrayList<>();
			for(IExtension extension : extensions) {
				System.out.println(extension.getLabel());
				for(IConfigurationElement i: extension.getConfigurationElements()) {
					
					if(i.getAttribute("cincoProductID").equals(PLUGIN_ID)) {
						
						String fqcn = i.getAttribute("class");
						System.out.println(fqcn);
						try {
							Class<?> clazz = context.getBundle().loadClass(fqcn);
							startups.add((IStartup)clazz.getConstructors()[0].newInstance());
						}catch(Exception e){
							Exception ie = new Exception(String.format("Could not load %s",fqcn),e);
							ie.printStackTrace();
						}
					}
				}
			}
			return startups;
		}
			

		/*
		 * (non-Javadoc)
		 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
		 */
		public void stop(BundleContext context) throws Exception {
			super.stop(context);
		}
}

