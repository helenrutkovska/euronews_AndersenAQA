package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pages.PageLocators.*;

public class SuccessfulSubscriptionPage {
    private WebDriver driver;

    public SuccessfulSubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean thankYouFormDisplayed() {
        driver.findElement(THANKYOU_FORM).isDisplayed();
        return true;
    }
}
