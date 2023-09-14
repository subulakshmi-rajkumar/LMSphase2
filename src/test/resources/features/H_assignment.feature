
Feature: Manage assignment page Verification

Background: Logged on the LMS portal as Admin

Scenario: Verify landing in manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar
Then Admin should see URL with Manage assignment

Scenario: Capture the response time to navigate to manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar
Then Get the response time for navigation from dashboard page to manage assignment page

Scenario: Verify manage assignment page Header
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar
Then Admin should see header with Manage assignment

Scenario: Validate text in manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar and get all text from the portal page
Then Admin should see correct spelling for the all the fields

Scenario: Verify delete icon below the header
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar
Then Admin should see disabled delete icon below the Manage assignment

Scenario: Verify search bar on the manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar
Then Admin should see search bar on the manage assignment page

Scenario: Verify add new assignment button  on manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar
Then Admin should see +Add New assignment button on the manage assignment page

Scenario Outline: Verify data table on the manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar
Then Admin should see data table on the manage assignment page With following "<column headers>"

Examples:
|column headers|
|check box symbol|
|Assignment name|
|Assignment description| 
|Assignment Date|
|Assignment Grade|
|Edit Delete|

Scenario Outline: Verify all the possible elements in the table
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar
Then Admin should see following "<fields>" of data table on the manage assignment  

Examples:
|fields|
|Edit Icon|
|delete icon|
|Sort Icon|
|Check Box|


Scenario: Validate the number entries displaying
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar
Then Above the footer Admin should see the text as "<Showing x to y of z>" entries below the table.  
                                                                                         
Scenario: Verify Pagination control below the data table
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar
Then Admin should see the pagination controls under the data table

Scenario: Validate footer text
Given Admin is on dashboard page after Login
When Admin clicks assignment button on the navigation bar
Then Admin should see the text "<In total there are number of assignments>" with total number assignments in the data table 



