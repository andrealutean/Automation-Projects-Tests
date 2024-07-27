package PageObjects;

import driver.BrowserConfigs;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public Actions actions;

    protected ChromeDriver driver = null;

    @BeforeClass
    public void init(){
    driver = BrowserConfigs.getChromeDriver();
    }

  /*  @AfterClass(alwaysRun = true)
    public void afterMethod(){
        if(driver !=null) {
            driver.quit();
        }
    }*/

}
