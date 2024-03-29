@EmployeeSearch
Feature: Training & Courses
As a supervisor
I want to be able to login to the My Aurion system
So that I can View my requested courses and course history


Background:
    Given I am on myAurion login page
   	  And I enter username as "uqmsanda"
      And I enter password as "password123"
      And I click Login button
      
      
 Scenario Outline: Search for direct reports
 
 When I am on the DashboardPage
 	And I click on change Employee icon
 	And I enter the employee search phrase "<EmployeeSearchPhrase>"
Then I should see the matching search result "<EmployeeToSelect>"

Examples:
 | EmployeeSearchPhrase | EmployeeToSelect|
 |heidi e               | heidi ellis     |
  |2004378             | AMY, Wendy J    |
 
 
  Scenario Outline: Search for indirect reports
 
 When I am on the DashboardPage
 	And I click on change Employee icon
 	And I enter the employee search phrase "<EmployeeSearchPhrase>"
Then I should see the matching search result "<EmployeeToSelect>"

Examples:
 | EmployeeSearchPhrase | EmployeeToSelect|
 |	    |   |
 
 
 Scenario Outline: Search for employees- No results found
 
 When I am on the DashboardPage
 	And I click on change Employee icon
 	And I enter the employee search phrase "<EmployeeSearchPhrase>"
Then I should see the message "<messageText>"

Examples:
 | EmployeeSearchPhrase | EmployeeToSelect|
 |	 asdfghj   | None found...  |
 
 
 
 Scenario Outline: Search for direct reports and act on behalf of employee
 
 When I am on the DashboardPage
 	And I click on change Employee icon
 	And I enter the employee search phrase "<EmployeeSearchPhrase>"
 	And I select the employee from search results "<EmployeeToSelect>"
 Then I should see the current user as selected employee "<EmployeeToSelect>"

Examples:
 | EmployeeSearchPhrase | EmployeeToSelect|
 |heidi e               | heidi ellis     |
  |2004378             | AMY, Wendy J    |
  
 
 Scenario Outline: Act on behalf of employee and navigate to Payroll
 
 When I am on the Payroll page
 	And I click on change Employee icon
 	And I enter the employee search phrase "<EmployeeSearchPhrase>"
 	And I select the employee from search results "<EmployeeToSelect>"
 Then I should see the No access error message
 

Examples:
 | EmployeeSearchPhrase | EmployeeToSelect|
 |heidi e               | heidi ellis     |
  |2004378             | AMY, Wendy J    |
  
   
Scenario Outline: Act on behalf of employee and navigate to personal details
 
 When I am on the Personal details page
 	And I click on change Employee icon
 	And I enter the employee search phrase "<EmployeeSearchPhrase>"
 	And I select the employee from search results "<EmployeeToSelect>"
 Then I should see the No access error message
 

Examples:
 | EmployeeSearchPhrase | EmployeeToSelect|
 |heidi e               | heidi ellis     |
  |2004378             | AMY, Wendy J    |

 

 
 