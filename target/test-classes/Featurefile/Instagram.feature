Feature: Instagram functionality testing

  Scenario: Instagram login credentials testing
  
    Given User is on the Instagram login page
    When User should enter the username and password
    And User should click the login button
    Then User should verify the success message
