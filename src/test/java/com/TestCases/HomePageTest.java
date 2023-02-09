package com.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ApplicationWebPages.HomeAdminPage;
import com.ApplicationWebPages.HomeLeavePage;
import com.ApplicationWebPages.HomeMyInfoPage;
import com.ApplicationWebPages.HomePIMChangePasswordPage;
import com.ApplicationWebPages.HomePIMPage;
import com.ApplicationWebPages.HomePage;
import com.ApplicationWebPages.HomeRecruitmentPage;
import com.ApplicationWebPages.LoginPage;
import com.BaseClass.Base;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.aventstack.extentreports.ExtentTest;

@Listeners(com.Listeners.Listeners.class)
public class HomePageTest extends Base {

	
	
	public HomePageTest() {
		super();
	}
	
	LoginPage loginPage;
	HomeAdminPage homeAdminPage;
	HomePIMPage homePIMPage;
	HomeLeavePage homeLeavePage;
	HomeRecruitmentPage homeRecruitmentPage;
	HomeMyInfoPage homeMyInfoPage;
	HomePage homePage;
	HomePIMChangePasswordPage homePImChangePasswordPage;
	
	@BeforeMethod
	public void homePage_SetUp() throws IOException {
		setUp();
		loginPage=new LoginPage();
		homePage=loginPage.loginPage_Login(PropertiesClass.getProperties("userName"), PropertiesClass.getProperties("Password"));
		Log.info("OrangeHRM application Logged in for HomePage Test validations");
		
	}
	
	@AfterMethod
	public void homePage_TearDown() {
		
		extent.flush();
		tearDown();
	}
	
	@Test(priority=1, description = "HomePage Current Url Test")
	public void homePage_CurrentUrl_ValidationTest() {
		test=extent.createTest("HomePage Current Url Test");
		test.info("HomePage Current Url Test");
	    String actual_HomePage_CurrentURL=homePage.homePage_CurrentUrl_Validation();
	    String expected_HomeDashboardPageUrl="dashboard/index";
	    if(actual_HomePage_CurrentURL.contains(expected_HomeDashboardPageUrl)) {
	    	test.pass("HomePage Current Url Validation Successfull");
	    	Log.info("HomePage Current Url Validation Successfull - PASS");
	    }
	    else
	    {
	    	test.fail("HomePage Current Url Validation Successfull");
	    	Log.info("HomePage Current Url Validation Successfull - FAIL");
	    }
	}
	
	@Test(priority = 2, description = "HomePage OrangeHRM Logo Validation Test")
	public void homePage_OrangeHRMLogo_ValidationTest() {
		test=extent.createTest("HomePage OrangeHRM Logo Validation Test");
		test.info("HomePage OrangeHRM Logo Validation Test");
		boolean flag=homePage.homePage_OrangeHRMLogo_Validation();
		if(flag=true) {
			test.pass("HomePage OrangeHRM Logo Validation Successfull");
	    	Log.info("HomePage OrangeHRM Logo Validation Successfull - PASS");
	    }
	    else
	    {
	    	test.fail("HomePage OrangeHRM Logo Validation Successfull");
	    	Log.info("HomePage OrangeHRM Logo Validation Successfull - FAIL");
	    }
	}
	
	@Test(priority = 3,description = "HomePage Admin Element Validation Test")
    public void homePage_Admin_ValidationTest() {
		test=extent.createTest("HomePage Admin Element Validation Test");
		test.info("HomePage Admin Element Validation Test");
		homePage.homePage_Admin_Validation();
		Log.info("HomePage Admin clicked and Navigated to Admin Page Successfully");
	}
	
	@Test(priority = 4, description = "HomePage PIM Element Validation Test")
	public void homePage_PIM_ValidationTest() {
		test=extent.createTest("HomePage PIM Element Validation Test");
		test.info("HomePage PIM Element Validation Test");
		homePage.homePage_PIM_Validation();
		Log.info("HomePage PIM clicked and Navigated to PIM Page Successfully");
	}
	
	@Test(priority = 5, description = "HomePage Leave Element Validation Test")
	public void homePage_Leave_ValidationTest() {
		test=extent.createTest("HomePage Leave Element Validation Test");
		test.info("HomePage Leave Element Validation Test");
		homePage.homePage_Leave_Validation();
		Log.info("HomePage Leave clicked and Navigated to Leave Page Successfully");
		
	}
	
	@Test(priority = 6, description = "HomePage Dashboard Element Validation Test")
	public void homePage_DashboardValidationTest() {
		test=extent.createTest("HomePage Dashboard Element Validation Test");
		test.info("HomePage Dashboard Element Validation Test");
		homePage.homePage_DashboardValidation();
		Log.info("HomePage Dashboard clicked and Navigated to Dashboard Page Successfully");
	}
	
	@Test(priority = 7,description = "HomePage Current Active Page text Validation")
	public void homePage_CurrentActivePage_ValidationTest() {
		test=extent.createTest("HomePage Current Active Page text Validation");
		test.info("HomePage Current Active Page text Validation");
		String actual_CurrentlyActivePageName=homePage.homePage_CurrentActivePage_Validation();
		String expected_CurrentlyActivePageName="Dashboard";
		if(actual_CurrentlyActivePageName.equals(expected_CurrentlyActivePageName)) {
			test.pass("HomePage Current Active Page Text Validation Successfull");
	    	Log.info("HomePage Current Active Page Text Validation Successfull - PASS");
	    }
	    else
	    {
	    	test.fail("HomePage Current Active Page Text Validation Successfull");
	    	Log.info("HomePage Current Active Page Text Validation Successfull - FAIL");
	    }
		
	}

	@Test(priority = 8,description = "HomePage UserProfilePhoto Validation")
	public void homePage_UserProfilePhoto_ValidationTest() {
		test=extent.createTest("HomePage UserProfilePhoto Validation");
		test.info("HomePage UserProfilePhoto Validation");
		boolean flag=homePage.homePage_UserProfilePhoto_Validation();
		if(flag=true) {
			test.pass("HomePage UserProfilePhoto  Validation Successfull");
	    	Log.info("HomePage UserProfilrPhoto Validation Successfull - PASS");
	    }
	    else
	    {
	    	test.fail("HomePage UserProfilePhoto Validation Successfull");
	    	Log.info("HomePage UserProfilePhoto Validation Successfull - FAIL");
	    }
	}
	
	@Test(priority = 9, description = "HomePage Logged In UserName Validation")
	public void homePage_LoggedInUserName_ValidationTest() {
		test=extent.createTest("HomePage Logged In UserName Validation");
		test.info("HomePage Logged in UserName Validation");
		String actual_LoggedInUserName=homePage.homePage_LoggedInUserName_Validation();
		String expected_LoggedInUserName="John Cena";
		if(actual_LoggedInUserName.equals(expected_LoggedInUserName)) {
			test.pass("HomePage Logged in UserName Validation Successfull");
	    	Log.info("HomePage Logged in UserName Validation Successfull - PASS");
	    }
	    else
	    {
	    	test.fail("HomePage Logged in UserName Validation Validation Successfull");
	    	Log.info("HomePage Logged in UserName Validation Validation Successfull - FAIL");
	    }
		
	}
		
	
	@Test(priority = 10,description = "HomePage UserDropDown About Text Validation")
	public void homePage_UserDropDownAbout_ValidationTest() {
		test=extent.createTest("HomePage UserDropDown About Text Validation");
		test.info("HomePage UserDropDown About Text Validation");
		test=extent.createTest("HomePage UserDropDown Button Validation");
		test.info("HomePage UserDropDown Button Validation");
		homePage.homePage_UserDropDownListButton_Validation();
		Log.info("HomePage UserDropDown Button Clicked");
		
		String actual_UserDropDownAboutLabelText=homePage.homePage_UserDropDownAbout_Validation();
		String expected_UserDropDownAboutLabelText="About";
		if(actual_UserDropDownAboutLabelText.equals(expected_UserDropDownAboutLabelText)) {
			test.pass("HomePage UserDropDown About Text Validation Successfull");
	    	Log.info("HomePage UserDropDown About Text Validation Successfull - PASS");
	    }
	    else
	    {
	    	test.fail("HomePage UserDropDown About Text Validation Successfull");
	    	Log.info("HomePage UserDropDown About Text Validation Successfull - FAIL");
	    }

	}
	
	@Test(priority = 11, description = "HomePage UserDropDown Support Mail Validation")
	public void homePage_UserDropDownSupport_ValidationTest() {
		test=extent.createTest("HomePage UserDropDown Support Mail Validation");
		test.info("HomePage UserDropDown Support Mail Validation");
		test=extent.createTest("HomePage UserDropDown Button Validation");
		test.info("HomePage UserDropDown Button Validation");
		homePage.homePage_UserDropDownListButton_Validation();
		Log.info("HomePage UserDropDown Button Clicked");
		String actual_UserDropDownSupportEmailID=homePage.homePage_UserDropDownSupport_Validation();
		String expected_UserDropDownAboutLabelText=" ossupport@orangehrm.com ";
		if(actual_UserDropDownSupportEmailID.equals(expected_UserDropDownAboutLabelText)) {
			test.pass("HomePage UserDropDown Support Mail Validation Successfull");
	    	Log.info("HomePage UserDropDown Support Mail Validation Successfull - PASS");
	    }
	    else
	    {
	    	test.fail("HomePage UserDropDown Support Mail Validation Successfull");
	    	Log.info("HomePage UserDropDown Support Mail Validation Successfull - FAIL");
	    }
		
	}
	
	@Test(priority = 12,description = "HomePage Logout Option Validation")
	public void homePage_UserDropDownLogout_ValidationTest() throws IOException {
		test=extent.createTest("HomePage Logout option Validation");
		test.info("HomePage Logout option Validation");
		test=extent.createTest("HomePage UserDropDown Button Validation");
		test.info("HomePage UserDropDown Button Validation");
		homePage.homePage_UserDropDownListButton_Validation();
		Log.info("HomePage UserDropDown Button Clicked");
		homePage.homePage_UserDropDownLogout_Validation();
		Log.info("HomePage Logout Clicked Successfully");
		
	}
	
	
	
}
