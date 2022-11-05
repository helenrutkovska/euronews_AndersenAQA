package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static pages.PageLocators.*;

public class NewslettersPage {
    private WebDriver driver;

    public NewslettersPage(WebDriver driver) {
        this.driver = driver;
    }

    public static String email;
    public static String title;

    public void clickBriefingPlanPreview() {
        driver.findElement(SELECT_NEWSLETTER).click();
    }

    public void clickClosePreview() {
        driver.findElement(By.cssSelector("div[id='the-briefing_previews'] a[class='btn-secondary mt-6 mx-auto']")).click();
    }

    public void chooseBriefingSubscriptionPlan() {
        driver.findElement(BRIEFING_PLAN).click();
    }

    public void enterEmail() {
        driver.findElement(By.xpath("//input[@title='Enter your email']")).sendKeys("a@gmail.com");
    }

    public void clickSubmit() {
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
    }

    public void clickTheWatchPlanPreview() {
        driver.findElement(By.xpath("//a[@href='#the-watch_previews']")).click();
    }

    public void chooseTheWatchSubscriptionPlan() {
        driver.findElement(By.xpath("//label[@for='34422'][normalize-space()='Select this newsletter']")).click();
    }

    public boolean isDisplayed() {
        driver.findElement(By.xpath("//div[@class='wp-site-blocks']")).isDisplayed();
        return true;
    }

    public void chooseGreenSubscriptionPlan() {
        driver.findElement(GREEN_PLAN).click();
    }

    public boolean isChosenBriefingPlan() {
        driver.findElement(BRIEFING_PLAN).isDisplayed();
        return true;
    }

    public boolean isChosenTheWatchPlan() {
        driver.findElement(WATCH_PLAN).isDisplayed();
        return true;
    }

    public boolean isChosenGreenPlan() {
        driver.findElement(GREEN_PLAN).isDisplayed();
        return true;
    }
}
