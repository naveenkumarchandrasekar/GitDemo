Feature: Data Driven Testing
Scenario: Login using differnet credentials
Scenario Outline: login using below users
When login using <Username> and <Password>
Examples:
|Username|Password|
|user1|pass2|
|user2|pass2|