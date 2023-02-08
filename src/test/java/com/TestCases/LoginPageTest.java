package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BaseClass.Base;
import com.BaseClass.LoginPage;
import com.Config.PropertiesClass;
import com.Log.Log;

@Listeners(com.Listeners.Listeners.class)
public class LoginPageTest extends Base {

	String expected_LoginPage_Title="OrangeHRM";
	String expected_LoginPage_CurrentUrl="login";
	
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	LoginPage loginPage;
     
	@BeforeTest
	//SetUp browser and orangeHRM application 
	public void loginPage_setUp() throws IOException {
	
		steUp();
		loginPage=new LoginPage(driver);
		Log.info("OrangeHRM Application LoginPage Launched Successfully");
		
	}
	
	@Test(priority=1, description = "LoginPage title validation")
	public void loginPage_Title_Test() {
		
		test=extent.createTest("LoginPage Title Validation");
		test.info("Validating LoginPage Title");
		String actual_LoginPage_Title=loginPage.loginPage_Title();
		if(actual_LoginPage_Title.equals(expected_LoginPage_Title))
		{
		    //Assert.assertEquals(actual_LoginPage_Title, expected_LoginPage_Title);
		     test.pass("LoginPage Title Validation Successfully");
		     Log.info("LoginPage Title Validation Successfully - PASS");
		}
		else
		{
			test.fail("LoginPage Title Validation Unsuccessfully");
		     Log.info("LoginPage Title Validation Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority=2, description = "Loginpage CurrentUrl Validation")
	public void loginPage_CurrentUrl_Test() {
		
		test=extent.createTest("LoginPage Current Url Validation");
		test.info("Validating LoginPage Current Url");
		String actual_LoginPage_CurrentUrl=loginPage.loginPage_CurrentUrl();
		if(actual_LoginPage_CurrentUrl.contains(actual_LoginPage_CurrentUrl))
		{
		    //Assert.assertEquals(actual_LoginPage_CurrentUrl, expected_LoginPage_CurrentUrl);
		      test.pass("LoginPage Current Url Validation Successfully");
		      Log.info("LoginPage Current Url Validation Successfully - PASS");
		}
		else
		{
			test.fail("LoginPage Current Url Validation Unsuccessfully");
		     Log.info("LoginPage Current Url Validation UnsSuccessfully - FAIL");
		}
	}
	
	@Test(priority=3, description = "LoginPage OrangeHRM Logo Image on Top")
	public void loginPage_OrangeHRMLogoTest() {
		
		test=extent.createTest("LoginPage OrangeHRM Logo Validation");
		test.info("Validating LoginPage OraneHRM Logo");
		boolean flag=loginPage.loginPage_OrangeHRMLogo();
		if(flag=true) {

			test.pass("LoginPage OrangeHRM Logo Validation Successfully");
			Log.info("LoginPage OrangeHRM Logo Validation Successfully - PASS");	
		}
		else
		{

			test.fail("LoginPage OrangeHRM Logo Validation Unsuccessfully");
			Log.info("LoginPage OrangeHRM Logo Validation Unsuccessfully - FAIL");
		}
			
	}
	
	@Test(priority=4, description = "LoginPage login Test")
	public void loginPage_Login() {
		
		test=extent.createTest("LoginPage Login Validation");
		test.info("Validating LoginPage Login");
		String userName=PropertiesClass.getProperties("userName");
		String password=PropertiesClass.getProperties("Password");
		loginPage.loginPage_Login(userName, password);
		Log.info("Entered Username and Password Successfully");
	}
	
	@AfterTest
	//Close browser
	public void loginPage_TearDown() {
		
		extent.flush();
		tearDown();
	}
	
}
