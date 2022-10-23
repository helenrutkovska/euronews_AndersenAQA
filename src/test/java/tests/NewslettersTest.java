package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.NewslettersPage;
import pages.SuccessfulSubscriptionPage;
import utils.WebDriverSetup;

public class NewslettersTest extends BaseTest {
    WebDriverSetup wds = new WebDriverSetup();
    WebDriver driver = wds.driverSettings();
    private static String expectedTitle = "Latest breaking news available as free video on demand | Euronews";
    MainPage mainPage = new MainPage(driver);
    NewslettersPage newslettersPage = new NewslettersPage(driver);
    SuccessfulSubscriptionPage successfulSubscriptionPage = new SuccessfulSubscriptionPage(driver);

    @Test
    public void NewslettersTestPositive() {
        driver.get("https://www.euronews.com/");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(mainPage.isDisplayed());

        mainPage.clickSubmitAgreement();
        mainPage.clickNewsletters();
        Assert.assertTrue(newslettersPage.isDisplayed());

        newslettersPage.clickBriefingPlanPreview();
        newslettersPage.clickClosePreview();

        newslettersPage.chooseBriefingSubscriptionPlan();
        newslettersPage.enterEmail();
        newslettersPage.clickSubmit();

        successfulSubscriptionPage.thankYouFormDisplayed();
    }

    @Test
    public void NewslettersTestNegative() {
        driver.get("https://www.euronews.com/");
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(mainPage.isDisplayed());

        mainPage.clickSubmitAgreement();
        mainPage.clickNewsletters();
        Assert.assertTrue(newslettersPage.isDisplayed());

        newslettersPage.clickTheWatchPlanPreview();
        newslettersPage.clickClosePreview();

        newslettersPage.chooseTheWatchSubscriptionPlan();
        newslettersPage.enterEmail();
        newslettersPage.clickSubmit();

        successfulSubscriptionPage.thankYouFormDisplayed();
    }
}
