package tests;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSetup;

public class BaseTest {

    @After
    public void AfterTest() {
        WebDriverSetup wds = new WebDriverSetup();
        WebDriver driver = wds.driverSettings();
        driver.quit();
    }
}
