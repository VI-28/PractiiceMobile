package com.automation.steps;

import com.automation.pages.ChosenFlightPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ChosenFlightSteps {
    ChosenFlightPage chosenFlightPage = new ChosenFlightPage();
    @Then("verify in location field {string} and {string} are present")
    public void verify_user_is_on_chosen_flight_screen(String s1, String s2) {
        Assert.assertTrue("incorrect flight", chosenFlightPage.isChosenFlightScreenDisplayed(ConfigReader.getProperty(s1),ConfigReader.getProperty(s2)));
    }

    @Then("verify there is more than one card on screen")
    public void verify_there_is_more_than_one_card_on_screen() {
        Assert.assertTrue("less than 2 card displayed",  chosenFlightPage.isMoreThanOne());
    }
}
