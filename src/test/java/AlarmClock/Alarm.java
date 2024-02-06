package AlarmClock;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Alarm {
    public AndroidDriver androidDriver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.google.android.deskclock");

        desiredCapabilities.setCapability("appActivity","com.android.deskclock.DeskClock");
        desiredCapabilities.setCapability("platformVersion","9.0");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }

    @Test
    public void setAlarmMethod() throws IOException {
        WebElement alarm=androidDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/za[1]/android.widget.TextView"));
        alarm.click();
        WebElement switchOff= androidDriver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"8:30 AM Alarm\"]/android.widget.Switch"));
        switchOff.click();
        WebElement clickOnTime= androidDriver.findElement(By.id("com.google.android.deskclock:id/digital_clock"));
        clickOnTime.click();
        WebElement selectHour= androidDriver.findElement(new AppiumBy.ByAccessibilityId("5"));
        selectHour.click();
        WebElement selectMin= androidDriver.findElement(new AppiumBy.ByAccessibilityId("30"));
        selectMin.click();
        WebElement setPm= androidDriver.findElement(By.id("android:id/pm_label"));
        setPm.click();
        WebElement setAm= androidDriver.findElement(By.id("android:id/am_label"));
        setAm.click();
        WebElement clickOk= androidDriver.findElement(By.id("android:id/button1"));
        clickOk.click();
//        WebElement repeatOnOff= androidDriver.findElement(By.id("com.google.android.deskclock:id/repeat_onoff"));
//        repeatOnOff.click();
        WebElement selectDay= androidDriver.findElement(new AppiumBy.ByAccessibilityId("Saturday"));
        selectDay.click();

        TakesScreenshot ss=(TakesScreenshot) androidDriver;
        File StFile = ss.getScreenshotAs(OutputType.FILE);
        File DsFile = new File("C:\\Users\\DELL\\IntelliJIdeaProjects\\MobileAutomationProject\\Screenshot\\ss1");
        FileHandler.copy(StFile, DsFile);

        }
//
    }

