package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ChosenFlightPage extends BasePage{
    @FindBy(id="com.expedia.bookings:id/location")
    List<WebElement> location;
    @FindBy(id="com.expedia.bookings:id/card_content_area")
    List<WebElement> cards;
    public boolean isChosenFlightScreenDisplayed(String s1, String s2){
        int counter =0;
        for(int i=0; i<location.size(); i++){
           if( location.get(i).getText().contains(s1) &&
                   location.get(i).getText().contains(s2)){
               counter++;
           }
        }
        return counter==location.size();
    }
    public boolean isMoreThanOne(){
        return cards.size() > 1;
    }
}
