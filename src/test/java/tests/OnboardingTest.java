package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class OnboardingTest extends TestBase {
    @Test
    @DisplayName("Проверка на эмуляторе онбординга")
    void OnboardingScreenTest() {

            step("1 страница онбординга", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("The Free Encyclopedia …in over 300 languages"));
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).
                    shouldHave(text("We’ve found the following on your device:"));
            $(AppiumBy.id("org.wikipedia.alpha:id/addLangContainer")).
                    $(AppiumBy.className("android.widget.TextView"))
                    .shouldHave(text("ADD OR EDIT LANGUAGES"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).
                    shouldHave(text("SKIP"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).
                    shouldHave(text("CONTINUE"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

            step("2 страница онбординга", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("New ways to explore"));
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).
                    shouldHave(text("Dive down the Wikipedia rabbit hole with a constantly updating Explore feed. " +
                            "Customize the feed to your interests – whether it’s learning about historical events On this day, or rolling the dice with Random."));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).
                    shouldHave(text("SKIP"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).
                    shouldHave(text("CONTINUE"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

            step("3 страница онбординга", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("Reading lists with sync"));
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).
                    shouldHave(text("You can make reading lists from articles you want to read later, even when you’re offline.\n" +
                            "Login to your Wikipedia account to sync your reading lists. Join Wikipedia"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).
                    shouldHave(text("SKIP"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).
                    shouldHave(text("CONTINUE"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

            step("4 страница онбординга", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")).
                    shouldHave(text("Send anonymous data"));
            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView")).
                    shouldHave(text("Help make the app better by letting us know how you use it. Data collected is anonymous. Learn more"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).
                    shouldHave(text("GET STARTED"));
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });
    }
}