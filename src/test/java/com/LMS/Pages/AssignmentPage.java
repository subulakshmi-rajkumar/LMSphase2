package com.LMS.Pages;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;

import com.swabunga.spell.event.*;
import com.LMS.DriverFactory.DriverFactory;
import com.LMS.Utils.ConfigReader;
import com.swabunga.spell.engine.*;

public class AssignmentPage {

	public static WebDriver driver = DriverFactory.getDriver();
	String assignmentUrl = ConfigReader.getassignment();

	String assNameText;

	@FindBy(id = " ")
	WebElement assignmentButton;
	@FindBy(id = "newAssignmentButton ")
	WebElement newAssignmentButton;
	@FindBy(xpath = " editAssignmentButton ")
	WebElement editAssignmentButton;
	@FindBy(xpath = "editdeleteAssignmentButton ")
	WebElement editDeleteAssignmentButton;
	@FindBy(xpath = "deleteAssignmentButton ")
	WebElement DeleteAssignmentButton;
	@FindBy(xpath = "assNmdownarrowbtn ")
	WebElement assNmdownarrowbtn;
	@FindBy(xpath = "assNmUParrowbtn ")
	WebElement assNmUParrowbtn;
	@FindBy(css = "page1AsButton ")
	WebElement page1AsButton;
	@FindBy(css = "page2AsButton ")
	WebElement page2AsButton;
	@FindBy(xpath = "driver.findElement(By.xpath(\"//a[text()='\" + i + \"']\"))")
	WebElement rightArrowAsButton;
	@FindBy(xpath = "leftArrowAsButton ")
	WebElement leftArrowAsButton;
	@FindBy(xpath = "logoutbuttonAssignButn ")
	WebElement logoutbuttonAssignButn;
	@FindBy(xpath = "studentbuttonAssignButn ")
	WebElement studentbuttonAssignButn;
	@FindBy(xpath = "programbuttonAssignButn ")
	WebElement programbuttonAssignButn;
	@FindBy(xpath = "attendencebuttonAssignButn ")
	WebElement attendencebuttonAssignButn;
	@FindBy(xpath = "classbuttonAssignButn ")
	WebElement classbuttonAssignButn;
	@FindBy(xpath = "userbuttonAssignButn ")
	WebElement userbuttonAssignButn;
	@FindBy(xpath = "batchbuttonAssignButn ")
	WebElement batchbuttonAssignButn;
	@FindBy(xpath = "dropDownProgramAssignButn")
	WebElement dropDownProgramAssignButn;
	@FindBy(xpath = "calendarIconAssignButn ")
	WebElement calendarIconAssignButn;

	@FindBy(xpath = "savePopUpAssignmentButton ")
	WebElement savePopUpAssignmentButton;
//	@FindBy(xpath = "userbuttonAssignButn ")
//	WebElement userbuttonAssignButn;

	@FindBy(xpath = "dropDownBatchAssignButn ")
	WebElement dropDownBatchAssignButn;
	@FindBy(id = "checkBoxDataTable ")
	WebElement checkBoxDataTable;
	@FindBy(xpath = "manageAssignmentHeader")
	WebElement manageAssignmentHeader;
	@FindBy(tagName = "body")
	WebElement allTextForAssignmentpage;
	@FindBy(xpath = " deleteAssIcon")
	WebElement deleteAssIcon;
	@FindBy(xpath = "assignmentName")
	WebElement assignmentName;
	@FindBy(xpath = "assignmentDescription")
	WebElement assignmentDescription;
	@FindBy(xpath = "assignmentGradeValu")
	WebElement assignmentGradeValu;
	@FindBy(xpath = "assignmentDueDate")
	WebElement assignmentDueDate;

	@FindBy(xpath = " manageAssignmentEntryTable ")
	WebElement manageAssignmentEntryTable;
	@FindBy(xpath = "deleteAllAssignmentsButton ")
	WebElement deleteAllAssignmentsButton;
	@FindBy(css = "searchBar ")
	WebElement searchBarAssignment;
	@FindBy(xpath = " ")
	WebElement searchListManageAssignment;
	@FindBy(xpath = "addnewassignmentButton ")
	WebElement addnewassignmentButton;
	@FindBy(tagName = "assignmentBaseTable ")
	WebElement assignmentBaseTable;
	@FindBy(xpath = "rowassignmentBaseTable ")
	WebElement rowassignmentBaseTable;
	@FindBy(tagName = "pageTextAssignment ")
	WebElement pageTextAssignment;

	@FindBy(tagName = "deletealertAssignment ")
	WebElement deletealertAssignment;

	@FindBy(xpath = "paginationControlsAssignment ")
	WebElement paginationControlsAssignment;

	@FindBy(xpath = "popUpHeading ")
	WebElement popUpHeading;
	@FindBy(xpath = "progNmPopUp ")
	WebElement progNmPopUp;
	@FindBy(xpath = "batchNoPopUp ")
	WebElement batchNoPopUp;
	@FindBy(xpath = "assNamePopUp ")
	WebElement assNamePopUp;
	@FindBy(xpath = "assDescPopUp ")
	WebElement assDescPopUp;
	@FindBy(xpath = "gradeByPopUp ")
	WebElement gradeByPopUp;
	@FindBy(xpath = "assDueDatePopUp ")
	WebElement assDueDatePopUp;
	@FindBy(xpath = "assgnFile1PopUp ")
	WebElement assgnFile2PopUp;
	@FindBy(xpath = "assgnFile2PopUp ")
	WebElement assgnFile1PopUp;
	@FindBy(xpath = "assgnFile3PopUp ")
	WebElement assgnFile3PopUp;
	@FindBy(xpath = "countTextBox ")
	WebElement countTextBox;

//	@FindBy(xpath = "newAssignmentButton ")
//	WebElement newAssignmentButton;

//	@FindBy(xpath = "newAssignmentButton ")
//	WebElement newAssignmentButton;

	public AssignmentPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//  ButtonClicks
	public void clickstudentbuttonAssignButn() {
		studentbuttonAssignButn.click();
	}

	public void clickprogrambuttonAssignButn() {
		programbuttonAssignButn.click();
	}

	public void clickbatchbuttonAssignButn() {
		batchbuttonAssignButn.click();
	}

	public void clickuserbuttonAssignButn() {
		userbuttonAssignButn.click();
	}

	public void clickclassbuttonAssignButn() {
		classbuttonAssignButn.click();
	}

	public void clickattendencebuttonAssignButn() {
		attendencebuttonAssignButn.click();
	}

	public void clicklogoutbuttonAssignButn() {
		logoutbuttonAssignButn.click();
	}

	public void clickNewAssignmentButton() {
		newAssignmentButton.click();
	}

	public void clickAssignment() {
		assignmentButton.click();
	}

	public void clickDeleteAssignment() {
		DeleteAssignmentButton.click();
	}

	public void clickEditAssignment() {
		editAssignmentButton.click();
	}

	public void clickcheckBoxDataTableonAssignment() {
		checkBoxDataTable.click();
	}

	public void pageLoadManageAssignment() {
		long startTime = System.currentTimeMillis();
		assignmentButton.click();
		// Wait for the new page to fully load
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Calculate and print the response time
		long endTime = System.currentTimeMillis();
		long pageLoadTime = endTime - startTime;
		System.out.println("Page load time: " + pageLoadTime + " milliseconds");
	}

	public void verifyManageAssignmentHeader() {

		String expectedHeading = "Manage Assignment";

		// Storing the text of the heading in a string
		String heading = manageAssignmentHeader.getText();
		if (expectedHeading.equalsIgnoreCase(heading))
			System.out.println("The expected heading is same as actual heading --- " + heading);
		else
			System.out.println("The expected heading doesn't match the actual heading --- " + heading);

	}

	public void getAllTextAssignmentPage() {
//       Option 1: Get text from specific elements
//		      String text = allTextForAssignmentpage.getText();
//	        System.out.println("Text from the element: " + text);

		String pageText = allTextForAssignmentpage.getText();
		System.out.println("Text from the entire page: " + pageText);
	}

//this method checks for correct spelling for all the texts/words in the manage assignment page
	public String spellCheckManagaeAssignmentPage() {

		// Extract text content from the web page
		String assignmentPageTexts = driver.findElement(By.tagName("body")).getText();

		// Create a SpellChecker instance
		SpellDictionary dictionary = null;
		try {
			dictionary = new SpellDictionaryHashMap();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SpellChecker spellChecker = new SpellChecker(dictionary);

		// Tokenize the web page text into words
		String[] words = StringUtils.split(assignmentPageTexts);

		StringBuffer misSpelledWords = null;

		// Check the spelling of each word
		for (String word : words) {
			if (!spellChecker.isCorrect(word)) {
				if (misSpelledWords == null) {
					misSpelledWords = new StringBuffer();
				}
				misSpelledWords.append(word);
				misSpelledWords.append(",");

//             System.out.println("Misspelled word: " + word);
			}
		}

		if (misSpelledWords != null) {
			return misSpelledWords.toString();
		}

		return null;

	}

	public void deleteAssignmentIcon() {
		if (deleteAssIcon.isEnabled()) {
			System.out.println(" Edit icon is enabled. Return: true" + deleteAssIcon.isEnabled());
		} else {
			System.out.println("Edit icon is not enabled. Return: false " + deleteAssIcon.isEnabled());
		}
	}

//	public void searchBarAssignmentPage() {
//		searchBarAssignment.sendKeys("assignment name");
//
//		
//	}

	public void addNewAssignmentButtonIcon() {
		if (addnewassignmentButton.isEnabled()) {
			System.out.println(" Edit icon is enabled. Return: true" + addnewassignmentButton.isEnabled());
		} else {
			System.out.println("Edit icon is not enabled. Return: false " + addnewassignmentButton.isEnabled());
		}
	}

	public String verifyAssignmentBaseTable(String columnHeadersAssignment) {

//		// To find first row of table
//		WebElement tableRow = assignmentBaseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[0]"));
//		String rowtext = tableRow.getText();
//		System.out.println("Third row of table : " + rowtext);
//		    
//		    //to get 3rd row's 2nd column data
//		    WebElement cellAssignmentName = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[0]/td[1]"));
//		    String assNameText = cellAssignmentName.getText();
//		    System.out.println("Cell value is : " + assNameText);

		String text = driver.findElement(By.id(columnHeadersAssignment)).getText();
		return text;
	}

	public void editAssignmentBaseTableIcon() {

		// Locate the data table element and Check if there are any rows in the data
		// table
		List<WebElement> rows = assignmentBaseTable.findElements(By.tagName("tr"));

		if (rows.size() > 0) {
			// Iterate through each row and check if the "Edit" icon is displayed
			for (WebElement row : rows) {
				List<WebElement> editIcons = row.findElements(By.className("edit-icon"));
				if (editIcons.size() > 0) {
					System.out.println("Edit icon is displayed in this row.");
				} else {
					System.out.println("No Edit icon in this row.");
				}
			}
		} else {
			System.out.println("No rows in the data table.");
		}

	}

	public void deleteIconAssignmentBaseTable() {
		List<WebElement> rows = assignmentBaseTable.findElements(By.tagName("tr"));

		if (rows.size() > 0) {
			// Iterate through each row and check if the "Edit" icon is displayed
			for (WebElement row : rows) {
				List<WebElement> deleteIcons = row.findElements(By.className("delete-icon"));
				if (deleteIcons.size() > 0) {
					System.out.println("delete icon is displayed in this row.");
				} else {
					System.out.println("No delete icon in this row.");
				}
			}
		} else {
			System.out.println("No rows in the data table.");
		}

	}

	public void verifyPaginationControlsAssignment() {

		Boolean paginationControlsAssignmentDisplay = paginationControlsAssignment.isEnabled();
		// To print the value
		System.out.println("Element displayed is :" + paginationControlsAssignmentDisplay);

	}

	public void verifyPaginationTextAssignment() {

		Boolean paginationTextAssignment = pageTextAssignment.isDisplayed();
		// To print the value
		System.out.println("Element enabled is :" + paginationTextAssignment);

	}

//
//	 public String verifyValidAssignmentinSearchBar(String validAssignment ) {
//		 
//		 searchBarAssignment.sendKeys( validAssignment);

//	Assignment POp up window

	public Boolean parentWindowHandleVerification() {

		// Get the current window handle (parent window)
		String parentWindowHandle = driver.getWindowHandle();

		// Locate and click the link that opens a new window
		newAssignmentButton.click();
		// Find all window handles currently open by the WebDriver
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to the new window
		for (String windowHandle : windowHandles) {
			if (!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}

		}
		popUpHeading.getText();
		return true;
	}

//        if (actualText.equals(expectedText)) {
//            System.out.println("Element in new window is verified.");
//        } else {
//            System.out.println("Element in new window verification failed.");
//        }
	public Boolean popUpFieldsVerification(String inputFields) {
		List<WebElement> popUpFields = driver.findElements(By.id(inputFields));
//        To check text present
		if (popUpFields.contains("Text to check")) {
			System.out.println("Text is present");
		} else {
			System.out.println("Text is absent");

		}
		return true;
	}

	public Boolean countTextBoxPopup(int countTextBox) {
		// Locate the element(s) you want to count (e.g., by CSS selector)
		List<WebElement> countTextBoxes = driver.findElements(By.cssSelector("your-css-selector"));

		// Get the count of matching elements
		int elementCount = countTextBoxes.size();

		// Print the count
		System.out.println(elementCount);
		return true;
	}

	public Boolean dropDownBatchAssignment() {

		if (dropDownBatchAssignButn.isDisplayed()) {
			System.out.println("Batch Drop down is displayed on Add assignment Page.");
			// You can perform your desired actions on page 1 here
		} else {
			System.out.println("Batch Drop down is not displayed on Add assignment Page.");
		}
		return true;
	}

	public Boolean dropDownProgramAssignment() {

		if (dropDownProgramAssignButn.isDisplayed()) {
			System.out.println("Program Drop down is displayed on Add assignment Page.");
			// You can perform your desired actions on page 1 here
		} else {
			System.out.println("Program Drop down is not displayed on Add assignment Page.");
		}
		return Boolean.TRUE;
	}

	public Boolean calendarIconAssignment() {

		if (calendarIconAssignButn.isDisplayed()) {
			System.out.println("calendarIcon is displayed on Add assignment Page.");
			// You can perform your desired actions on page 1 here
		} else {
			System.out.println("PcalendarIcon is not displayed on Add assignment Page.");
		}
		return true;
	}

	public Boolean savePopUpAssignment() {

		if (savePopUpAssignmentButton.isDisplayed()) {
			System.out.println("savePopUpAssignment is displayed on Add assignment Page.");
			// You can perform your desired actions on page 1 here
		} else {
			System.out.println("savePopUpAssignment is not displayed on Add assignment Page.");
		}
		return true;
	}

	public Boolean verifyOtherFieldsPopUpAssignment(String fields) {

		boolean OthFields = driver.findElement(By.id(fields)).isDisplayed();
		return OthFields;
	}
// Deleting multiple assignment

	public boolean deleteIcondisEnabled() {
		if (deleteAssIcon.isEnabled()) {
			return true;
		} else
			return false;

	}

	public void deletealertassignment() {
		DeleteAssignmentButton.click();
		Alert al = driver.switchTo().alert();
		al.accept();

	}
	
	public void deletealertDismissassignment() {
		DeleteAssignmentButton.click();
		Alert al = driver.switchTo().alert();
		al.dismiss();
	
	}

//	public void clickmultipledeletecheckboxesinAssignment() {
//
//		int min = 0;
//		ArrayList<String> allAssignmentnames = new ArrayList<String>();
//		allAssignmentnames = getallAssignmentnames();
//		int max = allAssignmentnames.size() - 1;
//		int random_int1 = (int) Math.floor(Math.random() * (max - min + 1) + min);
//		int random_int2 = random_int1 + 1;
//		paginationselector = paginationselector + "(" + random_int1 + ")";
//		driver.findElement(By.cssSelector(paginationselector)).click();
//		multipleprgnamesdeleted.add(prgnametablerows.get(random_int1).getText());
//		multipleprgnamesdeleted.add(prgnametablerows.get(random_int2).getText());
//		deletebuttons.get(random_int1).click();
//		deletebuttons.get(random_int2).click();
//
//	}

//  Method for Sorting
	public boolean validatingaftersortbyAssNmAscending() {

		List<WebElement> assigNameCol = driver.findElements(By.xpath("//tab[@id='table']/tbody/tr/td[1]"));
		ArrayList<String> beforesortAssNm = new ArrayList<>();
		for (int i = 0; i < assigNameCol.size(); i++) {
			beforesortAssNm.add(assigNameCol.get(i).getText().trim());
		}
		for (int i = 0; i < assigNameCol.size(); i++) {
			Collections.sort(beforesortAssNm);
			Collections.reverse(beforesortAssNm);
		}
		assNmdownarrowbtn.click();
		assigNameCol = driver.findElements(By.xpath("//tab[@id='table']/tbody/tr/td[3]"));
		ArrayList<String> aftersortAssNm = new ArrayList<>();
		for (int i = 0; i < assigNameCol.size(); i++) {
			aftersortAssNm.add(assigNameCol.get(i).getText().trim());
		}
		if (beforesortAssNm == aftersortAssNm) {
			return true;
		} else
			return false;

	}

	public void clickAsNmSort() {
		assNmdownarrowbtn.click();
	}

	public void doubleclickAsNmSort() {

		Actions act = new Actions(driver);
		act.doubleClick(assNmdownarrowbtn).perform();
	}

	public boolean validatingdataaftersortingbyAssNm() {

		List<WebElement> assigNameCol = driver.findElements(By.xpath("//tab[@id='table']/tbody/tr/td[1]"));
		ArrayList<String> beforesortAssNm = new ArrayList<>();
		for (int i = 0; i < assigNameCol.size(); i++) {
			beforesortAssNm.add(assigNameCol.get(i).getText().trim());
		}
		for (int i = 0; i < assigNameCol.size(); i++) {
			Collections.sort(beforesortAssNm);
			Collections.reverse(beforesortAssNm);
		}
		assNmUParrowbtn.click();
		assigNameCol = driver.findElements(By.xpath("//tab[@id='table']/tbody/tr/td[3]"));
		ArrayList<String> aftersortAssNm = new ArrayList<>();
		for (int i = 0; i < assigNameCol.size(); i++) {
			aftersortAssNm.add(assigNameCol.get(i).getText().trim());
		}
		if (beforesortAssNm == aftersortAssNm) {
			return true;
		} else
			return false;

	}
//  Pagination

	public void paginationAssign() {
		// Locate the pagination controls and get the total number of pages
		int totalPages = Integer.parseInt(paginationControlsAssignment.getText());

		// Check if there is more than one page
		if (totalPages > 1) {
			// Loop through the pagination to reach the last page
			for (int i = 2; i <= totalPages; i++) {

				rightArrowAsButton.click();
				// Add a wait here to ensure the next page is loaded completely
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public Boolean defaultPageOneWithDataEntries() {
		List<WebElement> dataRows = driver.findElements(By.cssSelector("assignmentBaseTable"));

		if (page1AsButton.isEnabled()) {
			System.out.println("Page 1 is enabled in pagination.");
			// You can perform your desired actions on page 1 here
		} else if ((!dataRows.isEmpty())) {
			System.out.println("Data table is not empty.");
		} else {
			System.out.println("Data table is empty.");
		}
		return true;
	}

	public Boolean PageOneWithfiveAndMoreDataEntries() {
		List<WebElement> dataRows = driver.findElements(By.cssSelector("assignmentBaseTable"));

		// Check if there are more than 5 rows
		if (dataRows.size() > 5) {
			System.out.println("There are more than 5 rows in the table.");
		} else if (rightArrowAsButton.isEnabled()) {
			System.out.println("Right Arrow button on assignment is enabled");
		} else {
			System.out.println("Right Arrow button on assignment is enabled");
		}
		return true;
	}

	public Boolean PgOneLarrowDisabled() {
		List<WebElement> dataRows = driver.findElements(By.cssSelector("assignmentBaseTable"));

		// Check if there are more than 5 rows
		if (dataRows.size() > 5) {
			System.out.println("There are more than 5 rows in the table.");
		} else if (leftArrowAsButton.isEnabled()) {
			System.out.println("left Arrow button on assignment is enabled");
		} else {
			System.out.println("left Arrow button on assignment is disabled");
		}

		return true;

	}

//	Navigation to a different page

	public Boolean assignmentTostudentPage() {

		// Wait for the Attendance page to load
//    WebDriverWait wait = new WebDriverWait(driver, 10);
//    wait.until(ExpectedConditions.urlContains("/attendance"));

		// Verify if the Admin landed on the Attendance page
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("/student")) {
			System.out.println("Admin successfully navigated to the Attendance page.");
		} else {
			System.out.println("Admin failed to navigate to the Attendance page.");
		}
		return true;
	}

	public Boolean assignmentToprogramPage() {
		programbuttonAssignButn.click();

		// Wait for the Attendance page to load
//	    WebDriverWait wait = new WebDriverWait(driver, 10);
//	    wait.until(ExpectedConditions.urlContains("/attendance"));

		// Verify if the Admin landed on the Attendance page
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("/program")) {
			System.out.println("Admin successfully navigated to the Attendance page.");
		} else {
			System.out.println("Admin failed to navigate to the Attendance page.");
		}
		return true;
	}

	public Boolean assignmentTobatchPage() {

		// Wait for the Attendance page to load
		// WebDriverWait wait = new WebDriverWait(driver, 10);
//	    wait.until(ExpectedConditions.urlContains("/attendance"));

		// Verify if the Admin landed on the Attendance page
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("/batch")) {
			System.out.println("Admin successfully navigated to the Attendance page.");
		} else {
			System.out.println("Admin failed to navigate to the Attendance page.");
		}
		return true;
	}

	public Boolean assignmentTouserPage() {

		// Wait for the Attendance page to load
//	    WebDriverWait wait = new WebDriverWait(driver, 10);
//	    wait.until(ExpectedConditions.urlContains("/attendance"));

		// Verify if the Admin landed on the Attendance page
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("/user")) {
			System.out.println("Admin successfully navigated to the Attendance page.");
		} else {
			System.out.println("Admin failed to navigate to the Attendance page.");
		}
		return true;
	}

	public Boolean assignmentToClassPage() {

		// Wait for the Attendance page to load
//	    WebDriverWait wait = new WebDriverWait(driver, 10);
//	    wait.until(ExpectedConditions.urlContains("/attendance"));

		// Verify if the Admin landed on the Attendance page
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("/class")) {
			System.out.println("Admin successfully navigated to the Attendance page.");
		} else {
			System.out.println("Admin failed to navigate to the Attendance page.");
		}
		return true;
	}

	public Boolean assignmentToAttendencePage() {

		// Wait for the Attendance page to load
//	    WebDriverWait wait = new WebDriverWait(driver, 10);
//	    wait.until(ExpectedConditions.urlContains("/attendance"));

		// Verify if the Admin landed on the Attendance page
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("/attendance")) {
			System.out.println("Admin successfully navigated to the Attendance page.");
		} else {
			System.out.println("Admin failed to navigate to the Attendance page.");
		}
		return true;
	}

	public Boolean assignmentTologinPage() {

		// Wait for the Attendance page to load
//	    WebDriverWait wait = new WebDriverWait(driver, 10);
//	    wait.until(ExpectedConditions.urlContains("/attendance"));

		// Verify if the Admin landed on the Attendance page
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("/logout")) {
			System.out.println("Admin successfully navigated to the Attendance page.");
		} else {
			System.out.println("Admin failed to navigate to the Attendance page.");
		}
		return true;
	}

}
