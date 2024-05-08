package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class SearchPage extends BasePage{
    @FindBy (id = "com.expedia.bookings:id/uds_toolbar_title")
    WebElement header;
    @FindBy(id="com.expedia.bookings:id/search_src_text")
    WebElement searchBox;
    @FindBy(id="com.expedia.bookings:id/suggestion_text_container")
    WebElement firstSuggestion;

    @FindBy (xpath = "//android.widget.TextView[@text='Select dates']/preceding-sibling::android.widget.EditText")
    WebElement selectDatesField;

    @FindBy (xpath = "//android.widget.EditText[contains(@text, \"traveler\")]")
    WebElement travelersField;
    @FindBy(id="com.expedia.bookings:id/date_picker_start_date_title")
    WebElement startDatePickerField;
    @FindBy(id="com.expedia.bookings:id/date_picker_end_date_title")
    WebElement endDatePickerField;
    @FindBy(id="com.expedia.bookings:id/confirmButton")
    WebElement datesDoneBtn;
    @FindBy(id="com.expedia.bookings:id/uds_toolbar_title")
    WebElement travelersHeader;
    @FindBy(xpath="//android.widget.ImageButton[@content-desc=\"Increment number of Adults\"]")
    WebElement incrementAdultsBtn;
    @FindBy(id="com.expedia.bookings:id/done_button")
    WebElement travelersDoneBtn;

    String dateXpath = "//android.widget.TextView[@content-desc=\"XXXXX, Not Selected\"]";

    @FindBy (id = "com.expedia.bookings:id/search_btn")
    WebElement searchBtn;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Back\"]/parent::android.view.View/parent::android.view.View/following-sibling::android.widget.TextView")
    WebElement locationHeader;
    public void enterCity(String s){
        searchBox.sendKeys(s);
        firstSuggestion.click();
    }
    public boolean isDatesScreen(){
        return startDatePickerField.isDisplayed() && endDatePickerField.isDisplayed();
    }
    public void enterDate(String string){
        driver.findElement(By.xpath(dateXpath.replace("XXXXX",string))).click();
    }
    public void clickDoneBtnDates(){
        datesDoneBtn.click();
    }
    public void clickTravelers(){
        travelersField.click();
    }
    public boolean isTravelersScreen() {
        return travelersHeader.getAttribute("text").equals("Travelers");
    }
    public void addOneAdult(){
        incrementAdultsBtn.click();
    }
    public void clickDoneBtnTravelers(){
        travelersDoneBtn.click();
    }
    public void clickSearchBtn(){
        searchBtn.click();
    }

    public void clickDatesField() {
        selectDatesField.click();
    }
}
