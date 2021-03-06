package com.stys.platform.assets;


import play.api.Configuration;
import play.api.Environment;
import play.api.inject.Binding;
import play.api.inject.Module;
import scala.collection.Seq;

public class CustomizedUrlAssetsModule extends Module {
    @Override
    public Seq<Binding<?>> bindings(Environment environment, Configuration configuration) {
        return seq(
            bind(AssetsService.class).to(CustomizedUrlAssetsService.class)
        );
    }
}
