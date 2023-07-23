package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Checkout {
    private WebDriver driver;
    public  Checkout(WebDriver driver) {this.driver = driver;}
    private final By FirstName = By.id("first-name"); // Поле FirstName
    private final By LastName = By.id("last-name"); // Поле LastName
    private final By ZipCode = By.id("postal-code"); // Поле ZipCode
    private final By BtnContinue = By.id("continue"); // Кнопка Continue
    // Медоты заполнения полей FirstName,ZipCode, LastName и клик по кнопке Continue
    public void setFirstNamee(String firstName) {driver.findElement(FirstName).sendKeys(firstName);}
    public void setLastName(String lastName) {driver.findElement(LastName).sendKeys(lastName);}
    public void setLastNameZipCode(String zipcode) {driver.findElement(ZipCode).sendKeys(zipcode);}
    public void checkoutData (String firstName, String  lastName, String zipcode){
        setFirstNamee(firstName);
        setLastName(lastName);
        setLastNameZipCode(zipcode);
        clickSignInButton();
    }
    public void clickSignInButton() {driver.findElement(BtnContinue).click();}
    // Кнопка закрытия заказа
    private final By BtnFinish = By.id("finish");
    public void clickBtnFinish() {driver.findElement(BtnFinish).click();}
}
