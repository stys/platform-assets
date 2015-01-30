package assets;

import play.Application;
import controllers.routes;

/**
 * Wrapper for the built-in assets controller
 */
public class DefaultAssetsPlugin extends AssetsPlugin {

    /**
     * Plugin constructor should take Play application
     * @param application
     */
    public DefaultAssetsPlugin(Application application) {
        /* Empty */
    }

    /**
     * Delegate to the build-in Assets controller
     * @param file
     * @return
     */
    @Override
    public String url(String file) {
        return routes.Assets.at(file).url();
    }

}
