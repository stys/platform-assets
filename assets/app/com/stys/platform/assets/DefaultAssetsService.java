package com.stys.platform.assets;


import com.google.inject.Singleton;

@Singleton
public class DefaultAssetsService implements AssetsService {

    @Override
    public String url(String file) {
        return "/public/" + file;
    }

}
