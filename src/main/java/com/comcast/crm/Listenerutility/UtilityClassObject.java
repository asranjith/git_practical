package com.comcast.crm.Listenerutility;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

/** Utility Class for ThreadLocal to generate multiple copy of static variable for multiple thread
 * [for Parallel Execution]
 * @author RanjithAS
 */
public class UtilityClassObject {
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public static ExtentTest getTest() {
		return test.get();
	}

	public static void setTest(ExtentTest actTest) {
		test.set(actTest);
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(WebDriver actDriver) {
		driver.set(actDriver);
	}
}
