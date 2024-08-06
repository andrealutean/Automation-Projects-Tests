import Pages.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class E2ETests extends BaseTest{

    private static final Logger log = LoggerFactory.getLogger(E2ETests.class);

    @Test
    public void OrderPhoneAndLaptopTest() throws InterruptedException {
        //define pages
        BasePage basePage = new BasePage(driver);
        LoginPage loginPage;
        HomePage homePage;
        PhonesPage phonesPage;
        LaptopsPage laptopsPage;
        MonitorsPage monitorsPage;
        ProductPage productPage;
        CartPage cartPage;
        PlaceOrderPopUpPage placeOrderPopUpPage;

        String username = "test1901";
        String password = "test1";

        //act
        basePage.GoTo(Config.Url);
        loginPage = basePage.Login();
        loginPage.FillInCredentials(username, password);
        loginPage.ClickLogin();

        //create Homepage object
        homePage = new HomePage(basePage._driver);
        phonesPage = homePage.OpenPhonesCategory();
        productPage = phonesPage.ClickOnPhone(Config.phonesList.get(0));

        productPage.AddToCart();
        //productPage.Home();
        cartPage=homePage.Cart();

        //plaseaza comanda
        cartPage.PlaceOrder();
        placeOrderPopUpPage = new PlaceOrderPopUpPage(driver);
        placeOrderPopUpPage.FillOrderDetails("Selenium","Romania", "Poplace","1234-1234-1234-1234", 5,2025);

        placeOrderPopUpPage.ClickPurchase();
        placeOrderPopUpPage=new PlaceOrderPopUpPage(driver);

        //assert
        Assert.assertTrue(placeOrderPopUpPage.OrderSuccessfulMessageIsDisplayed());
    }
}
