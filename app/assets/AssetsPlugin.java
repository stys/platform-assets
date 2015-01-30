package assets;

import play.Plugin;

public abstract class AssetsPlugin extends Plugin {

	public abstract String url(String file);
	
}
