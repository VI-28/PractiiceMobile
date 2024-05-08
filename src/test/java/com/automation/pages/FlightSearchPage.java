package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSearchPage extends SearchPage{

    @FindBy (xpath ="//android.widget.TextView[@resource-id=\"com.expedia.bookings:id/udsInputFieldLabel\" and @text=\"Flying from\"]")
    WebElement flyingFromField;
    @FindBy (xpath ="//android.widget.TextView[@resource-id=\"com.expedia.bookings:id/udsInputFieldLabel\" and @text=\"Flying to\"]")
    WebElement flyingToField;
    @FindBy (xpath = "//android.widget.TextView[@text=\"Preferred class\"]")
    WebElement preferredClassField;

    @FindBy(id="com.expedia.bookings:id/business_class")
    WebElement businessClass;
    @FindBy(id="android:id/button1")
    WebElement classDoneBtn;

    @FindBy(id="com.expedia.bookings:id/alertTitle")
    WebElement searchErrorHeader;
    @FindBy(id="android:id/message")
    WebElement errorMessage;

    @FindBy(id="android:id/button1")
    WebElement alertDoneBtn;
    public boolean isFlightSearchPageDisplayed() {
        return header.getAttribute("text").equals("Flights");
    }

    public boolean isFlyingFromScreenDisplayed(){
         return searchBox.getAttribute("text").contains("Flying from");
    }
    public void clickFlyingFromField(){
        flyingFromField.click();
    }
    public boolean isFlyingToScreenDisplayed(){
        return searchBox.getAttribute("text").contains("Flying to");
    }

    public void clickPreferredClass(){
        preferredClassField.click();
    }
    public void chooseBusinessClass(){
        businessClass.click();
    }
    public void clickDoneBtnClass(){
        classDoneBtn.click();
    }

    public boolean isErrorAlertDisplayed(){
        return searchErrorHeader.isDisplayed() && searchErrorHeader.getText().equals("Search Error");
    }
    public boolean isMessageExact(String s){
        return errorMessage.getText().equals(s);
    }
    public void closeError(){
        alertDoneBtn.click();
    }
}
