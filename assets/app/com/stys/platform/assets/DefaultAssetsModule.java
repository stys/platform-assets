package com.stys.platform.assets;

import play.api.Configuration;
import play.api.Environment;
import play.api.inject.Binding;
import play.api.inject.Module;
import scala.collection.Seq;

public class DefaultAssetsModule extends Module {

    @Override
    public Seq<Binding<?>> bindings(Environment environment, Configuration configuration) {
        return seq(
            bind(Assets.class).toSelf().eagerly(),
            bind(AssetsService.class).to(DefaultAssetsService.class).eagerly()
        );
    }
}
