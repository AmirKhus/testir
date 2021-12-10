package androidTest;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlackWhileTemaPage {
    public WebDriver driver;
    public BlackWhileTemaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(id = "com.vkontakte.android:id/menu_settings")
    private WebElement clickSetting;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Открыть меню\"]")
    private WebElement openMenu;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView")
    private WebElement clickStile;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]/android.widget.TextView")
    private WebElement clickBlackStile;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.TextView")
    private WebElement clickWhileStile;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Закрыть экран\"]")
    private WebElement ckiclBackMenu;

    private WebElement swipeMenu;

    @FindBy(id = "com.vkontakte.android:id/logout")
    private WebElement ckiclExitAccaunt;

    @FindBy(id = "android:id/button1")
    private WebElement exsapt;

    public void clickSetting() {
        clickSetting.click(); }

    public void openMenu() {
        openMenu.click(); }

    public void clickStile() {
        clickStile.click(); }

    public void clickBlackStile() {
        clickBlackStile.click(); }

    public void clickWhileStile() {
        clickWhileStile.click(); }

    public void ckiclBackMenu() {
        ckiclBackMenu.click(); }

}
