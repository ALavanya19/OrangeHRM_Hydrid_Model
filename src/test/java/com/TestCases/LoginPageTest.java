package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ApplicationWebPages.LoginPage;
import com.BaseClass.Base;
import com.Config.PropertiesClass;
import com.ExcelCommonOperations.ExcelCommands;
import com.Log.Log;

@Listeners(com.Listeners.Listeners.class)
public class LoginPageTest extends Base {

	String inputFilePath="./src/resources/java/com/TestDataInputFiles/OrangeHRMTestData.xlsx";
	String sheetName="LoginPage";

	LoginPage loginPage;
     
	@BeforeMethod
	//SetUp browser and orangeHRM application 
	public void loginPage_setUp() throws IOException {
	
		setUp();
		ExcelCommands.loadExcelFile(inputFilePath, sheetName);
		loginPage=new LoginPage();
		Log.info("OrangeHRM Application LoginPage Launched Successfully");
		
	}
	
	@AfterMethod
	//Close browser
	public void loginPage_TearDown() throws IOException {
		ExcelCommands.excelSave(inputFilePath);
		extent.flush();
		tearDown();
	}
	
	@Test(priority=1, description = "LoginPage title validation")
	public void loginPage_Title_Test() {
		
		test=extent.createTest("LoginPage Title Validation");
		test.info("Validating LoginPage Title");
		String actual_LoginPage_Title=loginPage.loginPage_Title();
		ExcelCommands.setStringCellValue(1, 1, actual_LoginPage_Title);
		String expected_LoginPage_Title=ExcelCommands.getStringCellValue(1, 0);
		if(actual_LoginPage_Title.equals(expected_LoginPage_Title))
		{
		     test.pass("LoginPage Title Validation Successfully");
		     Log.info("LoginPage Title Validation Successfully - PASS");
		     ExcelCommands.setStringCellValue(1, 2, "PASS");
		     
		}
		else
		{
			test.fail("LoginPage Title Validation Unsuccessfully");
		     Log.info("LoginPage Title Validation Unsuccessfully - FAIL");
		     ExcelCommands.setStringCellValue(1, 2, "FAIL");
		}
	}
	
	@Test(priority=2, description = "Loginpage CurrentUrl Validation")
	public void loginPage_CurrentUrl_Test() {
		
		test=extent.createTest("LoginPage Current Url Validation");
		test.info("Validating LoginPage Current Url");
		String actual_LoginPage_CurrentUrl=loginPage.loginPage_CurrentUrl();
		ExcelCommands.setStringCellValue(1, 4,actual_LoginPage_CurrentUrl);
		String expected_LoginPage_CurrentUrl=ExcelCommands.getStringCellValue(1, 3);
		if(actual_LoginPage_CurrentUrl.contains(expected_LoginPage_CurrentUrl))
		{
		    //Assert.assertEquals(actual_LoginPage_CurrentUrl, expected_LoginPage_CurrentUrl);
		      test.pass("LoginPage Current Url Validation Successfully");
		      Log.info("LoginPage Current Url Validation Successfully - PASS");
		      ExcelCommands.setStringCellValue(1, 5, "PASS");
		}
		else
		{
			test.fail("LoginPage Current Url Validation Unsuccessfully");
		     Log.info("LoginPage Current Url Validation UnsSuccessfully - FAIL");
		     ExcelCommands.setStringCellValue(1, 5, "FAIL");
		}
	}
	
	@Test(priority=3, description = "LoginPage OrangeHRM Logo Image on Top")
	public void loginPage_OrangeHRMLogoTest() {
		
		test=extent.createTest("LoginPage OrangeHRM Logo Validation");
		test.info("Validating LoginPage OraneHRM Logo");
		boolean flag=loginPage.loginPage_OrangeHRMLogo();
		if(flag=true) {
			ExcelCommands.setStringCellValue(1, 10, "True");
			ExcelCommands.setStringCellValue(1, 11, "PASS");
			test.pass("LoginPage OrangeHRM Logo Validation Successfully");
			Log.info("LoginPage OrangeHRM Logo Validation Successfully - PASS");	
		}
		else
		{
			ExcelCommands.setStringCellValue(1, 10, "False");
			ExcelCommands.setStringCellValue(1, 11, "FAIL");
			test.fail("LoginPage OrangeHRM Logo Validation Unsuccessfully");
			Log.info("LoginPage OrangeHRM Logo Validation Unsuccessfully - FAIL");
		}
			
	}
	
	@Test(priority=4, description = "LoginPage login Test")
	public void loginPage_LoginTest() {
		
		test=extent.createTest("LoginPage Login Validation");
		test.info("Validating LoginPage Login");
		String userName=PropertiesClass.getProperties("userName");
		String password=PropertiesClass.getProperties("Password");
		loginPage.loginPage_Login(userName, password);
		Log.info("Entered Username and Password Successfully");
	}
	
	@Test(priority = 5, description = "LoginPage LoginLabelText Validation")
	public void loginPage_loginLabelText_Test() {
		test=extent.createTest("LoginPage LoginLabelText Validation");
		test.info("LoginPage LoginLabelText Validation");
		String actual_LoginLabelText=loginPage.loginLabelText();
		ExcelCommands.setStringCellValue(1, 7, actual_LoginLabelText);
		String expected_LoginLabelText=ExcelCommands.getStringCellValue(1, 6);
		if(actual_LoginLabelText.equals(expected_LoginLabelText))
		{
			  ExcelCommands.setStringCellValue(1, 8, "PASS");
		      test.pass("LoginPage LoginLabelText Validation Successfully");
		      Log.info("LoginPage LoginLabelText Validation Successfully - PASS");
		}
		else
		{
			ExcelCommands.setStringCellValue(1, 8, "FAIL");
			test.fail("LoginPage LoginLabelText Validation Unsuccessfully");
		     Log.info("LoginPage LoginLabelText Validation UnsSuccessfully - FAIL");
		}
	}

}
