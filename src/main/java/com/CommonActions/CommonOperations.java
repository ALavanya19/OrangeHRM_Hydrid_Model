package com.CommonActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.BaseClass.Base;

public class CommonOperations{
	
	public static void screenShotForWebPage(WebDriver driver,String screenShotName) throws IOException {
		
       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
       FileUtils.copyFile(src, new File("./src/resources/java/com/Screenshots/"+screenShotName+".png"));
	}
	
	public static void screenShotForElement(WebDriver driver,String screenShotName) throws IOException {
		
	       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
	       FileUtils.copyFile(src, new File("./src/resources/java/com/Screenshots/"+screenShotName+".png"));
	}
	
	public static void click(WebElement element) {
				element.click();
	}
	
	public static void sendKeys(WebElement element,String keysToPass) {
	
		element.sendKeys(keysToPass);
 
	}
	
	public static void backGroundColor(WebElement element) {
		 		
		element.getCssValue("background-color");
	}
	
	public static void javaScriptExecutorBorder(WebDriver driver,WebElement element) {
	
		JavascriptExecutor js=((JavascriptExecutor)driver);
	    js.executeScript("arguments[0].style.border='3px solid red'",element);
		
	}
	
	public static Robot keyboardOperationsUsingRobotClass() throws AWTException {
		
		return new Robot();

	}
	
	public static Actions keyboardOperationsUsingActionsClass(WebDriver driver) {
		return new Actions(driver);
		
	}
	
}