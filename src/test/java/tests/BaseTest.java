package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSetup;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverSetup wds = new WebDriverSetup();
        WebDriver driver = wds.driverSettings();
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
