package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.Webdriverutility.WebDriverUtility;

public class OrganizationsPage {

    public OrganizationsPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//img[@title='Create Organization...']")
    private WebElement createOrganization;
    
    @FindBy(name = "search_text")
    private WebElement searchForTextField;
    
    @FindBy(xpath = "//div[@id='basicsearchcolumns_real']/select")
    private WebElement inDropDown;
    
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement searchNowButton;
    
    @FindBy(name = "selected_id")
    private WebElement deleteCheckBox;
    
    @FindBy(linkText = "del")
    private WebElement deleteLink;

	public WebElement getDeleteLink() {
		return deleteLink;
	}

	public WebElement getDeleteCheckBox() {
		return deleteCheckBox;
	}

	public WebElement getCreateOrganization() {
		return createOrganization;
	}

	public WebElement getSearchForTextField() {
		return searchForTextField;
	}

	public WebElement getInDropDown() {
		return inDropDown;
	}

	public WebElement getSearchNowButton() {
		return searchNowButton;
	}
	
	public void searchOrg(String organisationname,int num) {
	    searchForTextField.sendKeys(organisationname);
		WebDriverUtility webutils = new WebDriverUtility();
		webutils.selectByIndex(inDropDown, num);
		searchNowButton.click();
	}
	
	public void deleteOrg(WebDriver driver,String orgName) {
		driver.findElement(By.xpath("//a[text()='"+orgName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//a[text()='"+orgName+"']/parent::td/parent::tr/descendant::a[text()='del']")).click();
		WebDriverUtility webutils = new WebDriverUtility();
		webutils.acceptAlert(driver);
	}
	
	
    
}
