package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpMenu {
    public UpMenu(ChromeDriver driver) {
        PageFactory.initElements(driver,this);
    }


    @FindBy (xpath = "//a[@data-test-id='1092']")
    private WebElement GeniusDealsBtn;

    @FindBy (xpath = "//a[@data-test-id='1258']")
    private WebElement EasyBuyBackBtn;

    @FindBy (xpath = "//a[@data-test-id='1300']")
    private WebElement RablaBtn;

    @FindBy (xpath = "//a[@data-test-id='938']")
    private WebElement GeniusBtn;

    @FindBy (xpath = "//a[@data-test-id='1343']")
    private WebElement ResigilateBtn;

    @FindBy (xpath = "//a[@data-test-id='1104']")
    private WebElement OferteleEmagBtn;

    @FindBy (xpath = "//input[@id='searchboxTrigger']")
    private WebElement searchbar;

    public WebElement getSearchbar() {
        return searchbar;
    }

    public WebElement getGeniusDealsBtn() {
        return GeniusDealsBtn;
    }

    public WebElement getEasyBuyBackBtn() {
        return EasyBuyBackBtn;
    }

    public WebElement getRablaBtn() {
        return RablaBtn;
    }

    public WebElement getGeniusBtn() {
        return GeniusBtn;
    }

    public WebElement getResigilateBtn() {
        return ResigilateBtn;
    }

    public WebElement getOferteleEmagBtn() {
        return OferteleEmagBtn;
    }
}
