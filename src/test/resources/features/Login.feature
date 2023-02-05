#language: en

Feature: Log in the portal
  I as a Tester
  Need to log correctly in the portal
  For navigate in it

  Scenario Outline: successfully log in
    Given the user navigates to the login page
    When enter the login data "<Username>" and "<Password>" in the form
    Then the portal should display the "Dashboard" page
    Examples:
      | Username | Password |
      | admin    | serenity |

  Scenario Outline: wrong data log in
    Given the user navigates to the login page
    When enter the login data "<Username>" and "<Password>" in the form
    Then the page should display the message "Invalid username or password!"
    Examples:
      | Username | Password |
      | admin    | sereno   |
      | admon    | serenity |
      | ADMIN    | serenity |
