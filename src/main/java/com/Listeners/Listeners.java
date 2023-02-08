package com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Log.Log;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	
		Log.info("Test Started Successfull");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		Log.info("Test Successfull");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		Log.warn("Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		Log.info("Test Skipped");
	}


	@Override
	public void onStart(ITestContext context) {
        Log.info("Suite Started successfull");
	}

	@Override
	public void onFinish(ITestContext context) {
	 
	    Log.info("Suite finished successfull");	
	}


}
