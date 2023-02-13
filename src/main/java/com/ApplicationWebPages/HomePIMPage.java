package com.ApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base;

public class HomePIMPage extends Base {

	public HomePIMPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Object repository
	
	//Current Page Label Title Validation Element
	@FindBy(xpath="//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement pimPageLabelE;
	
	//Congiguration Element
	@FindBy(xpath="//*[@class='oxd-topbar-body-nav-tab --parent']")
	WebElement pimConfigurationE;
	
	   //Optional Fields
	   @FindBy(xpath="//*[@class='--active oxd-topbar-body-nav-tab --parent']//a[text()='Optional Fields']")
	   WebElement pimConfigurationOptionalFieldsE;
	   
	   //Customer Fields
	   @FindBy(xpath="//*[@class='--active oxd-topbar-body-nav-tab --parent']//a[text()='Custom Fields']")
	   WebElement pimCongigurationCustomFieldsE;
	   
	   //Reporting Methods 
	   @FindBy(xpath="//*[@class='--active oxd-topbar-body-nav-tab --parent']//a[text()='Reporting Methods']")
	   WebElement pimConfigurationReportingMethodsE;
	   //Data Import
	   @FindBy(xpath="//*[@class='--active oxd-topbar-body-nav-tab --parent']//a[text()='Data Import']")
	   WebElement pimConfigurationDataImportE;
	   
	   //Reporting Methods Element
	   @FindBy(xpath="//*[@class='--active oxd-topbar-body-nav-tab --parent']//a[text()='Termination Reasons']")
	   WebElement pimConfigurationTerminationReasonsE;
	   
	   
	
	//EmployeeList Element
	@FindBy(xpath="//*[@class='oxd-topbar-body-nav-tab --visited']//a")
	WebElement pimEmployeeListE;
	
	//Add Employee Element
	@FindBy(xpath="//*[@class='oxd-topbar-body-nav-tab']//a[text()='Add Employee']")
	WebElement pimAddEmployeeListE;
	
	//Reports Element
	@FindBy(xpath="//*[@class='oxd-topbar-body-nav-tab']//a[text()='Reports']")
	WebElement pimReportsE;
	
	
	//Business Logic
	
    //Validating Current Url
	public String pimPage_CurrentURL() {
		return driver.getCurrentUrl();
	}
	
	//Validating Current Landed Page Confimation Label Text
	public String pimPage_Label() {
		return pimPageLabelE.getText();
	}
	
	
	//EmployeeList Page
	public PIMEmployeeListPage pimEmployeeList() {
		pimEmployeeListE.click();
		return new PIMEmployeeListPage();
	}
	
	//Add Employee Page
	public PIMAddEmployeePage pimAddEmployeeList() {
		pimAddEmployeeListE.click();
		return new PIMAddEmployeePage();
	}
	
	//Reports Page 
	public PIMReportsPage pimReports() {
		//pimReportsE.click();
		return new PIMReportsPage();
	}
	
	//Configuration Drop down
	private void pimConfiguration_DropDownButton() {
		
		pimConfigurationE.click();
	}
	
	public PIMConfigurationOptionalFieldsPage pimConfigurationOptionalFields() {
		pimConfiguration_DropDownButton();
		pimConfigurationOptionalFieldsE.click();
		return new PIMConfigurationOptionalFieldsPage();
	}
	
	public PIMConfigurationCustomerFieldsPage pimCongigurationCustomFields() {
		pimConfiguration_DropDownButton();
		pimCongigurationCustomFieldsE.click();
		return new PIMConfigurationCustomerFieldsPage();
	}
	
	public PIMConfigurationReportingMethodsPage PIMConfigurationReportingMethodsPage() {
		pimConfiguration_DropDownButton();
		pimConfigurationReportingMethodsE.click();
		return new PIMConfigurationReportingMethodsPage();
	}
	
	public PIMConfigurationDataImportPage pimConfigurationDataImport() {
		pimConfiguration_DropDownButton();
		pimConfigurationDataImportE.click();
		return new PIMConfigurationDataImportPage();
	}
	
	public PIMConfigurationTerminationReasonsPage pimConfigurationTerminationReasons() {
		pimConfiguration_DropDownButton();
		pimConfigurationTerminationReasonsE.click();
		return new PIMConfigurationTerminationReasonsPage();
	}
	
	
}
