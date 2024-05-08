package com.automation.steps;

import com.automation.pages.ChosenStayPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ChosenStaySteps {
    ChosenStayPage chosenStayPage = new ChosenStayPage();

    @Then("verify in location field {string} is present")
    public void verify_in_location_field_is_present(String s1) {
        Assert.assertTrue("incorrect flight", chosenStayPage.isChosenStayScreenDisplayed(ConfigReader.getProperty(s1)));
    }

    @Then("verify there is more than one stay card on screen")
    public void verify_there_is_more_than_one_stay_card_on_screen() {
        Assert.assertTrue("less than 1 card displayed", chosenStayPage.isMoreThanOne());
    }
}
