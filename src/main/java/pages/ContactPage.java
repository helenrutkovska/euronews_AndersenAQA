package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    private WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayed() {
        driver.findElement(By.xpath("//form[@id='form_contact']")).isDisplayed();
        return true;
    }

    public void clickOfficeInParis() {
        driver.findElement(By.xpath("//button[normalize-space()='Paris']")).click();
    }

    public String getPhoneNumberOfficeInParis() {
        return driver.findElement(By.xpath("//div[@id='bannerR'])/*[contains(text(), 'Tel.')]")).getText();
    }
}
