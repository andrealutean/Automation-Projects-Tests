package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftMenu {
    public LeftMenu(ChromeDriver driver) {
        PageFactory.initElements(driver,this);
    }
    // meniu principal
    @FindBy(xpath = "//div[@class='navbar-aux-content__departments']")
    private WebElement produse;

    @FindBy(xpath = "//span[contains(text(),'Laptop, Tablete & Telefoane')]")
    private WebElement laptopTableteTelefoane;

    @FindBy(xpath = "//span[contains(text(),'PC, Periferice & Software')]")
    private WebElement PCPerifericeSoftware;

    @FindBy(xpath = "//span[contains(text(),'TV, Audio-Video & Foto')]")
    private WebElement TVAudioVideoFoto;

    @FindBy(xpath = "//span[contains(text(),'Electrocasnice & Climatizare')]")
    private WebElement ElectrocasniceClimatizare;

    @FindBy(xpath = "//span[contains(text(),'Gaming, Carti & Birotica')]")
    private WebElement GamingCartiBirotica;

    @FindBy(xpath = "//span[contains(text(),'Bacanie')]")
    private WebElement Bacanie;

    @FindBy(xpath = "//span[contains(text(),'Fashion')]")
    private WebElement Fashion;

    @FindBy(xpath = "//span[contains(text(),'Ingrijire personala & Cosmetice')]")
    private WebElement IngrijirepersonalaCosmetice;

    @FindBy(xpath = "//span[contains(text(),'Casa, Gradina & Bricolaj')]")
    private WebElement CasaGradinaBricolaj;

    @FindBy(xpath = "//span[contains(text(),'Sport & Travel')]")
    private WebElement SportTravel;

    @FindBy(xpath = "//span[contains(text(),'Auto, Moto  & RCA')]")
    private WebElement AutoMotoRCA;

    @FindBy(xpath = "//span[contains(text(),'Jucarii, Copii & Bebe')]")
    private WebElement JucariiCopiiBebe;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-block js-accept gtm_h76e8zjgoo']")
    private WebElement acceptall;

    @FindBy (xpath = "//button[@class='close']//i[@class='em em-close']")
    private WebElement closepromo;

    public WebElement getClosepromo() {
        return closepromo;
    }

    public WebElement getAcceptall() {
        return acceptall;
    }

    public WebElement getProduse() {
        return produse;
    }

    public WebElement getLaptopTableteTelefoane() {
        return laptopTableteTelefoane;
    }

    public WebElement getPCPerifericeSoftware() {
        return PCPerifericeSoftware;
    }

    public WebElement getTVAudioVideoFoto() {
        return TVAudioVideoFoto;
    }

    public WebElement getElectrocasniceClimatizare() {
        return ElectrocasniceClimatizare;
    }

    public WebElement getGamingCartiBirotica() {
        return GamingCartiBirotica;
    }

    public WebElement getBacanie() {
        return Bacanie;
    }

    public WebElement getFashion() {
        return Fashion;
    }

    public WebElement getIngrijirepersonalaCosmetice() {
        return IngrijirepersonalaCosmetice;
    }

    public WebElement getCasaGradinaBricolaj() {
        return CasaGradinaBricolaj;
    }

    public WebElement getSportTravel() {
        return SportTravel;
    }

    public WebElement getAutoMotoRCA() {
        return AutoMotoRCA;
    }

    public WebElement getJucariiCopiiBebe() {
        return JucariiCopiiBebe;
    }
}
