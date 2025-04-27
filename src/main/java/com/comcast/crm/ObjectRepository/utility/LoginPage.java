package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
   
    	PageFactory.initElements(driver, this);
    }
    @FindBy(name="user_name")
    private WebElement userNameTextfield;
    
    @FindBy(name="user_password")
    private WebElement passwordTextField;
    
    @FindBy(id="submitButton")
    private WebElement submitbutton;
    
    
    public WebElement getUserNameTextfield() {
		return userNameTextfield;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public WebElement getSubmitbutton() {
		return submitbutton;
	}


	public void loginPage(String userName,String password) {
    	userNameTextfield.sendKeys(userName);
    	passwordTextField.sendKeys(password);
    	submitbutton.submit();
    }
    
}
