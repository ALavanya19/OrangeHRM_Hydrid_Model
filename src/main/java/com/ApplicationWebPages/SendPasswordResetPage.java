package com.ApplicationWebPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BaseClass.Base;

public class SendPasswordResetPage extends Base {

	public SendPasswordResetPage() throws IOException {
		super();
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
