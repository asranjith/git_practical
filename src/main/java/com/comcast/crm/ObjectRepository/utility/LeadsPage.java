package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
      public LeadsPage(WebDriver driver) {
    	  PageFactory.initElements(driver, this);
      }
      
      @FindBy(xpath = "//img[@title='Create Lead...']")
      private WebElement createLead;
      
      @FindBy(name = "search_text")
      private WebElement searchForTextField;
      
      @FindBy(xpath = "//div[@id='basicsearchcolumns_real']/select")
      private WebElement inDropDown;
      
      @FindBy(xpath = "//input[@name='submit']")
      private WebElement searchNowButton;

	public WebElement getCreateLead() {
		return createLead;
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
      
}
