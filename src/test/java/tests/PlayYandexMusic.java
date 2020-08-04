package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


class PlayYandexMusic {
    @Test
    void YMusic () {
        Configuration.holdBrowserOpen = true;

        // Open Yandex Music page
        open("https://music.yandex.ru/home");

        // Open Most Popular songs playlist
        $(byPartialLinkText("ЧАРТ")).click();

        // Change to Global Most Popular songs playlist
        $(byClassName("d-icon_dropdown")).click();
        $(byText("Глобальный чарт")).click();

        //Play the first track
        $(byClassName("entity-cover__image")).click();
    }
}