package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static pages.PageLocators.*;

public class SuccessfulSubscriptionPage {
    private WebDriver driver;

    public SuccessfulSubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = THANKYOU_FORM)
    public WebElement thankyouForm;

    public boolean thankYouFormDisplayed() {
        driver.findElement((By) thankyouForm).isDisplayed();
        return true;
    }
}
