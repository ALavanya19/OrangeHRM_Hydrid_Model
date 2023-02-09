package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ApplicationWebPages.LoginPage;
import com.ApplicationWebPages.ResetPasswordPage;
import com.ApplicationWebPages.SendPasswordResetPage;
import com.BaseClass.Base;
import com.Config.PropertiesClass;
import com.Log.Log;

public class SendPasswordResetPageTest extends Base {


	LoginPage loginPage;
	ResetPasswordPage resetPassPage;
	SendPasswordResetPage sendPassRestPage;
	
	@BeforeMethod
	public void resetPasswordPage_SetUp() throws IOException {
		
		setUp();
		loginPage=new LoginPage();
		resetPassPage=loginPage.loginPage_ForgotYourPassword();
		sendPassRestPage=resetPassPage.resetPasswordPage_EnterUserName_ResetPassword(PropertiesClass.getProperties("userName"));
		Log.info("OrangeHRM Application LoginPage Launched Successfull for ResetPasswordPage sendResetPass link Testing");
	}
	@AfterMethod
	public void resetPasswordPage_TearDown() {
		extent.flush();
		tearDown();
	}
	
	@Test(priority=2, description = "SendPasswordRestPage Text Validation")
	public void sendPasswordRestTest() {
		
		test=extent.createTest("SendPasswordRestPage Text Validation");
		test.info("Validating SendPasswordRestPage Text");
		String actual_SendPasswordRestPage=sendPassRestPage.sendPasswordRest();
		String expected_SendPasswordRestPage="Reset Password link sent successfully";
		System.out.println(actual_SendPasswordRestPage);
		if(actual_SendPasswordRestPage.equals(expected_SendPasswordRestPage)) {
			test.pass("SendPasswordResetPage text validation Successfull");
			Log.info("SendPasswordResetPage text validation Successfull - PASS");
		}
		else {
			test.fail("SendPasswordResetPage text validation Unsuccessfull");
			Log.info("SendPasswordResetPage text validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 1, description = "SendPasswordResetPage Current Url validation")
	public void sendPasswordResetPageCurrentUrlTest() {
		
		test=extent.createTest("SendPasswordResetPage Current Url validation");
		test.info("Validating SendPasswordRestPage Current Url Text");
		String actual_SendPasswordRestPage=sendPassRestPage.sendPasswordResetPageCurrentUrl();
		String expected_SendPasswordRestPage="sendPasswordReset";
		if(actual_SendPasswordRestPage.contains(expected_SendPasswordRestPage)) {
			test.pass("SendPasswordResetPage Current Url validation Successfull");
			Log.info("SendPasswordResetPage Current Url validation Successfull - PASS");
		}
		else {
			test.fail("SendPasswordResetPage Current Url validation Unsuccessfull");
			Log.info("SendPasswordResetPage Current Url validation Unsuccessfull - FAIL");
		}
	}
}
