package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInformationPage {
      public ProductInformationPage(WebDriver driver) {
    	  PageFactory.initElements(driver, this);
      }
       
      @FindBy(id = "mouseArea_Product Name")
      private WebElement productinfo;
      
      public WebElement getProductCategortinfo() {
		return productCategortinfo;
	}

	@FindBy(id = "mouseArea_Product Category")
      private WebElement productCategortinfo;

	public WebElement getProductinfo() {
		return productinfo;
	}
	 public void verify(String actual,String expected) {   
	    	if(actual.contains(expected)) {
	    		System.out.println(expected+" is verified");
	    	}else {
	    		System.out.println(expected+" is not verified");
	    	}
	    }
}
