package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

class AmazonCart {
    @Test
    void AmazonCart () {
        Configuration.holdBrowserOpen = true;

        //Open Amazon
        open("https://www.amazon.com");

        //Find Kindle products
        $(byName("field-keywords")).setValue("Kindle").pressEnter();
        //  Open Fire 7 Tablet page
        $(byPartialLinkText("Fire 7 Tablet")).click();
        // Tap on Add to Shopping Cart button
        $("#add-to-cart-button").click();
        // Tap Continue button
        // $(byId("a-autoid-32")).click();
        // $("#a-autoid-32").click();
        $(".abb-intl-continue").click();
        
        $("#huc-v2-order-row-with-divider").shouldHave(text("Added to Cart"));

        $(".hlb-view-cart-announce").click(); // click Cart
        
        $("#sc-active-cart").shouldHave(text("Fire 7 Tablet"));
    }
}
