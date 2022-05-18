Feature: Facebook functionality testing

  Scenario Outline: Facebook Login credentials testing
  
    Given User is on the Facebook login page
    When User should enter the "<username>" and "<password>"
    And User should click the login button
    Then User should verify the success message

    Examples:
    |username|password|
    |anand|anand@123|
    |siva|siva@123|
    