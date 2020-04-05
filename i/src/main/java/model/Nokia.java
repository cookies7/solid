package model;

import interfaces.AudiProvider;

public class Nokia implements AudiProvider {

    @Override
    public String getAudiType() {
        return "Динамик 56G-78";
    }

}
