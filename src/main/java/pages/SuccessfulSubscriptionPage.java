package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulSubscriptionPage {
    private WebDriver driver;

    public SuccessfulSubscriptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean thankYouFormDisplayed() {
        driver.findElement(By.xpath("//div[@id='additional-data-modal']")).isDisplayed();
        return true;
    }
}
