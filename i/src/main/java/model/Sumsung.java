package model;

import interfaces.AudiProvider;
import interfaces.InternetProvider;
import interfaces.WifiProvider;

public class Sumsung implements AudiProvider, InternetProvider, WifiProvider {

    @Override
    public String getAudiType() {
        return "Динамик S-56";
    }

    @Override
    public String getInternetType() {
        return "4G";
    }

    @Override
    public String getWifiType() {
        return "567-g-678";
    }

}
