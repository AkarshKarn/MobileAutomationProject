package MobileDeviceApps;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {

    public AndroidDriver androidDriver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","vivo 1951");
        desiredCapabilities.setCapability("udid","3641277c");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.android.bbkcalculator");

        desiredCapabilities.setCapability("appActivity","com.android.bbkcalculator.Calculator");
        desiredCapabilities.setCapability("platformVersion","11.0");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }


    @Test(priority = 1)
    public void additionMethod(){
        WebElement firstElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("8"));
        firstElement.click();
        WebElement plusElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("加"));

        plusElement.click();
        WebElement secondElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("9"));
        secondElement.click();
        WebElement equalElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("等于"));
        equalElement.click();
    }
    @Test(priority = 2)
    public void subMethod(){
        WebElement firstElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("3"));
        firstElement.click();
        WebElement secondElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("9"));
        secondElement.click();
        WebElement minusElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("减"));
        minusElement.click();
        WebElement thirdElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("7"));
        thirdElement.click();
        WebElement equalElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("等于"));
        equalElement.click();
    }

    @Test(priority = 3)
    public void MultiplyMethod(){
        WebElement firstElement= androidDriver.findElement(new AppiumBy.ByAccessibilityId("2"));
        firstElement.click();
        WebElement multiplyElement= androidDriver.findElement(new AppiumBy.ByAccessibilityId("乘"));
        multiplyElement.click();
        WebElement secondElement= androidDriver.findElement(new AppiumBy.ByAccessibilityId("5"));
        secondElement.click();
        WebElement resultElement= androidDriver.findElement(new AppiumBy.ByAccessibilityId("等于"));
        resultElement.click();
    }

    @Test(priority = 4)
    public void divMethod() {
        WebElement firstElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("1"));
        firstElement.click();
        WebElement secondElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("4"));
        secondElement.click();
        WebElement thirdElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("4"));
        thirdElement.click();
        WebElement divElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("除"));
        divElement.click();
        WebElement fourthElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("1"));
        fourthElement.click();
        WebElement fifthElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("2"));
        fifthElement.click();
        WebElement resultElement = androidDriver.findElement(new AppiumBy.ByAccessibilityId("等于"));
        resultElement.click();
    }

    @AfterClass
    public void teardown(){
        //close the app
        androidDriver.quit();
    }

}
