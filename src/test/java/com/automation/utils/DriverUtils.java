package com.automation.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class DriverUtils {
    static AppiumDriver driver;
    //static AndroidDriver driver;
    public static void createLocalDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", ConfigReader.getProperty("platform.name"));
        capabilities.setCapability("appium:automationName", ConfigReader.getProperty("automation.name"));
        capabilities.setCapability("deviceName", ConfigReader.getProperty("device.name"));
        capabilities.setCapability("appium:app", ConfigReader.getProperty("apk.name"));

        driver = new AppiumDriver(capabilities);
        //driver = new AndroidDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    public static void createBSDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("userName",ConfigReader.getProperty("browserstack.userName"));
        browserstackOptions.put("accessKey",ConfigReader.getProperty("browserstack.accessKey"));
        browserstackOptions.put("projectName", ConfigReader.getProperty("project.name"));
        browserstackOptions.put("buildName", ConfigReader.getProperty("build.name"));
        //browserstackOptions.put("appiumVersion","2.4.1");

        capabilities.setCapability("bstack:options", browserstackOptions);
        capabilities.setCapability("platformName", ConfigReader.getProperty("platform.name"));
        capabilities.setCapability("platformVersion", ConfigReader.getProperty("platform.version"));
        capabilities.setCapability("deviceName", ConfigReader.getProperty("bs.device.name"));
        capabilities.setCapability("app", ConfigReader.getProperty("bs.app.url"));


        URL url = new URL(ConfigReader.getProperty("bs.url"));
        driver = new AppiumDriver(url, capabilities);
        //driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    public static AppiumDriver getDriver(){
        return driver;
    }
    //public static AndroidDriver getDriver(){
    //    return driver;
    //}
    public static void main(String[] args){
        //ConfigReader.loadProperties();
        System.out.println(System.getProperty("os.name"));
    }

}
