package WebApplication;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Amazon {
    public AndroidDriver androidDriver;
    public Robot robot;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
    //    desiredCapabilities.setCapability("chromeoption", ImmutableMap.of("w3c",false));

        desiredCapabilities.setCapability("appActivity","com.amazon.mShop.home.HomeActivity");
        desiredCapabilities.setCapability("platformVersion","9.0");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }

    @Test
    public void amazon(){
        WebElement skipSignIn= androidDriver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button"));
        skipSignIn.click();
        WebElement search= androidDriver.findElement(By.id("com.amazon.mShop.android.shopping:id/chrome_search_hint_view"));
        search.sendKeys("Guitar");
        WebElement clickHomepageElement= androidDriver.findElement(By.id("CardInstanceU6hXcgthPEM6J6bdzd-_iA"));
        clickHomepageElement.click();


    }
}
