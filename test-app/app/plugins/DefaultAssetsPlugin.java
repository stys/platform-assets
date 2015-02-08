package plugins;

import play.Application;
import com.stys.platform.assets.AssetsPlugin;
import controllers.routes;

public class DefaultAssetsPlugin extends AssetsPlugin {

    /**
     * Plugin implementation must declare a constructor with 
	 * single argument of type play.Application
     */
    public DefaultAssetsPlugin(Application application) {
        /* Empty */
    }

    /**
     * Delegate to the build-in Assets controller
     */
    @Override
    public String url(String file) {
        return routes.Assets.at(file).url();
    }
}
