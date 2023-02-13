package com.TestCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ApplicationWebPages.AddEmpPersonalDetailsPage;
import com.ApplicationWebPages.HomePIMPage;
import com.ApplicationWebPages.HomePage;
import com.ApplicationWebPages.LoginPage;
import com.ApplicationWebPages.PIMAddEmployeePage;
import com.BaseClass.Base;
import com.Config.PropertiesClass;
import com.Log.Log;

public class AddEmpPersonalDetailsPageTest extends Base {

	LoginPage loginPage;
	HomePage homePage;
	HomePIMPage homePimPage;
	PIMAddEmployeePage pimAddEmployeePage;
	AddEmpPersonalDetailsPage addEmpPersonalDetailsPage;
	
	
	@BeforeMethod
	public void homePimPage_SetUp() throws IOException, AWTException, InterruptedException {
		setUp();
		loginPage=new LoginPage();
		homePage=loginPage.loginPage_Login(PropertiesClass.getProperties("userName"), PropertiesClass.getProperties("Password"));
		homePimPage=homePage.homePIMPage();
		pimAddEmployeePage=homePimPage.pimAddEmployeeList();
		//addEmpPersonalDetailsPage=pimAddEmployeePage.addEmployee_CreateEmployee();
		Log.info("OrangeHRM Login Successfull and Navigated to PIM Page ADD employee Test Validation");
	}
	
	@AfterMethod
	public void homePimPage_TearDown() throws IOException {
		loginPage=homePage.homePage_UserDropDownLogout_Validation();
		extent.flush();
		tearDown();
	}
	
	public void addEmpPersonalDetailsTest() {
		test=extent.createTest("Add Employee Page Personal Details Page Test Validation");
		test.info("Add Employee Page Personal Details Page Test Validation");
		String actual_AddEmpPersonalDetailsCurrentUrl=addEmpPersonalDetailsPage.addEmpPersonalDetails();
		String expected_AddEmpPersonalDetailsCurrentUrl="pim/viewPersonalDetails";
		if(actual_AddEmpPersonalDetailsCurrentUrl.contains(expected_AddEmpPersonalDetailsCurrentUrl)) {
			test.pass("Add Employee Page Personal Details Page Test Validation Successfull");
			test.info("Add Employee Page Personal Details Page Test Validation Successfull - PASS");
		}
		else
		{
			test.fail("Add Employee Page Personal Details Page Test Validation Unsuccessfull");
			test.info("Add Employee Page Personal Details Page Test Validation Unsuccessfull - FAIL");
		}
		
	}
}
