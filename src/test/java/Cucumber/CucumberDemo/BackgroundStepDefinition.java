package Cucumber.CucumberDemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundStepDefinition
{
	@Given("^Browser must be present in the system$")
	public void browser_must_be_present_in_the_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Chrome is installed");
	}

	@When("^user opens the application in the browser$")
	public void user_opens_the_application_in_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Open TestMe URL in Chrome");
	}

	@Then("^Testme opens in the browser$")
	public void testme_opens_in_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User in TestMe page");
	}

	@Given("^User must be already registered$")
	public void user_must_be_already_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User have valid credentials");
	}

	@When("^user enters the correct credential$")
	public void user_enters_the_correct_credential() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enter the credentials in login page");
	}

	@Then("^user must be in the home page$")
	public void user_must_be_in_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User in TestMe home page");
	}

	@Given("^user must have search option$")
	public void user_must_have_search_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enter a product in search box");
	}

	@When("^search for the product with name$")
	public void search_for_the_product_with_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User search a product");
	}

	@Then("^searched product detail must be displayed in page$")
	public void searched_product_detail_must_be_displayed_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user has been displayed product page");
	}

}
