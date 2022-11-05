package pages;

import org.openqa.selenium.WebDriver;

import static pages.PageLocators.*;

public class ContactPage {
    private WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean isDisplayed(String ) {
        driver.findElement(CONTACT_FORM).isDisplayed();
        return true;
    }

    public void clickOfficeInParis() {
        driver.findElement(OFFICE_PARIS_BUTTON).click();
    }

    public String getPhoneNumberOfficeInParis() {
        return driver.findElement(OFFICE_PARIS_PHONE).getText();
    }
}
