package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
	public ContactInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "mouseArea_Last Name")
	private WebElement lastNameinfo;

	public WebElement getOrganisationNameinfo() {
		return organisationNameinfo;
	}
	public WebElement getContactinformationHeader() {
		return contactinformationHeader;
	}

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement contactinformationHeader;

	@FindBy(id = "mouseArea_Organization Name")
	private WebElement organisationNameinfo;
	
	@FindBy(id = "mouseArea_Support Start Date")
	private WebElement supportStartdateinfo;
	
	public WebElement getSupportStartdateinfo() {
		return supportStartdateinfo;
	}

	public WebElement getSupportEnddateinfo() {
		return supportEnddateinfo;
	}

	@FindBy(id = "mouseArea_Support End Date")
	private WebElement supportEnddateinfo;

	public WebElement getLastNameinfo() {
		return lastNameinfo;
	}

	public void verify(String actual, String expected) {
		if (actual.contains(expected)) {
			System.out.println(expected + " is verified");
		} else {
			System.out.println(expected + " is not verified");
		}
	}

}
