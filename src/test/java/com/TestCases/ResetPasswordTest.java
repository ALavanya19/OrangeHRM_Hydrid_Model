package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ApplicationWebPages.LoginPage;
import com.ApplicationWebPages.ResetPasswordPage;
import com.ApplicationWebPages.SendPasswordResetPage;
import com.BaseClass.Base;
import com.Config.PropertiesClass;
import com.Log.Log;

@Listeners(com.Listeners.Listeners.class)

public class ResetPasswordTest extends Base{
	
	public ResetPasswordTest() throws IOException {
	    super();
	}

	LoginPage loginPage;
	ResetPasswordPage resetPassPage;
	SendPasswordResetPage sendPassPage;
	
	@BeforeMethod
	public void resetPasswordPage_SetUp() throws IOException {
		
		setUp();
		loginPage=new LoginPage();
		resetPassPage=loginPage.loginPage_ForgotYourPassword();
		sendPassPage=new SendPasswordResetPage();
		Log.info("OrangeHRM Application LoginPage Launched Successfull for ResetPasswordPage Testing");
	}
	@AfterMethod
	public void resetPasswordPage_TearDown() {
		extent.flush();
		tearDown();
	}
	
	@Test(priority=1, description = "ResetPasswordPage ResetPassword Text Test ")
	public void resetPasswordPage_ResetPasswordTextTest() {
		test=extent.createTest("ResetPasswordPage ResetPassword Text Test");
		test.info("Validating ResetPasswordPage ResetPasswordText");
        String actual_ResetPassPage_ResetPasswordText=resetPassPage.resetPasswordPage_ResetPasswordText();
        String expected_ResetPassPage_ResetPasswordText="Reset Password";
        if(actual_ResetPassPage_ResetPasswordText.equals(expected_ResetPassPage_ResetPasswordText)) {
        	test.pass("ResetPasswordPage ResetPassword Text validation Successfull");
	    	Log.info("ResetPasswordPage ResetPaswword Text validation Successfull - PASS");
	    }
	    else
	    {
	    	test.fail("ResetPasswordPage ResetPaswword Text validation Unsuccessfull");
	    	Log.info("ResetPasswordPage ResetPaswword Text validation Unsuccessfull - FAIL");
	    }

	}
	@Test(priority=2, description = "ResetPasswordPage CurrentUrl")
	public void resetPasswordPage_CurrentUrlTest() {
		
		test=extent.createTest("ResetPasswordPage CurrentUrl");
		test.info("Validating ResetPasswordPage ResetPassword Link");
		String actual_ResetPassPage_CurrentURL=resetPassPage.resetPasswordPage_CurrentUrl();
	    String expected_ResetPassPage_CurrentUrl="requestPasswordResetCode";
	    if(actual_ResetPassPage_CurrentURL.contains(expected_ResetPassPage_CurrentUrl)) {
	    	test.pass("ResetPasswordPage ResetPaswword Link validation Successfull");
	    	Log.info("ResetPasswordPage ResetPaswword Link validation Successfull - PASS");
	    }
	    else
	    {
	    	test.fail("ResetPasswordPage ResetPaswword Link validation Unsuccessfull");
	    	Log.info("ResetPasswordPage ResetPaswword Link validation Unsuccessfull - FAIL");
	    }
	}
	
	@Test(priority=3, description = "ResetPasswordPage CancelButton Test")
    public void resetPasswordPage_EnterUserName_CancelTest() throws IOException {
		loginPage=new LoginPage();
		test=extent.createTest("ResetPasswordPage CancelButton Test");
		test.info("Validating ResetPasswordPage ResetPassword Link with cancel button");
		String userName=PropertiesClass.getProperties("userName");
		loginPage=resetPassPage.resetPasswordPage_EnterUserName_Cancel(userName);
		loginPage.loginPage_ForgotYourPassword();
		Log.info("Entered invalid userName for resetPassword successfully");
	}

	@Test(priority=4, description = "ResetPasswordPage ResetPassword Button Test")
	public void resetPasswordPage_EnterUserName_ResetPasswordTest() throws IOException {
		
		test=extent.createTest("ResetPasswordPage ResetPassword Button Test");
		test.info("Validating ResetPasswordPage ResetPassword Link");
		String userName=PropertiesClass.getProperties("userName");
		sendPassPage=resetPassPage.resetPasswordPage_EnterUserName_ResetPassword(userName);
		Log.info("Entered Username for ResetPassword successfully");
	}
	
	
}
