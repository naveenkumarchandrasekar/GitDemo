package Cucumber.CucumberDemo;

import cucumber.api.java.en.When;

public class ScenarioOutline
{
	@When("^login using user(\\d+) and pass(\\d+)$")
	public void login_using_user_and_pass(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User have logged in using below credential");
	    System.out.println(arg1+" "+arg2);
	}
}
