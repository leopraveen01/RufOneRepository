package com.test.stepdefintion;

import java.io.IOException;

import com.test.baseclass.LibGlobal;
import com.test.pom.FindFlightPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindFlights extends LibGlobal {

	@Given("Launch blaze demo url")
	public void launch_blaze_demo_url() {
	getChromeDriver();
	launchUrl("https://blazedemo.com/");
	}

	@Given("Get screenshot for blaze demo home page")
	public void get_screenshot_for_blaze_demo_home_page() throws IOException {
		getScreenShot("HomePAge");
	}

	@When("Choose {string} and {string}")
	public void choose_and(String Departure, String Destination) {
FindFlightPOM find=new FindFlightPOM();
find.selectSourceAndDest(Departure, Destination);
	}

	@When("Check enable of Find flight button and click")
	public void check_enable_of_Find_flight_button_and_click() {
		FindFlightPOM find=new FindFlightPOM();
		find.findFlightButtonClickWithValidation();

	}

	@Then("Validate next page navicated or not")
	public void validate_next_page_navicated_or_not() {
		
	}

	


}
