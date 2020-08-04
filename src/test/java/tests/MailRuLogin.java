package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class MailRuLogin {
    @Test
    void Login () {
        Configuration.holdBrowserOpen = true;

        open("https://mail.ru/");
        $(byName("login")).setValue("Mail").pressEnter();
        $(byName("password")).setValue("Password").pressEnter();
    }
}