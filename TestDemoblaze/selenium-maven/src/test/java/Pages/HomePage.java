package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //locators
    By phonesLocator = By.cssSelector("a[onclick=\"byCat('phone')\"]");
    By laptopsLocator = By.cssSelector("a[onclick=\"byCat('notebook')\"]");
    By monitorsLocator = By.cssSelector("a[onclick=\"byCat('monitor')\"]");


    //WebElements
    WebElement phones = _driver.findElement(phonesLocator);
    WebElement laptops = _driver.findElement(laptopsLocator);
    WebElement monitors = _driver.findElement(monitorsLocator);


    //Methods
    public PhonesPage OpenPhonesCategory() throws InterruptedException {
        Thread.sleep(2000);
        phones.click();

        return new PhonesPage(_driver);
    }

    public LaptopsPage OpenLaptopsCategory(){
        laptops.click();

        return new LaptopsPage(_driver);
    }

    public MonitorsPage OpenMonitorsCategory(){
        monitors.click();

        return new MonitorsPage(_driver);
    }

}
