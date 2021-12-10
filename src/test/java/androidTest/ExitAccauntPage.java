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

public class ExitAccauntPage {
    public WebDriver driver;
    public ExitAccauntPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    private WebElement swipeMenu;

    @FindBy(id = "com.vkontakte.android:id/logout")
    private WebElement ckiclExitAccaunt;

    @FindBy(id = "android:id/button1")
    private WebElement exsapt;

    public void swipeMenu(AndroidDriver driver) {
        new TouchAction( driver)
                .press(PointOption.point(446, 1686))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(443, 917))
                .release().perform();
    }

    public void ckiclExitAccaunt() {
        ckiclExitAccaunt.click(); }

    public void exsapt() {
        exsapt.click(); }
}
