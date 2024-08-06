package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAndCompare {

    public SearchAndCompare(ChromeDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='searchboxTrigger']")
    private WebElement searchbar;

    @FindBy(xpath = "//div[@class='card-v2-toolbox']//button[@data-offer-id='176374406']")
    private WebElement compare1boxbtn;
    @FindBy(xpath = "//div[@class='card-v2-toolbox']//button[@data-offer-id='177159603']")
    private WebElement compare2boxbtn;


    @FindBy(xpath = "//i[@class='em em-check']")
    private WebElement comparebtn;

    public WebElement getComparebtn() {
        return comparebtn;
    }

    public WebElement getCompare1boxbtn() {
        return compare1boxbtn;
    }

    public WebElement getCompare2boxbtn() {
        return compare2boxbtn;
    }

    public WebElement getSearchbar() {
        return searchbar;
    }


}
