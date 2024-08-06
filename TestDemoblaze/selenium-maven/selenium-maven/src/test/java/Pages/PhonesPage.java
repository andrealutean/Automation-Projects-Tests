package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhonesPage extends HomePage{
    public PhonesPage(WebDriver driver) {
        super(driver);
    }

    //locators
    public By PhoneLocator(String phoneName){

        return By.xpath("//h4[@class=\"card-title\"]/a[contains(text(), '" + phoneName + "')]");
    }

    //WebElements
    WebElement phone;

    //Methods
    public ProductPage ClickOnPhone(String phoneName){
        phone = _driver.findElement(PhoneLocator(phoneName));
        phone.click();

        return new ProductPage(_driver);
    }
}
