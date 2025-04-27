package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationInfromationPage {
	public OrganisationInfromationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement organisationInfoHeader;

	@FindBy(id = "mouseArea_Organization Name")
	private WebElement organisationNameinfo;

	@FindBy(id = "mouseArea_Phone")
	private WebElement phoneinfo;
	
	@FindBy(id = "mouseArea_Industry")
	private WebElement industryinfo;
	
	public WebElement getIndustryinfo() {
		return industryinfo;
	}

	public WebElement getTypeinfo() {
		return typeinfo;
	}

	@FindBy(id = "mouseArea_Type")
	private WebElement typeinfo;

	public WebElement getPhoneinfo() {
		return phoneinfo;
	}

	public WebElement getOrganisationInfoHeader() {
		return organisationInfoHeader;
	}

	public WebElement getOrganisationNameinfo() {
		return organisationNameinfo;
	}

	public void verify(String actual, String expected) {
		if (actual.contains(expected)) {
			System.out.println(expected + " is verified");
		} else {
			System.out.println(expected + " is not verified");
		}
	}
}
