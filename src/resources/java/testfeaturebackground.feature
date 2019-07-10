Feature: Demo file
Background: Browser Launch
Given Browser must be present in the system
When user opens the application in the browser
Then Testme opens in the browser

Scenario: Login functionality
Given User must be already registered
When user enters the correct credential
Then user must be in the home page

Scenario: Search Product
Given user must have search option
When search for the product with name
Then searched product detail must be displayed in page