@acceptance
Feature: Login to system

  In order to login to application
  user should enter correct login and password


  Scenario: Successfully login to application
    Given I am on login page
    When I enter correct credentials
    Then I should be signed in

  Scenario: Logout from system
    Given I am logged in
    When I logout from system
    Then I am logged out

  Scenario: Logout from system being specified user
    Given I am logged in as user "artur" with pwd "123456"
    When I logout from system
    Then I am logged out

  Scenario Outline: Logout from system being specified user
    Given I am logged in as user "<login>" with pwd "<password>"
    When I logout from system
    Then I am logged out

    Examples:
      | login  | password |
      | artur  | 123456   |
      | michal | 654321   |

    Scenario: Adding