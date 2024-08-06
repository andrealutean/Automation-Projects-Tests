package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MonitorsPage extends HomePage{
    public MonitorsPage(WebDriver driver) {
        super(driver);
    }

    //locators
    public By MonitorLocator(String monitorName){

        return By.xpath("//h4[@class=\"card-title\"]/a[contains(text(), '" + monitorName + "')]");
    }

    //WebElements
    WebElement monitor = _driver.findElement(MonitorLocator("ASUS FULL HD"));

    //Methods
    public ProductPage ClickOnMonitor(WebElement element){
        monitor.click();

        return new ProductPage(_driver);
    }
}
