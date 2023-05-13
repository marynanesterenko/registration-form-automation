package com.automation.two;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.*;
import static org.testng.Assert.assertFalse;

public class LoginSteps {
    WebPage webPageObject;

    // TODO initialize this class
    // pre-condition
    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        webPageObject = new WebPage();
        webPageObject.navigate("login");
        assertTrue(true, "Navigating to login page");
        assertFalse(false, "Invalid page");
    }

    // condition (USER action)
    @When("I enter a valid username {string} with more than {int} characters")
    // parameters are dynamic
    public void i_enter_a_valid_username_with_more_than_characters(String usernameParameter, Integer numOfChars) {
        webPageObject.enterUsername(usernameParameter);
        assertTrue(webPageObject.enterUsername(usernameParameter));
        assertTrue(usernameParameter.length() >= numOfChars);
    }

    // condition (USER action)
    @When("I enter a valid password {string} with more than {int} characters")
    public void i_enter_a_valid_password_with_more_than_characters(String passwordParameter, Integer numOfChars) {
        assertTrue(webPageObject.enterPassword(passwordParameter), "user enters invalid password");
        assertTrue(passwordParameter.length() >= numOfChars);
    }

    // condition (USER action)
    @When("I submit the form")
    // normally inside the "when" we do not have any assertions
    public void i_submit_the_form() {
        webPageObject.submit();
    }

    // action (AUT action)
    @Then("I am registered and logged in")
    // here we always have to have an action
    // we have the most critical assertions
    public void i_am_registered_and_logged_in() {
        assertTrue(webPageObject.isLoggedIn(), "User is logged in");
    }

    // condition (USER action)
    @When("I enter an invalid username {string} with less than {int} characters")
    public void i_enter_an_invalid_username_with_less_than_characters(String string, Integer int1) {
        assertFalse(webPageObject.enterUsername(string));
    }

    // action (AUT action)
    @Then("I see the error message {string}")
    public void i_see_the_error_message(String string) {
        assertEquals(webPageObject.getErrorMessage(), string);
    }

    @When("I enter an invalid password {string} with less than {int} characters")
    public void i_enter_an_invalid_password_with_less_than_characters(String string, Integer int1) {
        assertFalse(webPageObject.enterPassword(string));
    }

    @When("I login using valid credentials")
    public void i_login_using_valid_credentials() {
        webPageObject.enterUsername("username");
        webPageObject.enterPassword("password1");
        webPageObject.submit();
    }

    @Then("I see login status {string}")
    public void i_see_login_status(String string) {
        webPageObject.isLoggedIn();
        assertEquals(webPageObject.getLoginStatus(), string);
    }

    @When("I click on the logout button")
    public void i_click_on_the_logout_button() {
        webPageObject.logout();
    }

    @Then("I am logged out")
    public void i_am_logged_out() {
        assertFalse(webPageObject.logout(), "User is logging out");
    }
    //Process finished with exit code 1
}
