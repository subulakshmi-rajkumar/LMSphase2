Feature: Assignment details Popup window verification

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 

Scenario: Verify Assignment details popup window
Given Admin is on manage assignment Page parent window
When Admin click +Add new assignment button
Then Admin should see a popup  with  heading "Assignment details"


Scenario Outline: Verify input fields in Assignment details popup window
Given Admin is on manage assignment Page parent window
When Admin click +Add new assignment button
Then Admin should see "< inputfields Text >" of assignment Page 

Examples:
|Program name|
|batch number|
|Assignment Name| 
|Assignment Description|
|Grade by|
 |Assignment due date| 
 |Assignment File1|
 |Assignment file2|
 |Assignment file3| 
 |Assignment file4|
 | Assignment file5|
Scenario: Verify text box present in Assignment details popup window
Given Admin is on manage assignment Page parent window
When Admin click +Add new assignment button
Then  8 textbox should be present in Assignment details popup window


Scenario: Verify drop down in Batch Number in Assignment details popup window
Given Admin is on manage assignment Page parent window
When Admin click +Add new assignment button 
Then Admin should see dropdown option for Batch Number on add assignment page
 

Scenario: Verify drop down in Program name in Assignment details popup window
Given Admin is on manage assignment Page parent window
When Admin click +Add new assignment button 
Then Admin should see dropdown option for Program name on add assignment page

  
Scenario: Verify calendar icon in Assignment due date in Assignment details popup window
Given Admin is on manage assignment Page parent window
When Admin click +Add new assignment button 
Then Admin should see calendar icon for assignment due date on add assignment page


Scenario Outline: Verify other fields are present in assignment popup
Given Admin is on manage assignment Page parent window
When Admin click +Add new assignment button 
Then Admin should see "<other Fields>" save button in the Assignment detail popup window

Examples:
|other Fields|
|save button|
|cancel button|
|close button|


    
      
      
