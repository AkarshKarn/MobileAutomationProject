package Calculator;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class calculator {
    public AndroidDriver androidDriver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");

        desiredCapabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("platformVersion","9.0");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }


    @Test
    public void additionMethod(){
        WebElement firstElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_5"));
        firstElement.click();
        WebElement plusElement = androidDriver.findElement(By.id("com.android.calculator2:id/op_add"));
        plusElement.click();
        WebElement secondElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_3"));
        secondElement.click();
        WebElement equalElement = androidDriver.findElement(By.id("com.android.calculator2:id/eq"));
        equalElement.click();
    }
    @Test
    public void subMethod(){
        WebElement firstElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_5"));
        firstElement.click();
        WebElement plusElement = androidDriver.findElement(By.id("com.android.calculator2:id/op_sub"));
        plusElement.click();
        WebElement secondElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_3"));
        secondElement.click();
        WebElement equalElement = androidDriver.findElement(By.id("com.android.calculator2:id/eq"));
        equalElement.click();
    }

    @Test
    public void MultiplyMethod(){
        WebElement firstElement= androidDriver.findElement(By.id("com.android.calculator2:id/digit_7"));
        firstElement.click();
        WebElement multiplyElement= androidDriver.findElement(By.id("com.android.calculator2:id/op_mul"));
        multiplyElement.click();
        WebElement secondElement= androidDriver.findElement(By.id("com.android.calculator2:id/digit_9"));
        secondElement.click();
        WebElement resultElement= androidDriver.findElement(By.id("com.android.calculator2:id/eq"));
        resultElement.click();
    }

    @Test
    public void divMethod() {
        WebElement firstElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_1"));
        firstElement.click();
        WebElement secondElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_1"));
        secondElement.click();
        WebElement thirdElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_1"));
        thirdElement.click();
        WebElement divElement = androidDriver.findElement(By.id("com.android.calculator2:id/op_div"));
        divElement.click();
        WebElement fourthElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_1"));
        fourthElement.click();
        WebElement fifthElement = androidDriver.findElement(By.id("com.android.calculator2:id/digit_1"));
        fifthElement.click();
        WebElement resultElement = androidDriver.findElement(By.id("com.android.calculator2:id/eq"));
        resultElement.click();
    }

    @AfterClass
    public void teardown(){
        //close the app
        androidDriver.quit();
    }
}


