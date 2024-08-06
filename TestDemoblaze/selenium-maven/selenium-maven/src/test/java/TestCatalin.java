import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCatalin extends BaseTest{
    @Test
    public void SignUpButtonTest() throws InterruptedException {
        //locatori
        String signUpButton = "signin2";
        String insereazaUsername = "//input[@id=\"sign-username\"]";
        String insereazaParola = "//input[@id=\"sign-password\"]";
        String signUpInterior = "//button[text()=\"Sign up\"]";

        //deschide si navigheaza pe browser
        driver.navigate().to("https://www.demoblaze.com/");

        //elemente
        WebElement signUp = driver.findElement(By.id(signUpButton));
        WebElement username = driver.findElement(By.xpath(insereazaUsername));
        WebElement password = driver.findElement(By.xpath(insereazaParola));
        WebElement signUpInInt = driver.findElement(By.xpath(signUpInterior));

        //interior SignUp
        signUp.click();
        username.click();
        username.sendKeys("catalinandrei");
        Thread.sleep(1000);
        password.click();
        password.sendKeys("catalin123");
        Thread.sleep(1000);
        signUpInInt.click();
        Thread.sleep(4000);

        Assert.assertTrue(1==1);
    }

}
