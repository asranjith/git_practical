package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.Webdriverutility.WebDriverUtility;

public class CreatingNewOrganisationPage {
    public CreatingNewOrganisationPage(WebDriver driver){
    	PageFactory.initElements(driver, this);
    }
     
    @FindBy(xpath = "//input[@name='accountname']")
    private WebElement organisationNameTextField;
    
    @FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
    private WebElement saveButton;
    
    @FindBy(id = "phone")
    private WebElement phoneTextField;
    
    @FindBy(xpath = "//select[@name='industry']")
    private WebElement industryDropDown;
    
    public WebElement getTypeDropDown() {
		return typeDropDown;
	}

	@FindBy(xpath = "//select[@name='accounttype']")
    private WebElement typeDropDown;

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	public WebElement getOrganisationNameTextField() {
		return organisationNameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	public void createOrg(String orgName) {
		organisationNameTextField.sendKeys(orgName);
		saveButton.click();
	}
	
	public void createOrg(String orgName,String industry,String type) {
		organisationNameTextField.sendKeys(orgName);
		WebDriverUtility webutils = new WebDriverUtility();
		webutils.selectByVisibleText(industryDropDown, industry);
		webutils.selectByVisibleText(typeDropDown, type);
		saveButton.click();
	}
	
	public void createOrg(String orgName,String phone) {
		organisationNameTextField.sendKeys(orgName);
		phoneTextField.sendKeys(phone);
		saveButton.click();
	}
}
