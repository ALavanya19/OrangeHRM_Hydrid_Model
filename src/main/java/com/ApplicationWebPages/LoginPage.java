package com.ApplicationWebPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ApplicationWebPages.HomePage;
import com.BaseClass.Base;
import com.CommonActions.CommonOperations;

public class LoginPage extends Base{

	public LoginPage() throws IOException{
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Object Repository
	
	//OrangeHRM Logo
	@FindBy(xpath="//img[@alt='company-branding']")
	WebElement orangeHRMLogoE;
	
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
	
	//validating LoginPage Login
	public HomePage loginPage_Login(String userName,String password) {
		CommonOperations.sendKeys(userNameE, userName);
		CommonOperations.sendKeys(passwordE, password);
		CommonOperations.click(loginButtonE);
		
		return new HomePage();
		
	}
	
	//validating LoginPage forgot your password
	public ResetPasswordPage loginPage_ForgotYourPassword() throws IOException {
		CommonOperations.click(forgotYorPasswordE);
		return new ResetPasswordPage();
	}
	
	
}

