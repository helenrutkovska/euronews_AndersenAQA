package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static pages.PageLocators.*;

public class ContactPage {
    private WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = CONTACT_FORM)
    public WebElement contactForm;

    @FindBy(xpath = OFFICE_PARIS_BUTTON)
    public WebElement officeParisButton;

    @FindBy(xpath = OFFICE_PARIS_PHONE)
    public WebElement officeParisPhone;

    public boolean isDisplayed() {
        driver.findElement((By) contactForm).isDisplayed();
        return true;
    }

    public void clickOfficeInParis() {
        driver.findElement((By) officeParisButton).click();
    }

    public String getPhoneNumberOfficeInParis() {
        return driver.findElement((By) officeParisPhone).getText();
    }
}
