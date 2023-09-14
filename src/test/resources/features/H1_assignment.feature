@ManageAssignmentSearchBox
Feature: Manage assignment page Verification

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 

Scenario Outline: Validate search box function for valid assignment
Given Admin is on manage assignment page
When Admin enters  into search box "<valid assignment>"
Then Displays entries with that assignment details 

Examples:

|valid assignment|
|valid assignmentName|
|valid assignmentDescription|
|valid assignment due date|
|valid assignment grade value|

   Scenario Outline: Validate search box function for invalid assignment
Given Admin is on manage assignment page
When Admin enters in the search box "<Invalid assignment details>"  
Then Displays empty details in the data table

Examples:
|Invalid assignment details|
|invalid assignmentName|
|invalid assignmentDescription|
|invalid assignment due date|
|invalid assignment grade value|
