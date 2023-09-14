@Delete_MultipleAssignment_validation
Feature: Delete multiple class validation

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 

Scenario: Verify delete multiple assignment  button is enabled
Given Admin is in manage assignment page
When Admin clicks single  row level check box in the data table for assignment page
Then Admin should see delete icon below the header is enabled for assignment page

Scenario: Verify accept alert in delete multiple class function by selecting single checkbox

Given Admin clicks delete button under header after selecting the check box in the data table for assignment page
And Admin is in delete alert for assignment page
When Admin clicks yes button for delete alert assignment page
Then Redirected to assignment page and selected assignment details are deleted from the data table

Scenario: Verify reject alert in delete multiple assignment function by selecting single checkbox
Given Admin clicks delete button under header after selecting the check box in the data table for assignment page
And Admin is in delete alert for assignment page
When Admin clicks no button for delete alert assignment page
Then Redirected to assignment page and selected assignment details are not deleted from the data table

Scenario: Verify accept alert in delete multiple assignment function by selecting multiple checkbox
Given Admin clicks delete button under header after selecting the check box in the data table for assignment page
And Admin is in delete alert for assignment page
When Admin clicks yes button for delete alert assignment page
Then Redirected to assignment page and selected assignment details are deleted from the data table

Scenario: Verify reject alert in delete multiple class function by selecting multiple checkbox
Given Admin clicks delete button under header after selecting the check box in the data table for assignment page
And Admin is in delete alert for assignment page
When Admin clicks no button for delete alert assignment page
Then Redirected to assignment page and selected assignment details are not deleted from the data table








