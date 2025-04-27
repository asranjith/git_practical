package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadInformationPage {
	public LeadInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "mouseArea_Last Name")
	private WebElement lastNameinfo;

	@FindBy(id = "mouseArea_Company")
	private WebElement companyinfo;
	
	@FindBy(id = "mouseArea_Lead Source")
	private WebElement leadSourceinfo;
	
	@FindBy(id = "mouseArea_Industry")
	private WebElement industryinfo;

	public WebElement getIndustryinfo() {
		return industryinfo;
	}

	public WebElement getLeadSourceinfo() {
		return leadSourceinfo;
	}

	public WebElement getLastNameinfo() {
		return lastNameinfo;
	}

	public WebElement getCompanyinfo() {
		return companyinfo;
	}

	public void verify(String actual, String expected) {
		if (actual.contains(expected)) {
			System.out.println(expected + " is verified");
		} else {
			System.out.println(expected + " is not verified");
		}
	}
}
