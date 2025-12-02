Feature: Testing the application
  @LaunchFp
  Scenario: User test for tab switch in the application
    Given I am on the booking page "https://www.tutorialspoint.com/selenium/practice/date-picker.php"
    When I click the date picker "date Picker"
    And I select date from the "tab picker"

