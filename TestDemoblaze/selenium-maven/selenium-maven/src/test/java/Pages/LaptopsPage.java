package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaptopsPage extends HomePage{
    public LaptopsPage(WebDriver driver) {
        super(driver);
    }

    //locators
    public By LaptopLocator(String laptopName){

        return By.xpath("//h4[@class=\"card-title\"]/a[contains(text(), '" + laptopName + "')]");
    }

    //WebElements
    WebElement laptop ;

    //Methods
    public ProductPage ClickOnLaptop(String laptopName){
        laptop = _driver.findElement(LaptopLocator(laptopName));
        laptop.click();

        return new ProductPage(_driver);
    }
}
