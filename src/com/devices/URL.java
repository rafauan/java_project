package com.devices;

public class URL {
    final String app;
    final Double appVersion;
    final String serverAddress;

    public URL(String app, Double appVersion, String serverAddress) {
        this.app = app;
        this.appVersion = appVersion;
        this.serverAddress = serverAddress;
    }
}
