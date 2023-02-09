package com.BaseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

import com.Config.PropertiesClass;
import com.Log.Log;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	              String propFilePath="./src/resources/java/com/PropertiesFile/PropertiesFile.properties";
	public static ExtentReports extent;
	public static ExtentTest test;
	
	

	@BeforeSuite
	public void extentReportsInititation() throws IOException {
		extent=new ExtentReports();
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("./ExtentReports/ohrmreports.html");
		extent.attachReporter(htmlReporter);
		Log.info("Extent Reports Loaded Successfully");
		
		PropertiesClass.loadProperties(propFilePath);
		Log.info("Property File Loaded Successfully");
	}
	
	public void setUp() throws IOException {
		
		String browserName=PropertiesClass.getProperties("browserName");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			Log.info("Chrome Browser Launched Successfully");
		}
		else
			if(browserName.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			Log.info("Edge Browser Luanched Sucessfully");
		}
	    else {
	    	
	    	Log.warn("Please select browser to perform testing");
	    	Log.info("Warn Message sent successfully");
	    }
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(PropertiesClass.getProperties("orangeHRMApplicationUrl"));
		Log.info("Application Launched Successfully");
		
		
	}
	
	public void tearDown() {
		driver.quit();
		Log.info("Applicaton closed successfully");
	}
	
}
