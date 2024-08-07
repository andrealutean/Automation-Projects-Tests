package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage{

    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    //locators
    By phonesLocator = By.cssSelector("a[onclick=\"byCat('phone')\"]");
    By laptopsLocator = By.cssSelector("a[onclick=\"byCat('notebook')\"]");
    By monitorsLocator = By.cssSelector("a[onclick=\"byCat('monitor')\"]");
    By logoLocator = By.cssSelector("a[class=\"navbar-brand\"]");


    //WebElements
    WebElement phones = _driver.findElement(phonesLocator);
    WebElement laptops = _driver.findElement(laptopsLocator);
    WebElement monitors = _driver.findElement(monitorsLocator);
    WebElement logo = _driver.findElement(logoLocator);

    //Methods
    public PhonesPage OpenPhonesCategory() throws InterruptedException {
        Thread.sleep(2000);
        phones.click();

        return new PhonesPage(_driver);
    }

    public LaptopsPage OpenLaptopsCategory() throws InterruptedException {
        Thread.sleep(4000);
        laptops.click();

        return new LaptopsPage(_driver);
    }

    public MonitorsPage OpenMonitorsCategory(){
        monitors.click();

        return new MonitorsPage(_driver);
    }

    public void backToHomepage(){
        logo.click();
    }
}
