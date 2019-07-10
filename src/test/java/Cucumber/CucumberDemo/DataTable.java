package Cucumber.CucumberDemo;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
public class DataTable
{

	@Given("^I open Facebook URL$")
	public void i_open_Facebook_URL() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		System.out.println("user opens the facebook");
}
	@Given("^fill up the new account form with the following data$")
	public void fill_up_the_new_account_form_with_the_following_data(DataTable  dt) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    List<Map<String,String>>list=dt.asMaps(String.class,String.class);
	    for(int i=0;i<list.size();i++)
	    {
	    	System.out.println(list.get(i).get("First Name")+" "+
	    	(list.get(i).get("Last Name"))+" "+
	    	(list.get(i).get("Password"))+" "+
	    	(list.get(i).get("Gender")));
	    	System.out.println("\n");
	    }
	
	}
	private List<Map<String, String>> asMaps(Class<String> class1, Class<String> class2) {
		// TODO Auto-generated method stub
		return null;
	}
}
