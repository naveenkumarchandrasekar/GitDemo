Feature: Data Driven testing
Scenario: Create new account in Facebook
Given I open Facebook URL
And fill up the new account form with the following data
| First Name | Last Name | Password | Gender |
|	Naveen     | Kumar     | Pass456	| Male	 |
| Sasi  		 | Kumar 		 | Pass123  | Male   |