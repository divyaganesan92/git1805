package org.stepdef;

import org.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefFB extends BaseClass{
	
	@Given("User is on the Facebook login page")
	public void user_is_on_the_Facebook_login_page() {
		browserLaunch("https://en-gb.facebook.com/");
		System.out.println("Browser Launch");
	}

	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String username, String password) {
		findElementId("email").sendKeys(username);
		findElementId("pass").sendKeys(password);
		System.out.println("Username & password");
	}

//	@When("User should enter the username and password")
//	public void user_should_enter_the_username_and_password() {
//		findElementId("email").sendKeys("xyz");
//		findElementId("pass").sendKeys("xyz@123");
//		System.out.println("Username & password");
//	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		findElementName("login").click();
		System.out.println("Login button clicked");
	}

	@Then("User should verify the success message")
	public void user_should_verify_the_success_message() {
		System.out.println("Successfully entered");
	}
	
}
