package com.comcast.crm.generic.Assertutility;

import org.testng.asserts.SoftAssert;

public class AssertUtility {
	public void softAssert(boolean actual,boolean expected,String message) {
		SoftAssert softObj = new SoftAssert();
		softObj.assertEquals(actual, expected,message);
		softObj.assertAll();
	}
	
	public void softAssert(String actual,String expected,String message ) {
		SoftAssert softObj = new SoftAssert();
		softObj.assertEquals(actual, expected, message);
		softObj.assertAll();
	}
	
	public void softAssert(int actual,int expected,String message) {
		SoftAssert softObj = new SoftAssert();
		softObj.assertEquals(actual,expected,message);
		softObj.assertAll();
	}
	public void softAssert(char actual,char expected,String message) {
		SoftAssert softObj = new SoftAssert();
		softObj.assertEquals(actual, expected,message);
		softObj.assertAll();
	}
}
