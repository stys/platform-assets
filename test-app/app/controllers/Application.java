package controllers;

import com.stys.platform.assets.Assets;
import com.stys.platform.assets.AssetsService;
import play.mvc.*;
import views.html.*;

import javax.inject.Inject;

public class Application extends Controller {

    /** This forces DI container to create an instance */
    @Inject
    private Assets assets;

    public Result index() {
        return ok(index.render());
    }

}
