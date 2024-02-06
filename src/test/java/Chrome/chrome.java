package Chrome;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class chrome {
    public AndroidDriver androidDriver;
    public Robot robot;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.android.chrome");

        desiredCapabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
        desiredCapabilities.setCapability("platformVersion","9.0");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }

    @Test
    public void launchSite() throws InterruptedException {
        androidDriver.get("https://www.amazon.in");
        Thread.sleep(5000);

        WebElement searchTab= androidDriver.findElement(By.id("//input[@id='twotabsearchtextbox']"));
        Thread.sleep(3000);
        searchTab.sendKeys("Iphone");
        Thread.sleep(3000);
        searchTab.sendKeys(Keys.ENTER);



    }
}
