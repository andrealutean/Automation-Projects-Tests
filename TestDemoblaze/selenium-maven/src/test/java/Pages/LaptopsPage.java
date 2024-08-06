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
    WebElement laptop = _driver.findElement(LaptopLocator("Sony vaio i5"));

    //Methods
    public ProductPage ClickOnLaptop(WebElement element){
        laptop.click();

        return new ProductPage(_driver);
    }
}
