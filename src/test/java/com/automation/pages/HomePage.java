package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(DriverUtils.getDriver(),this);
    }
    @FindBy(xpath ="//android.widget.TextView[@text='Get started']")
    WebElement getStartedBtn;
    @FindBy(xpath ="//android.view.View[@content-desc='Close']")
    WebElement closeBtn;
    @FindBy(id="com.expedia.bookings:id/consentButton")
    WebElement acceptBtn;
    @FindBy(xpath="//android.widget.TextView[@text='Let’s go']")
    WebElement letsGoBtn;

    @FindBy(xpath="//android.widget.TextView[@text=\"Hi, traveler\"]")
    WebElement hiTravelerHeader;
    @FindBy(xpath="//android.widget.TextView[@text=\"Stays\"]")
    WebElement staysBtn;
    @FindBy(xpath="//android.widget.TextView[@text=\"Flights\"]")
    WebElement flightsBtn;

    public void openApplication() {
       clickElement(acceptBtn);
       clickElement(getStartedBtn);
       clickElement(closeBtn);
       clickElement(letsGoBtn);

    }

    public boolean isHomePageDisplayed() {
        return hiTravelerHeader.isDisplayed() && staysBtn.isDisplayed() && flightsBtn.isDisplayed();
    }

    public void clickOnFlightBtn() {
        flightsBtn.click();
    }
    public void clickOnStayBtn() {
        staysBtn.click();
    }
}
