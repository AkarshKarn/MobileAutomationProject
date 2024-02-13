package Chrome;

import com.google.common.collect.ImmutableMultimap;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
//import java.util.concurrent.TimeUnit;formedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class chrome {
    public AndroidDriver androidDriver;
    public Robot robot;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

//        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
//        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        cap.setCapability("chromedriverExecutable","C:\\Users\\DELL\\IntelliJIdeaProjects\\MobileAutomationProject\\src\\test\\emulator\\resources");
        cap.setCapability("chomeOptions", ImmutableMultimap.of("w3c",false));
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void searchProduct() throws InterruptedException {
        androidDriver.get("https://www.amazone.com/");
        Thread.sleep(6000);
        WebElement element = androidDriver.findElement(By.name("k"));
        element.sendKeys("Laptop");
//        element.sendKeys(Keys.ENTER);
    }
}