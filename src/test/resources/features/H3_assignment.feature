
@AddNewAssignment
Feature: Add new Assignment 

Background: Admin click +Add new assignment button after reaching to manage assignment page

Scenario Outline: Validate admin able to add new assignment with valid data in mandatory fields
Given Admin is on assignment details popup window
When Admin enters all mandatory field values with valid data from the "<sheetName>" and " < row > " and clicks save button
Then Admin should see new assignment details is added in the data table

Examples:
|sheetName|row|	
|sheet1| 0|
|sheet1| 1|	
|sheet1| 2|
|sheet1| 3|	
|sheet1| 4|
|sheet1| 5|	
|sheet1| 6|
|sheet1| 7|	
|sheet1| 8|
|sheet1| 9|	
|sheet1| 10|
|sheet1| 11|	


Scenario Outline: Validate admin able to add new assignment with invalid data in mandatory fields
Given Admin is in assignment details popup window
When Admin enters all mandatory field values with invalid data from the "<sheetName>" and " < row > " and clicks save button
Then Error message should appear in alert 

Examples:
|sheetName|row|	
|sheet1| 0|
|sheet1| 1|	


Scenario Outline: Validate admin able to add new assignment with valid data in all fields
Given Admin is in assignment details popup window
When Admin enters values in all fields with valid data from the "<sheetName>" and " < row > " and clicks save button 
Then Admin should see new assignment details is added in the data table

Examples:
|sheetName|row|	
|sheet1| 0|
|sheet1| 1|	

Scenario Outline: Validate admin able to add new assignment with invalid data  in optional fields
Given Admin is in assignment details popup window
When Admin enters values in all fields with invalid data from "<sheetName>" and " < row > " and clicks save button 
Then Error message should appear in alert

Examples:
|sheetName|row|	
|sheet1| 0|
|sheet1| 1|	

Scenario Outline: Validate admin able to add new assignment missing program name
Given Admin is in assignment details popup window
When Admin enters data from from "<sheetName>" and " < row > " missing value in program name and clicks save button 
Then Program Name is missing
Examples:
|sheetName|row|	
|sheet1| 0|
|sheet1| 1|	

Scenario Outline: Validate admin able to add new assignment missing batch number
Given Admin is in assignment details popup window
When Admin enters data missing value in Batch number and clicks save button 
Then Batch number is missing

Scenario Outline: Validate admin able to add new assignment missing assignment name
Given Admin is in assignment details popup window
When Admin enters data missing value in Assignment name and clicks save button (Program name, batch number,Assignment Name,  grade by, Assignment Due date )
Then  Assignment name is missing

Scenario Outline: Validate admin able to add new assignment missing due date
Given Admin is in assignment details popup window
When Admin enters data missing value in Assignment due date and clicks save button ( Program name, batch number,Assignment Name, grade by)
Then Assignment due date is missing 

Scenario Outline: Validate admin able to add new assignment missing grade by
Given Admin is in assignment details popup window
When Admin enters data missing value in grade by  and clicks save button (Program name, batch number,Assignment Name, Assignment due date)
Then Grade by is missing 

Scenario: Validate  admin able to add new assignment passing past date 
Given Admin is in assignment details popup window
When Admin enters passed date in the due date field and clicks save button ( Program name, batch number,Assignment Name,  grade by, Assignment Due date )
Then Assignment cannot be created for the passed date

Scenario: Validate date picker
Given Admin is in assignment details popup window
When Admin clicks date from date picker
Then selected date should be their in class date text box

Scenario: validate date picker should be correct format
Given Admin is in assignment details popup window
When Admin clicks date from date picker
Then selected date should be in  mm/dd/yyyy format

Scenario: Validate right arrow in data picker to navigate to next month
Given Admin is in assignment details popup window
When Admin clicks right arrow in the date picker near month
Then Next month calender should visible

Scenario: Validate left arrow in data picker to navigate to previous month
Given Admin is in assignment details popup window
When Admin clicks left arrow in the date picker near month
Then previous month calender should visible

Scenario: Validate current date is highlighted in the date picker
Given Admin is in assignment details popup window
When Admin clicks date picker button
Then Admin should see current date is highled in the date picker

Scenario: Validate selected date is highlighted in the date picker
Given Admin is in assignment details popup window
When Admin clicks date picker button and selects future date
Then Admin should see selected date is highled in the date picker

Scenario: Validate cancel button function in assignment details popup window
Given Admin is in assignment details popup window
When Admin clicks Cancel button without entering values in the fields
Then Admin should land on manage assignment page

Scenario: Validate cancel button function in assignment details popup window with values in field
Given Admin is in assignment details popup window
When Admin clicks Cancel button entering values in the fields
Then Admin should land on manage assignment Page and validate new assignment is not created in the data table



 