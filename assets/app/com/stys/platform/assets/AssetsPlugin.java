package com.stys.platform.assets;

import play.Plugin;

public abstract class AssetsPlugin extends Plugin {

	public abstract String url(String file);
	
}
