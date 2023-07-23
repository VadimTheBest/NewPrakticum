package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Products {
    private WebDriver driver;
    public  Products(WebDriver driver) {this.driver = driver;}
    private final By BtnAddToCard = By.xpath("//*[@class='inventory_item'][1]//button[text()='Add to cart']"); // Кнопка добавления в корзину Товара из первой карточки
   private final By BtnBasket = By.cssSelector("a[class='shopping_cart_link']"); // Корзина
    // Методы клика по кнопкам
    public void clicBtnAddToCard() {driver.findElement(BtnAddToCard).click();} // Клик кнопки добавления в корзину
    public void clicBtnBasket() {driver.findElement(BtnBasket).click();} // Клик кнопки открытия корзины
}




