package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSubmitAgreement() {
        driver.findElement(By.xpath("//button[@id='didomi-notice-agree-button']")).click();
    }

    public void clickNewsletters() {
        driver.findElement(By.xpath("//li[@class='c-internal-links__item']//a[@aria-label='Newsletters']")).click();
    }

    public boolean isDisplayed() {
        driver.findElement(By.xpath("//main[@id='enw-main-content']")).isDisplayed();
        return true;
    }
}
