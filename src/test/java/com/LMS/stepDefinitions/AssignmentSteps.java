package com.LMS.stepDefinitions;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.LMS.DriverFactory.DriverFactory;
import com.LMS.Pages.AssignmentPage;

import com.LMS.Utils.*;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentSteps {
	public WebDriver driver = DriverFactory.getDriver();

	AssignmentPage assignmentPage = new AssignmentPage(driver);

	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {

	}

	@When("Admin clicks assignment button on the navigation bar")
	public void admin_clicks_assignment_button_on_the_navigation_bar() {
		assignmentPage.clickAssignment();
	}

	@Then("Admin should see URL with Manage assignment")
	public void admin_should_see_url_with_manage_assignment() {
		String actualURL = driver.getCurrentUrl();
		String expectedURL = ConfigReader.getassignment();
		Assert.assertEquals(actualURL, expectedURL);

	}

	@Then("Get the response time for navigation from dashboard page to manage assignment page")
	public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_assignment_page() {
		assignmentPage.pageLoadManageAssignment();
	}

	@Then("Admin should see header with Manage assignment")
	public void admin_should_see_header_with_manage_assignment() {
		assignmentPage.verifyManageAssignmentHeader();

	}

	@When("Admin clicks assignment button on the navigation bar and get all text from the portal page")
	public void admin_clicks_assignment_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page() {

		assignmentPage.getAllTextAssignmentPage();
	}

	@Then("Admin should see correct spelling for the all the fields")
	public void admin_should_see_correct_spelling_for_the_all_the_fields() {

		String misSpelledWords = assignmentPage.spellCheckManagaeAssignmentPage();
		assertNull(misSpelledWords);
	}

	@Then("Admin should see disabled delete icon below the Manage assignment")
	public void admin_should_see_disabled_delete_icon_below_the_manage_assignment() {
		assignmentPage.deleteAssignmentIcon();

	}

//	@Then("Admin should see search bar on the manage assignment page")
//	public void admin_should_see_search_bar_on_the_manage_assignment_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}

	@Then("Admin should see +Add New assignment button on the manage assignment page")
	public void admin_should_see_add_new_assignment_button_on_the_manage_assignment_page() {
		assignmentPage.addNewAssignmentButtonIcon();
		LoggerLoad.info("New assignment Button is enabled");
	}

	@Then("Admin should see data table on the manage assignment page With following {string}")
	public void admin_should_see_data_table_on_the_manage_assignment_page_with_following(
			String columnHeadersAssignment) {
		String actualtext = assignmentPage.verifyAssignmentBaseTable(columnHeadersAssignment);
		Assert.assertEquals(actualtext, columnHeadersAssignment);

	}

	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() {
		assignmentPage.editAssignmentBaseTableIcon();
		LoggerLoad.info("Edit Icon will not be present in data table");
	}

	@Then("Delete Icon will not be present in data table")
	public void delete_icon_will_not_be_present_in_data_table() {
		assignmentPage.deleteIconAssignmentBaseTable();
	}

	@Then("Admin should see following {string} of data table on the manage assignment")
	public void admin_should_see_following_of_data_table_on_the_manage_assignment(String fields) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Above the footer Admin should see the text as {string} entries below the table.")
	public void above_the_footer_admin_should_see_the_text_as_entries_below_the_table(String paginationText) {
		assignmentPage.verifyPaginationTextAssignment();
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		assignmentPage.verifyPaginationControlsAssignment();

	}

	@Then("Admin should see the text {string} with total number assignments in the data table")
	public void admin_should_see_the_text_with_total_number_assignments_in_the_data_table(String totalAssignments) {
		LoggerLoad.info(totalAssignments);
	}

//       @ManageAssignmentSearchBox

	@Given("Admin is on manage assignment page")
	public void admin_is_on_manage_assignment_page() {
		assignmentPage.clickAssignment();
	}

	@When("Admin enters  into search box {string}")
	public void admin_enters_into_search_box(String validAssignment) {

	}

	@Then("Displays entries with that assignment details")
	public void displays_entries_with_that_assignment_details() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters in the search box {string}")
	public void admin_enters_in_the_search_box(String InvalidAssignment) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Displays empty details in the data table")
	public void displays_empty_details_in_the_data_table() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

//	Assignment details Popup window verification

	@Given("Admin is on manage assignment Page parent window")
	public void admin_is_on_manage_assignment_page_parent_window() {

		assignmentPage.clickAssignment();
	}

	@When("Admin click +Add new assignment button")
	public void admin_click_add_new_assignment_button() {
		assignmentPage.clickNewAssignmentButton();
	}

	@Then("Admin should see a popup  with  heading {string}")
	public void admin_should_see_a_popup_with_heading(String headerPopUp) {
		Boolean actualtext = assignmentPage.parentWindowHandleVerification();
		Assert.assertEquals(actualtext, headerPopUp);
	}

	@Then("Admin should see {string} of assignment Page")
	public void admin_should_see_of_assignment_page(String inputFields) {
		Boolean actualtext = assignmentPage.popUpFieldsVerification(inputFields);

		Assert.assertEquals(actualtext, inputFields);
	}

	@Then("{int} textbox should be present in Assignment details popup window")
	public void textbox_should_be_present_in_assignment_details_popup_window(Integer countTextBox) {
		Boolean actualInt = assignmentPage.countTextBoxPopup(countTextBox);
		assertTrue(actualInt, "Not landed in assignment page.");


	}

	@Then("Admin should see dropdown option for Batch Number on add assignment page")
	public void admin_should_see_dropdown_option_for_batch_number_on_add_assignment_page() {
		assignmentPage.dropDownBatchAssignment();

		// LoggerLoad.info("dropdown option for Batch Number on add assignment page is
		// Displayed");
	}

	@Then("Admin should see dropdown option for Program name on add assignment page")
	public void admin_should_see_dropdown_option_for_program_name_on_add_assignment_page() {
		Boolean isInsideAssignmentPage = assignmentPage.dropDownProgramAssignment();
		assertTrue(isInsideAssignmentPage, "Not landed in assignment page.");

	}

	@Then("Admin should see calendar icon for assignment due date on add assignment page")
	public void admin_should_see_calendar_icon_for_assignment_due_date_on_add_assignment_page() {
		Boolean isIconVisible = assignmentPage.calendarIconAssignment();
		assertTrue(isIconVisible, "Not landed in assignment page.");


	}

	@Then("Admin should see {string} save button in the Assignment detail popup window")
	public void admin_should_see_save_button_in_the_assignment_detail_popup_window(String otherFields) {

		Boolean actualtext = assignmentPage.verifyOtherFieldsPopUpAssignment(otherFields);

		Assert.assertEquals(actualtext, otherFields);

	}

//    @NewAssignment

	@Given("Admin is on assignment details popup window")
	public void admin_is_on_assignment_details_popup_window() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters all mandatory field values with valid data from the {string} and {string} and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_valid_data_from_the_and_and_clicks_save_button(
			String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters all mandatory field values with invalid data from the {string} and {string} and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_from_the_and_and_clicks_save_button(
			String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters values in all fields with valid data from the {string} and {string} and clicks save button")
	public void admin_enters_values_in_all_fields_with_valid_data_from_the_and_and_clicks_save_button(String string,
			String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters values in all fields with invalid data from {string} and {string} and clicks save button")
	public void admin_enters_values_in_all_fields_with_invalid_data_from_and_and_clicks_save_button(String string,
			String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data from from {string} and {string} missing value in program name and clicks save button")
	public void admin_enters_data_from_from_and_missing_value_in_program_name_and_clicks_save_button(String string,
			String string2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in Batch number and clicks save button")
	public void admin_enters_data_missing_value_in_batch_number_and_clicks_save_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Batch number is missing")
	public void batch_number_is_missing() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in Assignment name and clicks save button \\(Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
	public void admin_enters_data_missing_value_in_assignment_name_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Assignment name is missing")
	public void assignment_name_is_missing() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in Assignment due date and clicks save button \\( Program name, batch number,Assignment Name, grade by)")
	public void admin_enters_data_missing_value_in_assignment_due_date_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Assignment due date is missing")
	public void assignment_due_date_is_missing() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters data missing value in grade by  and clicks save button \\(Program name, batch number,Assignment Name, Assignment due date)")
	public void admin_enters_data_missing_value_in_grade_by_and_clicks_save_button_program_name_batch_number_assignment_name_assignment_due_date() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Grade by is missing")
	public void grade_by_is_missing() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters passed date in the due date field and clicks save button \\( Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
	public void admin_enters_passed_date_in_the_due_date_field_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Assignment cannot be created for the passed date")
	public void assignment_cannot_be_created_for_the_passed_date() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is in assignment details popup window")
	public void admin_is_in_assignment_details_popup_window() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks right arrow on the date picker near month")
	public void admin_clicks_right_arrow_on_the_date_picker_near_month() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see current date is highled in the date picker")
	public void admin_should_see_current_date_is_highled_in_the_date_picker() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date picker button and selects future date")
	public void admin_clicks_date_picker_button_and_selects_future_date() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see selected date is highled in the date picker")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on manage assignment page")
	public void admin_should_land_on_manage_assignment_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Cancel button entering values in the fields")
	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table")
	public void admin_should_land_on_manage_assignment_page_and_validate_new_assignment_is_not_created_in_the_data_table() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
//  Delete MultipleAssignment_validation

	@When("Admin clicks single  row level check box in the data table for assignment page")
	public void admin_clicks_single_row_level_check_box_in_the_data_table_for_assignment_page() {
		assignmentPage.clickAssignment();
		assignmentPage.clickcheckBoxDataTableonAssignment();
	}

	@Then("Admin should see delete icon below the header is enabled for assignment page")
	public void admin_should_see_delete_icon_below_the_header_is_enabled_for_assignment_page() {
		Boolean deleteIconDisplayed = assignmentPage.deleteIcondisEnabled();
		Assert.assertEquals(deleteIconDisplayed, "delete icon below the header is disabled for assignment page");
		// LoggerLoad.info("delete icon below the header is enabled for assignment
		// page");
	}

	@Given("Admin clicks delete button under header after selecting the check box in the data table for assignment page")
	public void admin_clicks_delete_button_under_header_after_selecting_the_check_box_in_the_data_table_for_assignment_page() {
		assignmentPage.spellCheckManagaeAssignmentPage();
		assignmentPage.clickDeleteAssignment();
	}

	@Given("Admin is in delete alert for assignment page")
	public void admin_is_in_delete_alert_for_assignment_page() {

		assignmentPage.deletealertassignment();

	}

	@Given("Admin clicks delete button under header after selecting the check box in the data table")
	public void admin_clicks_delete_button_under_header_after_selecting_the_check_box_in_the_data_table() {
		assignmentPage.spellCheckManagaeAssignmentPage();
		assignmentPage.clickDeleteAssignment();
	}

	@When("Admin clicks yes button for delete alert assignment page")
	public void admin_clicks_yes_button_for_delete_alert_assignment_page() {
		assignmentPage.deletealertassignment();
	}

	@Then("Redirected to assignment page and selected assignment details are deleted from the data table")
	public void redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_table() {
		
		
		// LoggerLoad.info("delete icon below the header is enabled");

	}
	@Given("Admin clicks delete button under header after selecting the multiple check box in the data table")
	public void admin_clicks_delete_button_under_header_after_selecting_the_multiple_check_box_in_the_data_table() {

	}

@When("Admin clicks no button for delete alert assignment page")
public void admin_clicks_no_button_for_delete_alert_assignment_page() {
	assignmentPage.deletealertDismissassignment();
}
	@Then("Redirected to assignment page and selected assignment details are not deleted from the data table")
	public void redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_table() {
		
		
		// LoggerLoad.info("delete icon below the header is enabled");

	}

	

//  verifySort Function for Assignment

	@Given("Admin is in manage assignment page")
	public void admin_is_in_manage_assignment_page() {
		assignmentPage.clickAssignment();

	}

	@When("Admin click on assignment name column header to sort")
	public void admin_click_on_assignment_name_column_header_to_sort() {
		assignmentPage.clickAsNmSort();
	}

	@Then("Admin should see data table sorted in descending order")
	public void admin_should_see_data_table_sorted_in_descending_order() {
		assignmentPage.validatingdataaftersortingbyAssNm();
		// LoggerLoad.info("delete icon below the header is enabled");

	}

	@When("Admin double click on assignment name column header to sort")
	public void admin_double_click_on_assignment_name_column_header_to_sort() {
		assignmentPage.doubleclickAsNmSort();
	}

	@Then("Admin should see data table sorted in ascending  order")
	public void admin_should_see_data_table_sorted_in_ascending_order() {
		assignmentPage.validatingdataaftersortingbyAssNm();
		// LoggerLoad.info("delete icon below the header is enabled");

	}

//  Pagination 

	@When("Admin clicks Assignment button")
	public void admin_clicks_assignment_button() {
		assignmentPage.clickAssignment();
	}

	@Then("Data table should display page one when entries available")
	public void data_table_should_display_page_one_when_entries_available() {
		Boolean currentPage = assignmentPage.defaultPageOneWithDataEntries();

		Assert.assertEquals(currentPage, "Right arrow should be enabled in page one when entries are not more than five available");
		// LoggerLoad.info("delete icon below the header is enabled");

	}

	@Then("Right arrow should be enabled in page one when entries are more than five available")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_five_available() {
		Boolean fivePlusEntries = assignmentPage.PageOneWithfiveAndMoreDataEntries();
		Assert.assertEquals(fivePlusEntries, "Right arrow should be enabled in page one when entries are not more than five available");
		// LoggerLoad.info("delete icon below the header is enabled");

	}

	@Then("Left arrow should be disabled in page one when entries are more than five available")
	public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_five_available() {
		Boolean lArrowDisables = assignmentPage.PgOneLarrowDisabled();
		Assert.assertEquals(lArrowDisables, "Right arrow should be enabled in page one when entries are not more than five available");
		// LoggerLoad.info("delete icon below the header is enabled");

	}

	@Then("Right arrow should be enabled in page two when entries are more than ten available")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_ten_available() {

		// LoggerLoad.info("delete icon below the header is enabled");

	}

	@Then("when entries are more than five in data table pagination controls enabled")
	public void when_entries_are_more_than_five_in_data_table_pagination_controls_enabled() {

		// LoggerLoad.info("delete icon below the header is enabled");

	}

	@Then("when entries are less than five in data table pagination controls disabled")
	public void when_entries_are_less_than_five_in_data_table_pagination_controls_disabled() {

		// LoggerLoad.info("delete icon below the header is enabled");

	}

	@Given("Admin click +Add New assignment button after reaching to manage assignment page")
	public void admin_click_add_new_assignment_button_after_reaching_to_manage_assignment_page() {

	}

	@Given("Admin is in add assignment details popup window")
	public void admin_is_in_add_assignment_details_popup_window() {

	}

	@When("Admin creates five new assignment")
	public void admin_creates_five_new_assignment() {

	}

	@Then("when total class entries above five next page is enabled and On multiples of five new page will be enabled")
	public void when_total_class_entries_above_five_next_page_is_enabled_and_on_multiples_of_five_new_page_will_be_enabled() {

		// LoggerLoad.info("delete icon below the header is enabled");

	}

	@When("Admin creates less than or equal to five new assignment ds")
	public void admin_creates_less_than_or_equal_to_five_new_assignment_ds() {

		// LoggerLoad.info("delete icon below the header is enabled");

	}

	@Then("when total class entries five or below next page is disabled")
	public void when_total_class_entries_five_or_below_next_page_is_disabled() {

		// LoggerLoad.info("delete icon below the header is enabled");

	}

	@Then("Left arrow should be enabled in page two")
	public void left_arrow_should_be_enabled_in_page_two() {
		assignmentPage.clickNewAssignmentButton();

	}

//	Navigation

	@When("Admin clicks  Student button in the navigation bar")
	public void admin_clicks_student_button_in_the_navigation_bar() {
		assignmentPage.clickstudentbuttonAssignButn();
	}

	@Then("Admin should able to land on student page")
	public void admin_should_able_to_land_on_student_page() {
		Boolean stuPg = assignmentPage.assignmentTostudentPage();
		Assert.assertEquals(stuPg, "Right arrow should be enabled in page one when entries are not more than five available");
	}

	@When("Admin clicks Program button in the navigation bar")
	public void admin_clicks_program_button_in_the_navigation_bar() {
		assignmentPage.clickprogrambuttonAssignButn();
	}

	@Then("Admin should able to land on program page")
	public void admin_should_able_to_land_on_program_page() {
		Boolean proPg = assignmentPage.assignmentToprogramPage();
		Assert.assertEquals(proPg, "Right arrow should be enabled in page one when entries are not more than five available");
	}

	@When("Admin clicks  Batch button in the navigation bar")
	public void admin_clicks_batch_button_in_the_navigation_bar() {
		assignmentPage.clickbatchbuttonAssignButn();
	}

	@Then("Admin should able to land on batch page")
	public void admin_should_able_to_land_on_batch_page() {
		Boolean baPg = assignmentPage.assignmentTobatchPage();
		Assert.assertEquals(baPg, "Admin not able to land on batch page");
	}

	@When("Admin clicks User button in the navigation bar")
	public void admin_clicks_user_button_in_the_navigation_bar() {
		assignmentPage.clickuserbuttonAssignButn();
	}

	@Then("Admin should able to land on user page")
	public void admin_should_able_to_land_on_user_page() {
		Boolean isUserPg = assignmentPage.assignmentTouserPage();
		Assert.assertEquals(isUserPg, "Admin not able to land on user page");
	}

	@When("Admin clicks class button in the navigation bar")
	public void admin_clicks_class_button_in_the_navigation_bar() {
		assignmentPage.clickclassbuttonAssignButn();
	}

	@Then("Admin should able to land on class page")
	public void admin_should_able_to_land_on_class_page() {
		Boolean isClassPg = assignmentPage.assignmentToClassPage();
		Assert.assertEquals(isClassPg, "Admin not able to land on class page");

	}

	@When("Admin clicks Attendance button in the navigation bar")
	public void admin_clicks_attendance_button_in_the_navigation_bar() {
		assignmentPage.clickattendencebuttonAssignButn();
	}

	@Then("Admin should able to land on Attendance page")
	public void admin_should_able_to_land_on_attendance_page() {

		Boolean attendancePg = assignmentPage.assignmentToClassPage();
		Assert.assertEquals(attendancePg, "Admin not able to land on Attendance page");

	}

	@When("Admin clicks Logout button in the navigation bar")
	public void admin_clicks_logout_button_in_the_navigation_bar() {

		assignmentPage.clicklogoutbuttonAssignButn();
	}

	@Then("Admin should able to land on login page")
	public void admin_should_able_to_land_on_login_page() {
		Boolean loginPg = assignmentPage.assignmentTologinPage();
		Assert.assertEquals(loginPg, "Admin not able to land on login page");

	}

}
