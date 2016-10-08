package com.stys.platform.assets;

import javax.inject.Singleton;
import javax.inject.Inject;

/** Pluggable assets routing for templates
 *
 * Add global template import in build.sbt:
 * `TwirlKeys.templateImports += "com.stys.platform.assets.Assets"`
 *
 * In twirl templates use as usual `@Assets.at('path/to/asset')`.
 *
 */
@Singleton
public class Assets {

	// Instance of assets service
	private static AssetsService service;

    // Inject service implementation in constructor
    @Inject
    public Assets(AssetsService service) {
        Assets.service = service;
    }

	// Get asset url
	public static String at(String file) {
		return Assets.service.url(file);
	}

}
