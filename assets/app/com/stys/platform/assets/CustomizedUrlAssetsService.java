package com.stys.platform.assets;

import play.Configuration;
import javax.inject.Inject;

public class CustomizedUrlAssetsService implements AssetsService {

    private static final String CONFIGURATION_ASSETS_URL_TEMPLATE_KEY = "com.stys.platform.assets.url.template";

    private Configuration configuration;

    private String assetsUrlTemplate;

    @Inject
    public CustomizedUrlAssetsService(Configuration configuration) {
        this.configuration = configuration;
        this.assetsUrlTemplate = configuration.getString(CONFIGURATION_ASSETS_URL_TEMPLATE_KEY);
    }

    @Override
    public String url(String file) {
        return String.format(this.assetsUrlTemplate, file);
    }

}
