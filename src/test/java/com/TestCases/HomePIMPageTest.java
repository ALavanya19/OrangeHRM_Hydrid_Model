package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ApplicationWebPages.HomePIMPage;
import com.ApplicationWebPages.HomePage;
import com.ApplicationWebPages.LoginPage;
import com.ApplicationWebPages.PIMAddEmployeePage;
import com.ApplicationWebPages.PIMConfigurationCustomerFieldsPage;
import com.ApplicationWebPages.PIMConfigurationDataImportPage;
import com.ApplicationWebPages.PIMConfigurationOptionalFieldsPage;
import com.ApplicationWebPages.PIMConfigurationReportingMethodsPage;
import com.ApplicationWebPages.PIMConfigurationTerminationReasonsPage;
import com.ApplicationWebPages.PIMEmployeeListPage;
import com.ApplicationWebPages.PIMReportsPage;
import com.BaseClass.Base;
import com.Config.PropertiesClass;
import com.Log.Log;

public class HomePIMPageTest extends Base {

	LoginPage loginPage;
	HomePage homePage;
	HomePIMPage homePimPage;
	PIMEmployeeListPage pimEmployeeListPage;
	PIMAddEmployeePage pimAddEmployeePage;
	PIMReportsPage pimReportsPage;
	PIMConfigurationOptionalFieldsPage pimConfigurationOptinalFieldsPage;
	PIMConfigurationCustomerFieldsPage pimConfigurationCustomerFieldsPage;
	PIMConfigurationReportingMethodsPage pimConfigurationReportingMethodsPage;
	PIMConfigurationDataImportPage pimConfigurationDataImportPage;
	PIMConfigurationTerminationReasonsPage pimConfigurationTerminationReasonsPage;
	
	@BeforeMethod
	public void homePimPage_SetUp() throws IOException {
		setUp();
		loginPage=new LoginPage();
		homePage=loginPage.loginPage_Login(PropertiesClass.getProperties("userName"), PropertiesClass.getProperties("Password"));
		homePimPage=homePage.homePIMPage();
		Log.info("OrangeHRM Login Successfull and Navigated to PIM Page Test Validation");
	}
	
	@AfterMethod
	public void homePimPage_TearDown() throws IOException {
		loginPage=homePage.homePage_UserDropDownLogout_Validation();
		extent.flush();
		tearDown();
	}
	
	@Test(priority = 1,description = "HomePIMPage Current Url Validation")
	public void pimPage_CurrentURL_Test() {
		
		test=extent.createTest("HomePIMPage Current Url Validation Test");
		test.info("HomePIMPage Current Url Validation");
		String expected_PimPageCurrentURL="pim/viewEmployeeList";
		String actual_PimPageCurrentURL=homePimPage.pimPage_CurrentURL();
		if(actual_PimPageCurrentURL.contains(expected_PimPageCurrentURL))
		{
			test.pass("HomePIMPage Current Url Validation Successfull");
			test.info("HomePIMPage Current Url Validation Successfull - PASS");
		}
		else {
			test.pass("HomePIMPage Current Url Validation Unsuccessfull");
			test.info("HomePIMPage Current Url Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 2, description = "HomePimPage pimPage_Label Validation")
	public void pimPage_Label_Test() {
		test=extent.createTest("HomePimPage pimPage_Label Validation Test");
		test.info("HomePimPage pimPage_Label Validation");
		String expected_PimPageLabelText="PIM";
		String actual_PimPageLabelText=homePimPage.pimPage_Label();
		if(actual_PimPageLabelText.contains(expected_PimPageLabelText))
		{
			test.pass("HomePIMPage pimPage_Label Validation Successfull");
			test.info("HomePIMPage pimPage_Label Validation Successfull - PASS");
		}
		else {
			test.pass("HomePIMPage pimPage_Label Validation Unsuccessfull");
			test.info("HomePIMPage pimPage_Label Validation Unsuccessfull - FAIL");
		}
		
	}
	
	@Test(priority = 3, description = "HomePimPage pimEmployeeList Validation Test")
	public void pimEmployeeList_Test() {
		test=extent.createTest("HomePimPage pimEmployeeList Validation Test");
		test.info("HomePimPage pimEmployeeList Validation Test");
		pimEmployeeListPage=homePimPage.pimEmployeeList();
		Log.info("HomePimPage EmployeeList element clicked Successfully and Navigated to EmployeeList Page");
	}
	
	@Test(priority = 4, description = "HomePimPage pimAddEmployee Validation Test")
	public void pimAddEmployeeList_Test() {
		test=extent.createTest("HomePimPage pimAddEmployee Validation Test");
		test.info("HomePimPage pimAddEmployee Validation Test");
		pimAddEmployeePage=homePimPage.pimAddEmployeeList();
		Log.info("HomePimPage Add employee element clicked Successfully and Navigated to Add Employee Page");
	}
	
	@Test(priority = 5,description = "HomePimPage pimReports Validation Test")
	public void pimReports_Test() {
		test=extent.createTest("HomePimPage pimReports Validation Test");
		test.info("HomePimPage pimReports Validation Test");
		pimReportsPage=homePimPage.pimReports();
		Log.info("HomePimPage Reports element clicked Successfully and Navigated to Add Reports Page");
	}
	
	@Test(priority = 6, description = "HomePimPage ConfigurationOptionalFields Validation Test")
	public void pimConfigurationOptionalFields_Test() {
		test=extent.createTest("HomePimPage ConfigurationOptionalFields Validation Test");
		test.info("HomePimPage ConfigurationOptionalFields Validation Test");
		pimConfigurationOptinalFieldsPage=homePimPage.pimConfigurationOptionalFields();
		Log.info("HomePimPage Configuration Optional Fields element clicked Successfully and Navigated to Configuration Optional Fields Page");
	}

	
	
}
