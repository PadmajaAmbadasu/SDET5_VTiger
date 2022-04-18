package com.VTigerr.genericLib;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.google.common.io.Files;
import com.objectRepo.BaseClass;

public class MyListeners implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.print("Test Started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}

	public void onTestFailure(ITestResult result) {

		TakesScreenshot ts = (TakesScreenshot) BaseClass.sdriver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(IAutoConstants.screenshot + result.getMethod().getMethodName() + ".png");
		try {
			Files.copy(srcFile, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TestSkipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Testfailed");

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Testfailedwith timeout");

	}
	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}
}
