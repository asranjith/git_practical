package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationsWindowPage {
    public OrganisationsWindowPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    @FindBy(id = "search_txt")
    private WebElement searchtext;
    
    @FindBy(xpath = "//select[@name='search_field']")
    private WebElement inDropDown;
    
    @FindBy(name = "search")
    private WebElement searchButton;
    
    @FindBy(xpath = "//tr[@class='lvtColDataHover']")
    private WebElement organisationNameselection;

	public WebElement getSearchtext() {
		return searchtext;
	}

	public WebElement getInDropDown() {
		return inDropDown;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getOrganisationNameselection() {
		return organisationNameselection;
	}
    
}
