package com.automation.steps;

import com.automation.pages.FlightSearchPage;
import com.automation.pages.SearchPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FlightSearchSteps {
    FlightSearchPage flightSearchPage= new FlightSearchPage();
    SearchPage searchPage = new SearchPage();
    @Then("verify user is on Flights search screen")
    public void verify_user_is_on_flights_search_screen() {
        Assert.assertTrue("user is not on Flights Search page",flightSearchPage.isFlightSearchPageDisplayed());
    }

    @When("user clicks on Flying from field")
    public void user_click_on_flying_from_field() {
        flightSearchPage.clickFlyingFromField();
    }

    @Then("verify user is on Flying from screen")
    public void verify_user_is_on_flying_from_screen() {
        Assert.assertTrue("user is not on Flying to screen",flightSearchPage.isFlyingFromScreenDisplayed());
    }

    @When("user enters Flying from {string}")
    public void user_enters_flying_from(String string) {
        searchPage.enterCity(ConfigReader.getProperty(string));
    }

    @Then("verify user is on Flying to screen")
    public void verify_user_is_on_flying_to_screen() {
        Assert.assertTrue("user is not on Flying to screen",flightSearchPage.isFlyingToScreenDisplayed());
    }

    @When("user enters Flying to {string}")
    public void user_enters_flying_to(String string) {
        searchPage.enterCity(ConfigReader.getProperty(string));
    }

    @Then("verify user is on dates screen")
    public void verify_user_is_on_dates_screen() {
        Assert.assertTrue("user is not on dates screen", flightSearchPage.isDatesScreen());
    }

    @When("user selects date {string}")
    public void user_selects_date(String string) {
        flightSearchPage.enterDate(ConfigReader.getProperty(string));
    }

    @When("user clicks on Dates Done button")
    public void user_clicks_on_dates_done_button() {
        flightSearchPage.clickDoneBtnDates();
    }

    @When("user clicks on Travelers")
    public void user_clicks_on_travelers() {
        flightSearchPage.clickTravelers();
    }

    @Then("verify user is on travelers screen")
    public void verify_user_is_on_travelers_screen() {
        Assert.assertTrue("user is not on travelers screen", flightSearchPage.isTravelersScreen());
    }

    @When("user increases adults by one")
    public void user_increases_adults_by_one() {
        flightSearchPage.addOneAdult();
    }

    @When("user clicks on Travelers Done button")
    public void user_clicks_on_travelers_done_button() {
        flightSearchPage.clickDoneBtnTravelers();
    }

    @When("user clicks on Preferred class")
    public void user_clicks_on_preferred_class() {
        flightSearchPage.clickPreferredClass();
    }

    @When("user chooses business class")
    public void user_chooses_business_class() {
        flightSearchPage.chooseBusinessClass();
    }

    @When("user clicks on Class Done button")
    public void user_clicks_on_class_done_button() {
        flightSearchPage.clickDoneBtnClass();
    }

    @When("user clicks on Search button")
    public void user_clicks_on_search_button() {
        flightSearchPage.clickSearchBtn();
    }

    @Then("verify user gets an error message with text")
    public void verify_user_gets_an_error_message_with_text(String s) {
        Assert.assertTrue(flightSearchPage.isErrorAlertDisplayed());
        Assert.assertTrue(flightSearchPage.isMessageExact(s));
    }

    @When("user clicks on done button on alert")
    public void userClicksOnDoneButtonOnAlert() {
        flightSearchPage.closeError();
    }
}
