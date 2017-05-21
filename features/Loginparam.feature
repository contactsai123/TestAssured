Feature: Test FB Login scenario

  Scenario Outline: Test valid FB Login
    Given User is in FB Homepage
    When I enter valid "<uname>"
    And enter valid "<pwd>"
    Then user should login to FB
    
 	Examples:
 	|uname				|pwd|
  |ccc@gmail.com|pwd1|
  |ddd@gmail.com|pwd2|