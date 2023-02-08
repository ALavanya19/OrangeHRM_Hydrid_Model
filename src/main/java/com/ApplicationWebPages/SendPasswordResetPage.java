package com.ApplicationWebPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.BaseClass.Base;

@Listeners(com.Listeners.Listeners.class)
public class SendPasswordResetPage extends Base {

	public SendPasswordResetPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
    
	
	
	//Object repository
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
	WebElement resetPasswrodLinkSentSuccessfullyE;
	
	//Business Logic
	public String sendPasswordRest() {
		
		return resetPasswrodLinkSentSuccessfullyE.getText();
	}
	
	public String sendPasswordResetPageCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
}
