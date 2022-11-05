package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static pages.PageLocators.*;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = AGREE_BUTTON)
    public WebElement agreeButton;

    @FindBy(xpath = NEWSLETTER_MENU_LiNK)
    public WebElement newsletterMenuLink;

    @FindBy(xpath = MAIN_CONTENT)
    public WebElement mainContent;

    @FindBy(xpath = CONTACT_MENU_LINK)
    public WebElement contactMenuLink;

    public void clickSubmitAgreement() {
        driver.findElement((By) agreeButton).click();
    }

    public void clickNewsletters() {
        driver.findElement((By) newsletterMenuLink).click();
    }

    public boolean isDisplayed() {
        driver.findElement((By) mainContent).isDisplayed();
        return true;
    }

    public void clickContact() {
        driver.findElement((By) contactMenuLink).click();
    }
}
