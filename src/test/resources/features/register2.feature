Feature: Add customer flow

  Scenario: validate the add customer option
    Given user launch the browser
    And user should be in telecom page
    When user should enter all the details
      | fname1 | lname1   | mail1          | adrss   | mobile     |
      | raja   | kumaran | raja@gmail.com | chennai | 7402458544 |
    Then user should be displayed id is generated
	