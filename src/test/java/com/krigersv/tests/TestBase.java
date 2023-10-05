package com.krigersv.tests;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.krigersv.config.WebConfig;
import com.krigersv.config.WebProvider;
import com.krigersv.helpers.Attach;
import com.krigersv.utils.GeneratorTest;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;



public class TestBase {

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void afterEach() {
        Attach.screenShotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLog();
        Attach.addVideo();

        Selenide.closeWebDriver();
    }
    GeneratorTest random = new GeneratorTest();
    private static final WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());


        @BeforeAll
        static void beforeAll() {
            WebProvider webProvider = new WebProvider(config);
            webProvider.webConfiguration();
        }

}
