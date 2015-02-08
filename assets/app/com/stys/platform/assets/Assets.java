package com.stys.platform.assets;

import play.Play;

/**
 * Make assets routing pluggable
 * Usage: @Assets.at('path/to/asset')
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
				throw new IllegalStateException("Class extending AssetsPlugin is not declared in play.plugins");
			}
		}
		
		// Get url from plugin
		return plugin.url(file);
	}

}
