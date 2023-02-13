package com.ApplicationWebPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ApplicationWebPages.HomePage;
import com.BaseClass.Base;
import com.CommonActions.CommonOperations;
import com.Log.Log;

public class LoginPage extends Base{

	public LoginPage() throws IOException{
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Object Repository
	
	//OrangeHRM Logo
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement orangeHRMLogoE;
	
	//Login Label Text
	@FindBy(xpath="//*[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
	WebElement loginLabelTextE;
	
	//UserName Element 
	@FindBy(xpath="//input[@name='username']")
	WebElement userNameE;
	
	//Password Element
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordE;
	
	//Login Button Element
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement loginButtonE;
	
	//Forgot Your Password Element
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgotYorPasswordE;
	
	
	
	//Business Logic
	
	//Validating LoginPage Title
	public String loginPage_Title() {
		
		return driver.getTitle();
	}
	
	//validating LoginPage Current Url
	public String loginPage_CurrentUrl() {
		
		return driver.getCurrentUrl();
		
	}
	
	//validating OrangeHRMImage on Top
	public boolean loginPage_OrangeHRMLogo() {
		
	   return orangeHRMLogoE.isDisplayed();
	      
	}
	
	//Login Panel Text
	public String loginLabelText() {
		return loginLabelTextE.getText();
	}
	
	//validating LoginPage Login
	public HomePage loginPage_Login(String userName,String password) throws IOException {
		CommonOperations.sendKeys(userNameE, userName);
		String userNameAttribute=userNameE.getAttribute("value");
		CommonOperations.checkMandatoryFieldsEnteredOrNot(userNameE);
		
		CommonOperations.sendKeys(passwordE, password);
	    CommonOperations.checkMandatoryFieldsEnteredOrNot(passwordE);
		CommonOperations.click(loginButtonE);
		
		return new HomePage();
		
	}
	
	//validating LoginPage forgot your password
	public ResetPasswordPage loginPage_ForgotYourPassword() throws IOException {
		CommonOperations.click(forgotYorPasswordE);
		return new ResetPasswordPage();
	}
	
	
}

