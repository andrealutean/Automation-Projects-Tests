package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends BaseTest{
    public MenuPage(ChromeDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement menubutton;

    @FindBy(xpath = "//a[@id='inventory_sidebar_link']")
    private WebElement allitemsbutton;

    @FindBy(xpath = "//a[@id='about_sidebar_link']")
    private WebElement aboutbutton ;

    @FindBy(xpath = "//a[@id='reset_sidebar_link']")
    private WebElement resetappbutton ;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement logoutbutton;

    @FindBy (xpath="//button[@id='react-burger-cross-btn']")
    private WebElement closebutton;

    public WebElement getClosebutton() {
        return closebutton;
    }

    public WebElement getMenubutton() {
        return menubutton;
    }

    public WebElement getAllitemsbutton() {
        return allitemsbutton;
    }

    public WebElement getAboutbutton() {
        return aboutbutton;
    }

    public WebElement getResetappbutton() {
        return resetappbutton;
    }

    public WebElement getLogoutbutton() {
        return logoutbutton;
    }
}
