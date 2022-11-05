package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.PageLocators.*;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSubmitAgreement() {
        driver.findElement(AGREE_BUTTON).click();
    }

    public void clickNewsletters() {
        driver.findElement(NEWSLETTER_MENU_LiNK).click();
    }

    public boolean isDisplayed() {
        driver.findElement(MAIN_CONTENT).isDisplayed();
        return true;
    }

    public void clickContact() {
        driver.findElement(CONTACT_MENU_LINK).click();
    }
}
