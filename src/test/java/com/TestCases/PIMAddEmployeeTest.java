package com.TestCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ApplicationWebPages.AddEmpPersonalDetailsPage;
import com.ApplicationWebPages.HomePIMPage;
import com.ApplicationWebPages.HomePage;
import com.ApplicationWebPages.LoginPage;
import com.ApplicationWebPages.PIMAddEmployeePage;
import com.ApplicationWebPages.PIMEmployeeListPage;
import com.BaseClass.Base;
import com.Config.PropertiesClass;
import com.ExcelCommonOperations.ExcelCommands;
import com.Log.Log;
import com.aventstack.extentreports.ExtentTest;

public class PIMAddEmployeeTest extends Base {

	String inputExcelFilePath="F:\\backupdesktop\\AutomationPractice\\OrangeHRM_Hydrid_Model\\src\\resources\\java\\com\\TestDataInputFiles\\OrangeHRMTestData.xlsx";
	String outputExcelFilePath="F:\\backupdesktop\\AutomationPractice\\OrangeHRM_Hydrid_Model\\src\\resources\\java\\com\\TestDataInputFiles\\OrangeHRMTestData.xlsx";
    
	LoginPage loginPage;
	HomePage homePage;
	HomePIMPage homePimPage;
	PIMAddEmployeePage pimAddEmployeePage;
	AddEmpPersonalDetailsPage addEmpPersonalDetailsPage;
	
	@BeforeMethod
	public void homePimPage_SetUp() throws IOException {
		setUp();
		ExcelCommands.loadExcelFile(inputExcelFilePath, "PIMAddEmployeePage");
		loginPage=new LoginPage();
		homePage=loginPage.loginPage_Login(PropertiesClass.getProperties("userName"), PropertiesClass.getProperties("Password"));
		homePimPage=homePage.homePIMPage();
		pimAddEmployeePage=homePimPage.pimAddEmployeeList();
		Log.info("OrangeHRM Login Successfull and Navigated to PIM Page ADD employee Test Validation");
	}
	
	@AfterMethod
	public void homePimPage_TearDown() throws IOException {
		//loginPage=homePage.homePage_UserDropDownLogout_Validation();
		//ExcelCommands.excelSave(outputExcelFilePath);
		extent.flush();
		//tearDown();
	}
	
	@Test
    public void addEmployee_CreateEmployee_Test() throws AWTException, InterruptedException, IOException {
		
		test=extent.createTest("PIM Page Add Employee Validation Test");
		test.info("PIM Page Add Employee Validation Test");
        int rowindex=1;
           while(true) {

        	   try {
        	   
        	      String firstName=ExcelCommands.getStringCellValue(rowindex,0);
        	      String middleName=ExcelCommands.getStringCellValue(rowindex,1);
        	      String lastName=ExcelCommands.getStringCellValue(rowindex,2);
        	      String userName=ExcelCommands.getStringCellValue(rowindex,5);
        	      String password=ExcelCommands.getStringCellValue(rowindex,6);

        	      addEmpPersonalDetailsPage=pimAddEmployeePage.addEmployee_CreateEmployee(firstName,middleName,lastName,userName,password);
        	      String actual_AddEmpPersonalDetailsCurrentUrl=addEmpPersonalDetailsPage.addEmpPersonalDetails();
        		  String expected_AddEmpPersonalDetailsCurrentUrl="pim/viewPersonalDetails";
        			if(actual_AddEmpPersonalDetailsCurrentUrl.contains(expected_AddEmpPersonalDetailsCurrentUrl)) {
        				test.pass("Add Employee Page Personal Details Page Test Validation Successfull");
        				Log.info("Add Employee Page Personal Details Page Test Validation Successfull - PASS");
        			}
        			else
        			{
        				test.fail("Add Employee Page Personal Details Page Test Validation Unsuccessfull");
        				Log.info("Add Employee Page Personal Details Page Test Validation Unsuccessfull - FAIL");
        		    }
        			
        		  Log.info(firstName+lastName+" Add Successfully");
        		rowindex++;
        		pimAddEmployeePage=homePimPage.pimAddEmployeeList();
        	   }
        	   catch(Exception e) {
        	      break;
        	   }
        	   
           }
		
		
	}
}
