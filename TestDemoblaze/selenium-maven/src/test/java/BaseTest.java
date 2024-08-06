import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    Random random = new Random();

    /** The driver. */
    protected WebDriver driver;
    protected Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(15))
            .ignoring(NoSuchElementException.class)
            .ignoring(StaleElementReferenceException.class);

    /**
     * Setup.
     */
    @BeforeTest
    protected void setup() {
//		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
        WebDriverManager.chromedriver().setup();
        ChromeOptions ops = new ChromeOptions();
        //ops.addArguments("disable-infobars");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverContext.setDriver(driver);
    }

    /**
     * Wrap up.
     */
    @AfterTest
    public void wrapUp() {
        WebDriverContext.removeDriver();
    }
}
