package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){this.driver = driver;}
    private By userName = By.id("user-name"); // Поле логина
    private By passWord = By.id("password"); // Поле пароля
    private By btnLogin = By.id("login-button"); // Кнопка входа
    // Метод ввода логина,пароля и клика на кнопку входа
    public void setUsername(String username) {driver.findElement(userName).sendKeys(username);}
    public void setPassword(String password) {driver.findElement(passWord).sendKeys(password);}

    public void clickSignInButton() {driver.findElement(btnLogin).click();}
    public void login (String username, String password){
        setUsername(username);
        setPassword(password);
        clickSignInButton();
    }
}
