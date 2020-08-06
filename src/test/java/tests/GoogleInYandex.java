package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class GoogleInYandex {
    @Test
    void OpenGoogleInYandex () {
        Configuration.holdBrowserOpen = true;

        // Open Yandex
        open("https://www.yandex.ru");

        // Search 'Google'
        $(byName("text")).setValue("Google").pressEnter();

        // Open Google
        $("#search-result a[href='https://www.google.ru/']").click();
        
        $(byName("q")).shouldBe(visible, enabled));
    }
}
