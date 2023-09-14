@PaginationAssignment
Feature: Pagination in manage assignment

 Rule: Pagination in manage assignment when logged on LMS portal
  Background: Logged on the LMS portal as Admin

Scenario: Verify sheet one is displayed on default in data table
    Given Admin is on dashboard page after Login  
    When Admin clicks Assignment button 
    Then Data table should display page one when entries available
 
Scenario: Verify  right arrow is enable when sheet one is displayed in data table 
    Given Admin is on dashboard page after Login  
    When Admin clicks Assignment button
    Then Right arrow should be enabled in page one when entries are more than five available
    
 Scenario: Verify  left arrow is disable when sheet one is displayed in data table 
    Given Admin is on dashboard page after Login  
    When Admin clicks Assignment button
    Then Left arrow should be disabled in page one when entries are more than five available
    
Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than ten 
    Given Admin is on dashboard page after Login  
    When Admin clicks Assignment button
    Then Right arrow should be enabled in page two when entries are more than ten available
    
Scenario: Verify  left arrow is enable when sheet two is displayed in data table
    Given Admin is on dashboard page after Login  
    When Admin clicks Assignment button
    Then Left arrow should be enabled in page two 
    
Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than ten 
    Given Admin is on dashboard page after Login  
    When Admin clicks Assignment button
    Then Data table should display page one when entries available
    
 Scenario: Verify pagination controls enabled
    Given Admin is on dashboard page after Login  
    When Admin clicks Assignment button
    Then when entries are more than five in data table pagination controls enabled
       
 Scenario: Verify pagination controls disabled
    Given Admin is on dashboard page after Login  
    When Admin clicks Assignment button
    Then when entries are less than five in data table pagination controls disabled

Scenario: Verify next page is enabled
Given Admin click +Add New assignment button after reaching to manage assignment page
And Admin is in add assignment details popup window
When Admin creates five new assignment
Then when total class entries above five next page is enabled and On multiples of five new page will be enabled


Scenario: verify next page is disabled
Given Admin click +Add New assignment button after reaching to manage assignment page
And Admin is in add assignment details popup window
When Admin creates less than or equal to five new assignment ds
Then when total class entries five or below next page is disabled



  
  
  
     