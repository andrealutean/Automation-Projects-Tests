package tests;

import driver.BrowserConfig;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class BaseTest {
    public Actions actions;

    protected ChromeDriver driver = null;

    @BeforeClass
    public void init(){
        driver = BrowserConfig.getChromeDriver();
    }

    /*@AfterClass(alwaysRun = true)
    public void afterMethod(){
        if(driver !=null) {
            driver.quit();
        }
    }*/

    protected FluentWait<ChromeDriver> getWait(ChromeDriver driver){
        return new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(StaleElementReferenceException.class);



       /* CU INSTANTIERE, e mai mult cod dar mai vizibil

        FluentWait<ChromeDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(500));
        return wait; */
    }




}
