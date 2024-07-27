package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemPage extends BaseTest{
    public ItemPage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    @FindBy (xpath = "//button[@id='add-to-cart']")
    private WebElement addtocartbutton;

    @FindBy (xpath = "//button[@id='back-to-products']")
    WebElement backtoproducts;

    public WebElement getBacktoproducts() {
        return backtoproducts;
    }


    public WebElement getAddtocartbutton() {
        return addtocartbutton;
    }
}
