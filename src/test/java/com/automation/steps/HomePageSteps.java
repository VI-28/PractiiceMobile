package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Given("user opens application")
    public void user_opens_application() {
        homePage.openApplication();
    }

    @Then("verify user is on home screen")
    public void verify_user_is_on_home_screen() {
        Assert.assertTrue("user is not on home page",homePage.isHomePageDisplayed());
    }

    @When("user clicks on Flights menu")
    public void user_clicks_on_flights_menu() {
        homePage.clickOnFlightBtn();
    }
    @When("user clicks on Stays menu")
    public void user_clicks_on_stays_menu() {
        homePage.clickOnStayBtn();
    }

}
