package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ChosenStayPage extends SearchPage{

    @FindBy(xpath = "//android.view.View[@resource-id=\"SRPCard\"]")
    List<WebElement> cards;
    public boolean isMoreThanOne(){
        return cards.size() > 1;
    }
    public boolean isChosenStayScreenDisplayed(String s1) {
        return locationHeader.getText().contains(s1);
    }
}

