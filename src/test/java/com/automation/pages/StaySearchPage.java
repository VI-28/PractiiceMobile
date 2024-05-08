package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StaySearchPage extends SearchPage{


    public boolean isStaySearchPageDisplayed() {
        return header.getAttribute("text").equals("Stays");
    }

    public boolean isEnterDestinationScreenDisplayed() {
        return searchBox.getAttribute("text").contains("Enter destination");
    }


}
