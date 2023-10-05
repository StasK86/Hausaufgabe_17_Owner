package com.krigersv.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${envi}.properties"
})

public interface WebConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://www.bcc.kz/")
    String baseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser browser();

    @Key("browserSize")
    @DefaultValue("1800x1000")
    String browserSize();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String browserVersion();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("isRemote")
    @DefaultValue("true")
    Boolean isRemote();
}
