package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

class MarketAddToFavorites {
    @Test
    void MarketFavorites () {
        Configuration.holdBrowserOpen = true;

        // Open Yandex Market
        open("https://market.yandex.ru");

        // Find Apple Watch Products
        $(byName("text")).setValue("Apple Watch").pressEnter();

        // Tap on the first Apple Watch Series 3 product
        $(byPartialLinkText("Часы Apple Watch Series 3")).click();

        // Switch to a window with opened product
        switchTo().window(1);

        // Tap on Add to Favorites
        $(byClassName("_2UmyXf5e76")).click();
    }
}