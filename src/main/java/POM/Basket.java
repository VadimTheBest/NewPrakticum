package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basket {
    private WebDriver driver;
    public  Basket(WebDriver driver) {this.driver = driver;}
    private final By BtnCheckout = By.id("checkout");
    public void clicBtnCheckout() {driver.findElement(BtnCheckout).click();}
}
