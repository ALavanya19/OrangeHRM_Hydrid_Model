package com.ApplicationWebPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base;
import com.CommonActions.CommonOperations;

public class PIMAddEmployeePage extends Base{

	public PIMAddEmployeePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Object Repository
	//Add Employee Label Text
	@FindBy(xpath="//*[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	WebElement addEmployeeLabelTextE;
	
	//FirstName Element
	@FindBy(xpath="//*[@class='oxd-input oxd-input--active orangehrm-firstname']")
	WebElement firstNameE;
	
	//MiddleName Element
	@FindBy(xpath="//*[@class='oxd-input oxd-input--active orangehrm-middlename']")
	WebElement middleNameE;
	
	//LastName Elment
	@FindBy(xpath="//*[@class='oxd-input oxd-input--active orangehrm-lastname']")
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
	public void addEmployee_CreateEmployee() throws AWTException, InterruptedException {
		
		CommonOperations.sendKeys(firstNameE, "Ad");
		CommonOperations.sendKeys(middleNameE, "Le");
		CommonOperations.sendKeys(lastNameE, "Ch");
		Robot rt=CommonOperations.keyboardOperationsUsingRobotClass();
		rt.keyPress(KeyEvent.VK_SHIFT);
		rt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(15000);
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyPress(KeyEvent.VK_TAB);
		rt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(15000);
	    rt.keyRelease(KeyEvent.VK_TAB);
	    rt.keyRelease(KeyEvent.VK_SHIFT);
	    	    
	    StringSelection stringSelection = new StringSelection("C:\\Users\\lenovo\\Desktop\\photo.avif");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	    
		rt.keyPress(KeyEvent.VK_CONTROL);
        rt.keyPress(KeyEvent.VK_V);
        rt.keyRelease(KeyEvent.VK_V);
        rt.keyRelease(KeyEvent.VK_CONTROL);
        rt.keyPress(KeyEvent.VK_ENTER);
        rt.keyRelease(KeyEvent.VK_ENTER);
       
	    Thread.sleep(15000);
	    //Actions act=CommonOperations.keyboardOperationsUsingActionsClass(driver);
	   // act.sendKeys("C:\\Users\\lenovo\\Desktop\\photo.avif");
	    Thread.sleep(15000);
	    rt.keyPress(KeyEvent.VK_TAB);
	    rt.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(15000);
	    rt.keyPress(KeyEvent.VK_ENTER);
	    
	    //addEmployee_SaveButton();
	    //CommonOperations.sendKeys(imageAddPlusButtonE, "C:\\Users\\lenovo\\Desktop\\photo.avif");
		
	}
	
	private void addEmployee_SaveButton() {
		
		saveButtonE.click();
	}
	
}
