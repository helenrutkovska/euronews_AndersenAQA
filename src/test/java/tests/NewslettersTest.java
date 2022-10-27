package tests;

import jdk.jpackage.internal.Log;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.ContactPage;
import pages.MainPage;
import pages.NewslettersPage;
import pages.SuccessfulSubscriptionPage;
import utils.WebDriverSetup;

public class NewslettersTest extends BaseTest {
    WebDriverSetup wds = new WebDriverSetup();
    WebDriver driver = wds.driverSettings();
    private static String expectedTitle = "Latest breaking news available as free video on demand | Euronews";
    private static String homePage = "https://www.euronews.com/";
    private static String expectedPhoneNumberOfficeInParis = "Tel: +(33) 1 53 96 50 11";
    MainPage mainPage = new MainPage(driver);
    NewslettersPage newslettersPage = new NewslettersPage(driver);
    SuccessfulSubscriptionPage successfulSubscriptionPage = new SuccessfulSubscriptionPage(driver);
    ContactPage contactPage = new ContactPage(driver);

    @Test
    public void NewslettersTestPositive() {
        driver.get(homePage);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(mainPage.isDisplayed());
        Log.info("The Main Page is loaded");

        mainPage.clickSubmitAgreement();
        mainPage.clickNewsletters();
        Assert.assertTrue(newslettersPage.isDisplayed());
        Log.info("The Newsletters Page is loaded");

        newslettersPage.clickBriefingPlanPreview();
        newslettersPage.clickClosePreview();

        newslettersPage.chooseBriefingSubscriptionPlan();
        newslettersPage.enterEmail();
        newslettersPage.clickSubmit();

        successfulSubscriptionPage.thankYouFormDisplayed();
    }

    @Test
    public void NewsletterSignUpTestNegative() {
        driver.get(homePage);
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

    @Test
    public void ThreeNewsletterPlansSignUpTestPositive() {
        driver.get(homePage);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(mainPage.isDisplayed());

        mainPage.clickSubmitAgreement();
        mainPage.clickNewsletters();
        Assert.assertTrue(newslettersPage.isDisplayed());

        newslettersPage.chooseTheWatchSubscriptionPlan();
        newslettersPage.chooseBriefingSubscriptionPlan();
        newslettersPage.chooseGreenSubscriptionPlan();
        Assert.assertTrue(newslettersPage.isChosenTheWatchPlan());
        Assert.assertTrue(newslettersPage.isChosenBriefingPlan());
        Assert.assertTrue(newslettersPage.isChosenGreenPlan());

        newslettersPage.enterEmail();
        newslettersPage.clickSubmit();

        successfulSubscriptionPage.thankYouFormDisplayed();
    }

    @Test
    public void ContactInfoTestPositive() {
        driver.get(homePage);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(mainPage.isDisplayed());

        mainPage.clickSubmitAgreement();
        mainPage.clickContact();
        Assert.assertTrue(contactPage.isDisplayed());

        contactPage.clickOfficeInParis();
        String actualPhoneNumberOfficeInParis = contactPage.getPhoneNumberOfficeInParis();
        Assert.assertEquals(actualPhoneNumberOfficeInParis, expectedPhoneNumberOfficeInParis);
    }
}
