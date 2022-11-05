package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static pages.PageLocators.*;

public class NewslettersPage {
    private WebDriver driver;

    public NewslettersPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String email = EMAIL;
    public static String title;

    @FindBy(xpath = SELECT_NEWSLETTER)
    public WebElement selectNewsletter;

    @FindBy(xpath = CLOSE_PREVIEW)
    public WebElement closePreview;

    @FindBy(css = BRIEFING_PLAN)
    public WebElement briefingPlan;

    @FindBy(xpath = EMAIL_FIELD)
    public WebElement emailField;

    @FindBy(xpath = SUBMIT_BUTTON)
    public WebElement submitButton;

    @FindBy(xpath = WATCH_PLAN_PREVIEW)
    public WebElement watchPlanPreview;

    @FindBy(xpath = WATCH_SUBSCRIPTION_PLAN)
    public WebElement watchSubscriptionPlan;

    @FindBy(xpath = GREEN_SUBSCRIPTION_PLAN)
    public WebElement greenSubscriptionPlan;

    @FindBy(xpath = NEWSLETTER_BLOCK)
    public WebElement siteBlock;

    @FindBy(xpath = WATCH_PLAN)
    public WebElement watchPlan;

    @FindBy(xpath = GREEN_PLAN)
    public WebElement greenPlan;

    public void clickBriefingPlanPreview() {
        driver.findElement((By) selectNewsletter).click();
    }

    // watch by.cssselector
    public void clickClosePreview() {
        driver.findElement((By) closePreview).click();
    }

    public void chooseBriefingSubscriptionPlan() {
        driver.findElement((By) briefingPlan).click();
    }

    public void enterEmail() {
        driver.findElement((By) emailField).sendKeys(email);
    }

    public void clickSubmit() {
        driver.findElement((By) submitButton).click();
    }

    public void clickTheWatchPlanPreview() {
        driver.findElement((By) watchPlanPreview).click();
    }

    public void chooseTheWatchSubscriptionPlan() {
        driver.findElement((By) watchSubscriptionPlan).click();
    }

    public boolean isDisplayed() {
        driver.findElement((By) siteBlock).isDisplayed();
        return true;
    }

    public void chooseGreenSubscriptionPlan() {
        driver.findElement((By) greenSubscriptionPlan).click();
    }

    public boolean isChosenBriefingPlan() {
        driver.findElement((By) briefingPlan).isDisplayed();
        return true;
    }

    public boolean isChosenTheWatchPlan() {
        driver.findElement((By) watchPlan).isDisplayed();
        return true;
    }

    public boolean isChosenGreenPlan() {
        driver.findElement((By) greenPlan).isDisplayed();
        return true;
    }
}
