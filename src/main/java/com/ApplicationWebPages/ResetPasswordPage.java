package com.ApplicationWebPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base;
import com.CommonActions.CommonOperations;
import com.Config.PropertiesClass;

public class ResetPasswordPage extends Base {
    
	public ResetPasswordPage()throws IOException {
	    PageFactory.initElements(driver, this);
	}
      
    //Object Repository
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	WebElement userNameE;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")
	WebElement resetPasswordE;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--large oxd-button--ghost orangehrm-forgot-password-button orangehrm-forgot-password-button--cancel']")
	WebElement cancelE;
    
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
	WebElement resetPasswordTextE;
	
	
	//Business Logic
	public SendPasswordResetPage resetPasswordPage_EnterUserName_ResetPassword(String userName) throws IOException {
		
		CommonOperations.sendKeys(userNameE,userName);
		CommonOperations.click(resetPasswordE);
		return new SendPasswordResetPage();
	}
	
    public LoginPage resetPasswordPage_EnterUserName_Cancel(String userName) throws IOException {
		
		CommonOperations.sendKeys(userNameE,userName);
		CommonOperations.click(cancelE);
		return new LoginPage();
	}
	 
    public String resetPasswordPage_CurrentUrl() {
    	
       return driver.getCurrentUrl();
    }
    
    public String resetPasswordPage_ResetPasswordText() {
    	return resetPasswordE.getText();
    }
	
}
