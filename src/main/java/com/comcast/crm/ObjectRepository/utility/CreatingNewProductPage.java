package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.Webdriverutility.WebDriverUtility;

public class CreatingNewProductPage {
    public CreatingNewProductPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(name = "productname")
    private WebElement productNameTextField;
    
    public WebElement getProductcategoryDropDown() {
		return productcategoryDropDown;
	}

	@FindBy(name = "productcategory")
    private WebElement productcategoryDropDown;
    
    @FindBy(xpath = "//input[@title='Save [Alt+S]']")
    private WebElement saveButton;
    

	public WebElement getSaveButton() {
		return saveButton;
	}


	public WebElement getProductNameTextField() {
		return productNameTextField;
	}
	
	public void createProduct(String productname) {
		productNameTextField.sendKeys(productname);
		saveButton.click();
	}
	
	public void createProduct(String productname,String productType) {
		productNameTextField.sendKeys(productname);
	    WebDriverUtility wutils = new WebDriverUtility(); 
		wutils.selectByVisibleText(productcategoryDropDown, productType);
		saveButton.click();
	}
    
    
}
