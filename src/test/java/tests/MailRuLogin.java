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

        // Open Mail.ru
        open("https://mail.ru/");

        // Insert user's login
        $(byName("login")).setValue("Mail").pressEnter();

        // Insert user's password
        $(byName("password")).setValue("Password").pressEnter();
    }
}