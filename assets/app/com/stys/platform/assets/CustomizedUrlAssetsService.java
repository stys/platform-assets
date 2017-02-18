package com.stys.platform.assets;

import play.Application;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class CustomizedUrlAssetsService implements AssetsService {

    private static final String CONFIGURATION_ASSETS_URL_TEMPLATE_KEY = "com.stys.platform.assets.url.template";

    private String assetsUrlTemplate;

    @Inject
    public CustomizedUrlAssetsService(Application application) {
        this.assetsUrlTemplate = application.configuration().getString(CONFIGURATION_ASSETS_URL_TEMPLATE_KEY);
    }

    @Override
    public String url(String file) {
        return String.format(this.assetsUrlTemplate, file);
    }

}
