package com.automation.steps;

import com.automation.pages.FlightSearchPage;
import com.automation.pages.SearchPage;
import com.automation.pages.StaySearchPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StaySearchSteps {
    StaySearchPage staySearchPage = new StaySearchPage();
    SearchPage searchPage = new SearchPage();

    @Then("verify user is on Enter destination screen")
    public void verify_user_is_on_enter_destination_screen() {
        Assert.assertTrue("user is not on enter destination screen", staySearchPage.isEnterDestinationScreenDisplayed());
    }

    @When("user enters {string}")
    public void user_enters(String string) {
        searchPage.enterCity(ConfigReader.getProperty(string));
    }

    @Then("verify user is on Stays screen")
    public void verify_user_is_on_stays_screen() {
        Assert.assertTrue("user is not on Stays screen",staySearchPage.isStaySearchPageDisplayed());
    }

    @When("user clicks on select dates field")
    public void user_clicks_on_select_dates_field() {
        searchPage.clickDatesField();
    }

}
