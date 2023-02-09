package com.ApplicationWebPages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base;

public class HomePage extends Base {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Object repository
	
	//OrangeHRM Logo in HomePage
	@FindBy(xpath="//*[@alt='client brand banner']")
	WebElement orangeHRMLogoOnTopE;
	
	//Menu button arrow
	@FindBy(xpath="//*[@class='oxd-icon-button oxd-main-menu-button']")
	WebElement rightSideMenuIconButtonE;
	
	//Menu without Names
	@FindBy(xpath="//*[@class='oxd-icon-button oxd-main-menu-button']//i[contains(@class,'right')]")
	WebElement rightSideMenuIconButtonWithOutNamesE;
	
	//Menu with Names display
	@FindBy(xpath="//*[@class='oxd-icon-button oxd-main-menu-button']//i[contains(@class,'left')]")
	WebElement rightSideMenuIconbuttonWithNamesE;
	
	@FindBy(xpath="//*[@class='oxd-topbar-header-breadcrumb']//h6")
	WebElement menuNameE;
	
	//menuDropDown
	@FindBy(xpath="//*[@class='oxd-main-menu-item']//span")
	List<WebElement>menuOptionsListE;
	
	//MenuSearch Engine Display
	@FindBy(xpath="//*[@class='oxd-input oxd-input--active']")
	WebElement menuSearchEngineActiveE;
	
	@FindBy(xpath="//*[@class='oxd-input oxd-input--active toggled']")
	WebElement menuSearchEngineNotActiveE;
	
	//MenuList Items
	@FindBy(xpath="//*[contains(@href,'AdminModule')]")
	WebElement menuAdminE;
	
	@FindBy(xpath="//*[contains(@href,'PimModule')]")
	WebElement menuPIME;
	
	@FindBy(xpath="//*[contains(@href,'LeaveModule')]")
	WebElement menuLeaveE;
	
	@FindBy(xpath="//*[contains(@href,'TimeModule')]")
	WebElement menuTimeE;
	
	@FindBy(xpath="//*[contains(@href,'RecruitmentModule')]")
	WebElement menuRecruitmentE;
	
	@FindBy(xpath="//*[contains(@href,'MyDetails')]")
	WebElement menuMyInfoE;
	
	@FindBy(xpath="//*[contains(@href,'PerformanceModule')]")
	WebElement menuPerformanceE;
	
	@FindBy(xpath="//*[contains(@href,'dashboard')]")
	WebElement menuDashboardE;
	
	@FindBy(xpath="//*[contains(@href,'viewDirectory')]")
	WebElement menuDirectoryE;
	
	@FindBy(xpath="//*[contains(@href,'MaintenanceModule')]")
	WebElement menuMaintenanceE;
	
	@FindBy(xpath="//*[contains(@href,'Buzz')]")
	WebElement menuBuzzE;
	
	//WelcomeAdmin Options
	@FindBy(xpath="//*[@class='oxd-userdropdown-tab']")
	WebElement userDropDownButtonE;
	
	//logged in user Image
	@FindBy(xpath="//*[@class='oxd-userdropdown-img']")
	WebElement userProfilePhotoE;
	
	//logged in user name
	@FindBy(xpath="//*[@class='oxd-userdropdown-name']")
	WebElement userNameE;
	
	@FindBy(xpath="//*[@class='oxd-dropdown-menu']//*[text()='About']")
	WebElement userDropDownAboutE;
	   @FindBy(xpath="//*[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
	   WebElement userDropAboutLabelTextE;
	
	   @FindBy(xpath="//*[@class='oxd-text oxd-text--p orangehrm-about-title']")
	   List<WebElement>userDropDownAboutTitleDetailsE;
	   
	   @FindBy(xpath="//*[@class='oxd-text oxd-text--p orangehrm-about-text']")
	   List<WebElement>userDropDownAboutTitleTextDetailsE;
	   
	   @FindBy(xpath="//*[@class='oxd-dialog-close-button oxd-dialog-close-button-position']")
	   WebElement userDropDownAboutCancelButtonE;
	
	@FindBy(xpath="//*[@class='oxd-dropdown-menu']//*[text()='Support']")
	WebElement userDropDownSupportE;
	
	  @FindBy(xpath="//*[@class='orangehrm-support-link']")
	  WebElement userDropDownSupportLinkE;
	
	@FindBy(xpath="//*[@class='oxd-dropdown-menu']//*[text()='Change Password']")
	WebElement userDropDownChangePasswordE;
	
	@FindBy(xpath="//*[@class='oxd-dropdown-menu']//*[text()='Logout']")
	WebElement userDropDownLogOutE;
	
	//Time at work Menu
	@FindBy(xpath="//*[@class='orangehrm-dashboard-widget-header']")
	WebElement timeAtWorkLabelTextE;
	
	@FindBy(xpath="//*[@class='orangehrm-attendance-card-profile-image']//img")
	WebElement timeAtWorkAttendanceCardProfilePhotoE;
	
	@FindBy(xpath="//*[@class='oxd-text oxd-text--p orangehrm-attendance-card-state']")
	WebElement timeAtWorkAttendanceCardStateE;
	
	@FindBy(xpath="oxd-text oxd-text--p orangehrm-attendance-card-details")
	WebElement timeAtWorkAttendanceCardTimeDetailsE;
	
	@FindBy(xpath="oxd-text oxd-text--span orangehrm-attendance-card-fulltime")
	WebElement timeAtWorkAttendanceCardFullTimeE;
	
	@FindBy(xpath="//*[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']")
	WebElement timeAtWorkAttendanceCardTimeActionButtonE;
	
	@FindBy(xpath="//*[@class='orangehrm-attendance-card-summary-week']//child::p")
	List<WebElement>timeAtWorkAttendanceCardWeekDetailsE;
	
	
	//QuickSearch List
	@FindBy(xpath="//*[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='Assign Leave']")
	WebElement quickSearchAssignLeaveButtonE;
	
	@FindBy(xpath="//*[@class='orangehrm-quick-launch-heading' and @title='Assign Leave']")
	WebElement quickSearchAssignLeaveLabelTextE;
	
	@FindBy(xpath="//*[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='Leave List']")
	WebElement quickSearchLeaveListButtonE;
	
	@FindBy(xpath="//*[@class='orangehrm-quick-launch-heading' and @title='Leave List']")
	WebElement quickSearchLeaveListLabelTextE;
	
	@FindBy(xpath="//*[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='Timesheets']")
	WebElement quickSearchTimeSheetsButtonE;
	
	@FindBy(xpath="//*[@class='orangehrm-quick-launch-heading' and @title='Timesheets']")
	WebElement quickSearchTimeSheetsLabelTextE;
	
	@FindBy(xpath="//*[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='Apply Leave']")
	WebElement quickSearchApplyLeaveButtonE;
	
	@FindBy(xpath="//*[@class='orangehrm-quick-launch-heading' and @title='Apply Leave']")
	WebElement quickSerahcApplyLeaveLabelTextE;
	
	@FindBy(xpath="//*[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='My Leave']")
	WebElement quickSearchMyLeaveButtonE;
	
	@FindBy(xpath="//*[@class='orangehrm-quick-launch-heading' and @title='My Leave']")
	WebElement quickSearchMyLeaveLabelTextE;
	
	@FindBy(xpath="//*[@class='oxd-icon-button orangehrm-quick-launch-icon' and @title='My Timesheet']")
	WebElement quickSearchTimeSheetButtonE;
	
	@FindBy(xpath="//*[@class='orangehrm-quick-launch-heading' and @title='My Timesheet']")
	WebElement quickSearchMyTimesheetLabelTextE;
	
	
	
	//Business Logic
	
	public String homePage_CurrentUrl_Validation() {
		return driver.getCurrentUrl();
	}
		
	
	public boolean homePage_OrangeHRMLogo_Validation() {
		return orangeHRMLogoOnTopE.isDisplayed();
	}
	
	public void homePage_MenuSearchEngineActive_Validation(String menuName) {
		boolean flag=menuSearchEngineActiveE.isDisplayed();
	    
		menuSearchEngineActiveE.sendKeys(menuName);
		if(flag=true) {
			
			for(WebElement e:menuOptionsListE) {
				if(e.getText().equals("Admin")) {
					menuAdminE.click(); 
				}
				else if(e.getText().equals("PIM")) {
					
				}
				else if(e.getText().equals("Leave"))
				{
					
				}else if(e.getText().equals("Time")) {
					
				}
				else if(e.getText().equals("Recruitment")) {
					
				}
				else if(e.getText().equals("My Info")) {
					
				}
				else if(e.getText().equals("Performance"))
				{
					
				}
				else if(e.getText().equals("Dashboard")) {
					
				}
				else if(e.getText().equals("Directory")) {
					
				}
				else if(e.getText().equals("Maintenance")) {
					
				}
				else if(e.getText().equals("Buzz")) {
					
				}
					
			}
			
		}
		else
		{
			
			rightSideMenuIconButtonE.click();
		}
	}

	public HomeAdminPage homePage_Admin_Validation() {
		menuAdminE.click();
		return new HomeAdminPage();
	}
	
	public HomePIMPage homePage_PIM_Validation() {
		menuPIME.click();
		return new HomePIMPage();
	}
	
	public HomeLeavePage homePage_Leave_Validation() {
		menuLeaveE.click();
		return new HomeLeavePage();
	}
	
	public HomeRecruitmentPage homePage_Recruitment_Validation() {
		menuRecruitmentE.click();
		return new HomeRecruitmentPage();
	}
	
	public HomeMyInfoPage homePage_MyInfo_Validation() {
		menuMyInfoE.click();
		return new HomeMyInfoPage();
	}
	
	public HomePage homePage_DashboardValidation() {
		menuDashboardE.click();
		return new HomePage();
	}
	
    public String homePage_CurrentActivePage_Validation() {
    	
    	return menuNameE.getText();
    }
    
    
    public void homePage_UserDropDownListButton_Validation() {
    	
    	userDropDownButtonE.click();
    	 
    }
    
    public boolean homePage_UserProfilePhoto_Validation() {
    	
    	return userProfilePhotoE.isDisplayed();
    }
    
    public String homePage_LoggedInUserName_Validation() {
    	
    	return userNameE.getText();
    }
    
    public String homePage_UserDropDownAbout_Validation() {
    	
    	userDropDownAboutE.click();
    	
    	String data=userDropAboutLabelTextE.getText();
    	userDropDownAboutCancelButtonE.click();
    	
    	return data;
    }
    
    public String homePage_UserDropDownSupport_Validation() {
    	
    	userDropDownSupportE.click();
    	return userDropDownSupportLinkE.getText();
    	
    }
	
    public HomePIMChangePasswordPage homePage_UserDropDownChangePassword_Validation() {
    	
    	userDropDownChangePasswordE.click();
    	return new HomePIMChangePasswordPage();
    }
    
    public LoginPage homePage_UserDropDownLogout_Validation() throws IOException {
    	userDropDownLogOutE.click();
    	return new LoginPage();
    }
    
    public HomeLeavePage homePage_QuickSearchAssignLeaveButton_Validation() {
    	
    	quickSearchAssignLeaveButtonE.click();
    	return new HomeLeavePage();
    }
    
    public String homePage_quickSearchAssignLeaveLabelText_Validation() {
    	return  quickSearchAssignLeaveLabelTextE.getText();
    }
    
    
    
    
}
