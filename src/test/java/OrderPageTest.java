import POM.LoginPage;
import POM.Products;
import POM.Basket;
import POM.Checkout;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrderPageTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        LoginPage objLoginPage = new LoginPage (driver);
        objLoginPage.login("standard_user", "secret_sauce");
    }
    @Test
    public void CheckingSuccessfulPurchases() {
        Products objProducts = new Products (driver);
        objProducts.clicBtnAddToCard();
        objProducts.clicBtnBasket();
        Basket objBasket = new Basket (driver);
        objBasket.clicBtnCheckout();
        Checkout objCheckout = new Checkout (driver);
        objCheckout.checkoutData("test","test","test");
        objCheckout.clickBtnFinish();
        Assert.assertEquals("https://www.saucedemo.com/checkout-complete.html",
                driver.getCurrentUrl());
        Assert.assertEquals("THANK YOU FOR YOUR ORDER",
                driver.findElement(By.xpath("//h2[@class='complete-header']")).getText());
    }
    @After
    public void browserClose() {driver.quit();};
}
