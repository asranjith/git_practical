package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.Webdriverutility.WebDriverUtility;

public class CreatingNewContactPage {
    public CreatingNewContactPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(name = "lastname")
    private WebElement lastNameTextField;
    
    @FindBy(name = "support_start_date")
    private WebElement supportStartDateCalender;
    
    @FindBy(name = "support_end_date")
    private WebElement supportEndDateCalender;
    
    public WebElement getOrganisationNameSelect() {
		return organisationNameSelect;
	}

	@FindBy(xpath = "(//img[@title='Select'])[1]")
    private WebElement organisationNameSelect;
    
    @FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
    private WebElement saveButton;

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getSupportStartDateCalender() {
		return supportStartDateCalender;
	}

	public WebElement getSupportEndDateCalender() {
		return supportEndDateCalender;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createContact(String lastName) {
		lastNameTextField.sendKeys(lastName);
		saveButton.click();
	}
	public void createContact(WebDriver driver,String lastName,String organisationname) {
		lastNameTextField.sendKeys(lastName);
		organisationNameSelect.click();
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		webDriverUtility.switchToNewTabByURL(driver, "Accounts&action");
		OrganisationsWindowPage organisationsWindowPage = new OrganisationsWindowPage(driver);
		organisationsWindowPage.getSearchtext().sendKeys(organisationname);
		organisationsWindowPage.getSearchButton().click();
		driver.findElement(By.xpath("//a[text()='"+organisationname+"']")).click();
		webDriverUtility.switchToNewTabByURL(driver, "Contacts&action");
		saveButton.click();
	}
	
	public void createContact(String lastName,String supportStartDate,String supportEndDate) {
		lastNameTextField.sendKeys(lastName);
		supportStartDateCalender.sendKeys(supportStartDate);
		supportEndDateCalender.clear();
		supportEndDateCalender.sendKeys(supportEndDate);
		saveButton.click();
	}
    
}
