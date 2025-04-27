package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
     public CreateNewLeadPage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     @FindBy(name = "lastname")
     private WebElement lastNameText;
     
     @FindBy(name = "company")
     private WebElement companyTextField;
     
     @FindBy(xpath = "//input[@title='Save [Alt+S]']")
     private WebElement saveButton;
     
     public WebElement getLeadSourceDropDown() {
		return leadSourceDropDown;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}
	@FindBy(name = "leadsource")
     private WebElement leadSourceDropDown;
     
     @FindBy(name = "industry")
     private WebElement industryDropDown;

	public WebElement getLastNameText() {
		return lastNameText;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createLead(String lastName,String organisation) {
		lastNameText.sendKeys(lastName);
		companyTextField.sendKeys(organisation);
		saveButton.click();
	}
     
}
