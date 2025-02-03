@e2e
Feature: User has to validate the my info functionality of orange HRM application

	Background:
		 Given The user should be in orange login page
		 

	@smoke @regression
  Scenario Outline: User has to validate the personal details in the my info functionality
    When The user has to enter the "<username>" and "<password>" and click the login button
    Then The user has to verify the "dashboard" page
    When The user has click the my info button and verify the "viewPersonalDetails" page
    And The user has to enter the required details of it and save it

    Examples: 
      | username | password |
      | Admin    | admin123 |
   
  @sanity @retest 
	Scenario Outline: User has to validate the personal details in the my info functionality
    When The user has to enter the "<username>" and "<password>" and click the login button
    Then The user has to verify the "dashboard" page
    When The user has click the my info button and click the contact details button
    And The user has to enter the required contact details of it and save it

    Examples: 
      | username | password |
      | Admin    | admin123 |
