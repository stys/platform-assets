# Pluggable assets routing for Play 2.3.x

Make assets routing pluggable and switch all asset routes at once, without searching and replacing links in
all templates in the project. One example is when public assets are moved to external 
storage or CDN. It is also very useful for testing.

## Setup and usage

### Update `build.sbt`

Add resolver and dependency
```sbt
resolvers += "Snapshots" at "https://raw.github.com/stys/maven-releases/master/"

libraryDependencies ++= Seq(
    "com.stys" %% "platform-assets" % "1.1.0"    
)
```

Add an additional global template import to `build.sbt`
```sbt
TwirlKeys.templateImports += "com.stys.platform.assets.Assets"
```

### Implement plugin

Create an implementation of `AssetsPlugin`. 
Here is a very simple example implementation using Play's built-in Assets controller

```java
package plugins;

import play.Application;
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
```

Add plugin declaration to the `conf/play.plugins`
```
1000:plugins.DefaultAssetsPlugin
```

### Use in templates 

Use it the same way as the built-in `Assets` (drop the `routes` part at the beginning)

```scala

<link rel="stylesheet" href="@Assets.at("path/to/style.css")">

```
 
