import Pages.BasePage;
import Pages.HeaderPage;
import Pages.SignUpPopUpPage;
import org.apache.hc.core5.http.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(testName = "SignUp test", description = "SignUp test - create new user")
public class SignUpTests extends BaseTest {

    @Test
    public void SignUpTest() throws InterruptedException {
        //define pages
        BasePage basePage = new BasePage(driver);
        SignUpPopUpPage signUpPopUpPage;

        String username = "testUser" + random.nextInt(1900000, 9999999);
        String password = "test";

        //act
        basePage.GoTo(Config.Url);
        signUpPopUpPage = new SignUpPopUpPage(driver);
        signUpPopUpPage.SignUp();
        signUpPopUpPage.CreateNewUser(username, password);

        //assert

        Assert.assertTrue(signUpPopUpPage.SignUpSuccessful());
    }
}
