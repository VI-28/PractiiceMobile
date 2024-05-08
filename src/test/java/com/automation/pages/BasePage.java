package com.automation.pages;

import com.automation.utils.DriverUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public abstract class BasePage {
    public AppiumDriver driver;
    //public AndroidDriver driver;
    public BasePage(){
        driver = DriverUtils.getDriver();
        PageFactory.initElements(driver, this);
    }
    public void clickElement(WebElement element) {
        try{
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            element.click();
        }
        catch(Exception ignored){
        }
        finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        }
    }
}
