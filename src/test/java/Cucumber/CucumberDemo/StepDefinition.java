package Cucumber.CucumberDemo;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	String str;
	@Given("^when the user prints hello world$")
	public void when_the_user_prints_hello_world() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		str = "Hello World";
	}

	@Then("^hello world displays in console$")
	public void hello_world_displays_in_console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(str);
		}
}
