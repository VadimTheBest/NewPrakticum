import POM.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest{
    private WebDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(" https://www.saucedemo.com");
    }

    @Test
    public void CheckingTheErrorMessageWhenTryingToLoginToANonexistentUser() {
        LoginPage objLoginPage = new LoginPage (driver);
        objLoginPage.login("test", "test");
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",
                driver.findElement(By.xpath("//h3[@data-test='error']")).getText());
    }
    @After
    public void browserClose() {driver.quit();};
}

