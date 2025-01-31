Feature: User has to validate the my info functionality of orange HRM application

  Scenario Outline: User has to validate the personal details in the my info functionality
    Given The user should be in orange login page
    When The user has to enter the "<username>" and "<password>" and click the login button
    Then The user has to verify the "dashboard" page
    When The user has click the my info button and verify the "viewPersonalDetails" page
    And The user has to enter the required details of it and save it

    Examples: 
      | username | password |
      | Admin    | admin123 |
