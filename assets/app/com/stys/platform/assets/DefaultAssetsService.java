package com.stys.platform.assets;

import javax.inject.Singleton;

@Singleton
public class DefaultAssetsService implements AssetsService {

    @Override
    public String url(String file) {
        return "assets/" + file;
    }

}
