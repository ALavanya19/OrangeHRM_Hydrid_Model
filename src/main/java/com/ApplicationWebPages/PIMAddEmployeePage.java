package com.ApplicationWebPages;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.Base;
import com.CommonActions.CommonOperations;
import com.Log.Log;

public class PIMAddEmployeePage extends Base{

	public PIMAddEmployeePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Object Repository
	//Add Employee Label Text
	@FindBy(xpath="//*[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	WebElement addEmployeeLabelTextE;
	
	//FirstName Element
	@FindBy(xpath="//*[@name='firstName']")
	WebElement firstNameE;
	
	//MiddleName Element
	@FindBy(xpath="//*[@name='middleName']")
	WebElement middleNameE;
	
	//LastName Elment
	@FindBy(xpath="//*[@name='lastName']")
	WebElement lastNameE;
	
	//EmployeeId element
	@FindBy(xpath="//*[@class='oxd-input oxd-input--active']")
	WebElement employeeIDE;
	
	//Add Image Button
	@FindBy(xpath="//*[@class='employee-image']")
	WebElement imageAddPlusButtonE;
	
	//Create Login Details Element
	@FindBy(xpath="//*[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	WebElement createLoginDetailsE;
	
	//Cancel Button
	@FindBy(xpath="oxd-button oxd-button--medium oxd-button--ghost")
	WebElement cancelButtonE;
	
	//Save Buttin element
	@FindBy(xpath="//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement saveButtonE;
	
	//Personal Details Page Label Text
	@FindBy(xpath="//*[@class='oxd-text oxd-text--h6 orangehrm-main-title' and text()='Personal Details']")
	WebElement personalDetailsLabelTextE;
	
	
	//Business Logic
	//Pim Add Employee Page URL test
	public String addEmployeePage_CurrentURL() {
		return driver.getCurrentUrl();
	}
	
	//pim add employee page Add Employee Label Text Validation
	public String addEmployeeLabelText() {
		return addEmployeeLabelTextE.getText();
	}
	
	//
	public AddEmpPersonalDetailsPage addEmployee_CreateEmployee(String firstName,String middleName,String lastName) throws AWTException, InterruptedException, IOException {
		

		
		CommonOperations.sendKeys(firstNameE, firstName);
		CommonOperations.checkMandatoryFieldsEnteredOrNot(firstNameE);
		
		CommonOperations.sendKeys(middleNameE, middleName);
		CommonOperations.checkMandatoryFieldsEnteredOrNot(middleNameE);
		
		CommonOperations.sendKeys(lastNameE, lastName);
		CommonOperations.checkMandatoryFieldsEnteredOrNot(lastNameE);
		
		String employeeID=employeeIDE.getAttribute("value");
		
		Robot rt=CommonOperations.keyboardOperationsUsingRobotClass();
		
		rt.keyPress(KeyEvent.VK_SHIFT);
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyPress(KeyEvent.VK_SHIFT);
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyPress(KeyEvent.VK_SHIFT);
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyPress(KeyEvent.VK_SHIFT);
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_TAB);
		rt.keyRelease(KeyEvent.VK_SHIFT);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		Runtime.getRuntime().exec("F:\\backupdesktop\\AutomationPractice\\OrangeHRM_POM_TestNG\\src\\resources\\java\\com\\AutoItScriptandimages\\photoupload1.exe");
		
		addEmployee_SaveButton();
		
		CommonOperations.driverWait().until(ExpectedConditions.visibilityOf(personalDetailsLabelTextE));
		return new AddEmpPersonalDetailsPage();
	}
	
	
	private void addEmployee_SaveButton() {
		
		saveButtonE.click();
	}
	
	
}