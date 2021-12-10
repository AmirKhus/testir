//package androidTest;
//import java.util.*;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.openqa.selenium.*;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.JavascriptExecutor;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//public class Main {
//    public static void main(String[] args) {
////        Устанавливаем Android Driver:
//        AndroidDriver<AndroidElement> driver = null;
//
////        Задаем параметры (свойства):
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
////        Имя устройства (найти для реального устройства можно в “Настройки” — “О телефоне”, а для виртуального “Tools” — “AVD Manager” — поле “Name”):
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "MyPhone");
//
////        Cсылка на APK, который нужно будет запускать (.apk должен быть debug сборкой, чтобы вы и appium могли делать inspect приложения):
//        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Appium automation\\APK\\My-debug-Apk.apk");
//        try {
//            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        } catch (MalformedURLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
