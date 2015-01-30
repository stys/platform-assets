package assets;

import play.Play;

/**
 * Makes assets pluggable
 * Usage: @assets.Assets.at('path/to/asset')
 */
public class Assets {
	
	// Instance of assets router plugin
	private static AssetsPlugin plugin;
	
	// Get asset url
	public static String at(String file) {

		// Check if plugin already set
		if( null == plugin ) {
			// Try to get
			plugin = Play.application().plugin(AssetsPlugin.class);
			// If not registered
			if (null == plugin) {
				// Default implementation
				plugin = new DefaultAssetsPlugin(Play.application());
			}
		}
		
		// Get url from plugin
		return plugin.url(file);
	}

}
