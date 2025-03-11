
Feature: Login Functionality
@Login	
  Scenario: User logs in with valid credentials
    Given User is on the login page
    When User enters valid username and password
    And Clicks on the login button
    Then User should see a successful login message