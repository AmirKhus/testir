package androidTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;


public class AndroidTest {
    public static LoginPage loginPage;
    public static MoveAppPage moveAppPage;
    public static BlackWhileTemaPage blackWhileTemaPage;
    public static ExitAccauntPage exitAccauntPage;
    public AndroidDriver driver;
    @BeforeClass
    public void setup() throws MalformedURLException {
        //определение пути до драйвера и его настройка
//        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
//        driver = new ChromeDriver();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        // iPhone Simulator, iPad Simulator, iPhone Retina 4-inch, Android Emulator, Galaxy S4 и т.д.
        // На iOS, это должно быть одно  из допустимых устройств. На Android эта возможность в настоящее время игнорируется,
        // но параметр является обязательным
//        capabilities.setCapability("deviceName", "pixel");
        // Имя ОС на мобильном устройстве
        capabilities.setCapability("platformName", "Android");
        // Версия ОС
        capabilities.setCapability("platformVersion", "9.0");
        // Уникальный индефикатор подключенного устройства
        capabilities.setCapability("device", "emulator-5554");
        // Java-пакет Android приложения, которое мы хотим запустить. (APK info)
        capabilities.setCapability("appPackage", "com.vkontakte.android");
        // Имя activity которые мы хотим запустить из пакета, указанного выше. (APK info)
        capabilities.setCapability("appActivity", "com.vkontakte.android.MainActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        moveAppPage = new MoveAppPage(driver);
        blackWhileTemaPage = new BlackWhileTemaPage(driver);
        exitAccauntPage = new ExitAccauntPage(driver);
//        //задержка на выполнение теста = 50 сек.
    }
    @Test
    public void aloginTest() throws InterruptedException {
        //получение доступа к методам класса LoginPage для взаимодействия с элементами страницы
        //значение login/password берутся из файла настроек по аналогии с chromedriver
        //и loginpage
        //вводим логин
        loginPage.clickLogin();
        driver.findElementById("com.google.android.gms:id/cancel").click();
//        loginPage.loginknopka();
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        //вводим пароль
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
//        Thread.sleep(5000);
    }
    @Test
    public void bmovePage() throws InterruptedException {
//        Thread.sleep(20000);
        moveAppPage.clickSMS();
//        loginPage.loginknopka();
        moveAppPage.swipe(driver);
    }


    @Test
    public void cblackWhileTemaTest() {
        blackWhileTemaPage.openMenu();
        blackWhileTemaPage.clickSetting();
        blackWhileTemaPage.clickStile();
        blackWhileTemaPage.clickBlackStile();
        blackWhileTemaPage.clickWhileStile();
        blackWhileTemaPage.ckiclBackMenu();

    }

    @Test
    public void dexitAccauntTest() {
        exitAccauntPage.swipeMenu(driver);
        exitAccauntPage.ckiclExitAccaunt();
        exitAccauntPage.exsapt();
    }

    @AfterClass
    public void tearDown() {
        driver.quit(); }
}
