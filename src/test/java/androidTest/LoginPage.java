package androidTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(id = "com.vkontakte.android:id/login_button")
    private WebElement loginButton;

    @FindBy(id = "com.vkontakte.android:id/email_or_phone")
    private WebElement loginInput;

    @FindBy(id = "com.vkontakte.android:id/vk_password")
    private WebElement passwdBtn;


    @FindBy(id = "com.vkontakte.android:id/continue_btn")
    private WebElement vhodBtn;


    public void clickLogin() {
        loginButton.click(); }


    public void inputLogin(String login) {
        loginInput.sendKeys(login); }
    /**
     * метод для ввода пароля
     */
    public void inputPasswd(String passwd) {
        passwdBtn.sendKeys(passwd); }
    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickLoginBtn() {
        vhodBtn.click(); }

//    public void clickVhodBtn() {
//        clickVhodBtn.click(); }
}
