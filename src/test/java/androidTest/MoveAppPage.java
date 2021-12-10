package androidTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MoveAppPage {
    public AndroidDriver driver;
    public MoveAppPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath=  "//android.widget.FrameLayout[@content-desc=\"Мессенджер\"]/android.widget.ImageView")
    private WebElement SMSButton;

//    @FindBy(id = "com.vkontakte.android:id/email_or_phone")
//    private WebElement loginInput;
//
//    @FindBy(id = "com.vkontakte.android:id/vk_password")
//    private WebElement passwdBtn;
//
//
//    @FindBy(id = "com.vkontakte.android:id/continue_btn")
//    private WebElement vhodBtn;


    public void clickSMS() {
        SMSButton.click(); }


    public void swipe(AndroidDriver driver) {
        new TouchAction(driver)
                .press(PointOption.point(475, 1969))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(548, 1067))
                .release().perform();
        new TouchAction( driver)
                .press(PointOption.point(334, 1769))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(341, 1959))
                .release().perform();}
//    /**
//     * метод для ввода пароля
//     */
//    public void inputPasswd(String passwd) {
//        passwdBtn.sendKeys(passwd); }
//    /**
//     * метод для осуществления нажатия кнопки входа в аккаунт
//     */
//    public void clickLoginBtn() {
//        vhodBtn.click(); }
}
