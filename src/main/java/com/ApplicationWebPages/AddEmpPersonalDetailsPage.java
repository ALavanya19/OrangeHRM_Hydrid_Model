package com.ApplicationWebPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base;

public class AddEmpPersonalDetailsPage extends Base {

	AddEmpPersonalDetailsPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Object Repository
	
	@FindBy(xpath="//*[@class='oxd-text oxd-text--h6 orangehrm-main-title' and text()='Personal Details']")
	WebElement personalDetailsLabelTextE;
	
	//firtsName element
	@FindBy(xpath="//*[@name='firstName']")
	WebElement firstNameE;
	
	@FindBy(xpath="//*[@name='middleName']")
	WebElement middleNameE;
	
	@FindBy(xpath="//*[@name='lastName']")
	WebElement lastNameE;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")
	WebElement nickNameE;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")
	WebElement empIDE;
	
	@FindBy(xpath="//*[@class='oxd-input-group oxd-input-field-bottom-space']//div[@class='oxd-select-text-input' and @tabindex='0' and text()='-- Select --']")
	List<WebElement>personalDetailsDropDownsListE;
	
	@FindBy(xpath="//*[@class='--gender-grouped-field']//*[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")
	List<WebElement>genderRadioButtonsListE;
	
	@FindBy(xpath="//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	WebElement smokerCheckBoxE;
	
	@FindBy(xpath="//*[@class='oxd-date-wrapper']//*[@class='oxd-input oxd-input--active' and @placeholder='yyyy-mm-dd']")
	List<WebElement>datePickerListE;
	
	
	//Business logic
	public String addEmpPersonalDetails() {
		return driver.getCurrentUrl();
	
	}
}
