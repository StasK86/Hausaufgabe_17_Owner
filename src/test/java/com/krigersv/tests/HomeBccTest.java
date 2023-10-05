package com.krigersv.tests;
import com.krigersv.pages.HomeBccPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

    @Tag("home")
    @Feature("Проверка главной страницы")
    @Owner("Stas")
    public class HomeBccTest extends TestBase {
        HomeBccPage homeBccPage = new HomeBccPage();

    @Test
    @DisplayName("Проверка элементов на главной странице")
    @Severity(SeverityLevel.NORMAL)
    @Link(value = "bcc", url = "https://www.bcc.kz/")
    void checkListElements() {
        Allure.step("Открытие страницы сайта", () ->
                homeBccPage.openPage());
        Allure.step("Проверка элементов из списка 'Актуальное'", () ->
                homeBccPage.checkMenuPanelExist(random.baseSection));
    }
}

