package com.TestCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ApplicationWebPages.HomePIMPage;
import com.ApplicationWebPages.HomePage;
import com.ApplicationWebPages.LoginPage;
import com.ApplicationWebPages.PIMAddEmployeePage;
import com.ApplicationWebPages.PIMEmployeeListPage;
import com.BaseClass.Base;
import com.Config.PropertiesClass;
import com.Log.Log;

public class PIMAddEmployeeTest extends Base {

    
	LoginPage loginPage;
	HomePage homePage;
	HomePIMPage homePimPage;
	PIMAddEmployeePage pimAddEmployeePage;
	
	@BeforeMethod
	public void homePimPage_SetUp() throws IOException {
		setUp();
		loginPage=new LoginPage();
		homePage=loginPage.loginPage_Login(PropertiesClass.getProperties("userName"), PropertiesClass.getProperties("Password"));
		homePimPage=homePage.homePage_PIM_Validation();
		pimAddEmployeePage=homePimPage.pimAddEmployeeList();
		Log.info("OrangeHRM Login Successfull and Navigated to PIM Page ADD employee Test Validation");
	}
	
	@AfterMethod
	public void homePimPage_TearDown() throws IOException {
		loginPage=homePage.homePage_UserDropDownLogout_Validation();
		extent.flush();
		tearDown();
	}
	
	@Test
	public void addEmployee_CreateEmployee_Test() throws AWTException, InterruptedException {
		
		pimAddEmployeePage.addEmployee_CreateEmployee();
		Thread.sleep(15000);
		
	}
	
	
}
