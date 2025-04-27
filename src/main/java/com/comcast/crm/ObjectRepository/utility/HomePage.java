package com.comcast.crm.ObjectRepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='More']")
	private WebElement moreHeader;

	public WebElement getMoreHeader() {
		return moreHeader;
	}

	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calendarHeader;

	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leadsHeader;

	@FindBy(xpath = "//a[text()='Organizations']")
	private WebElement organizationsHeader;

	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsHeader;

	@FindBy(xpath = "//a[text()='Opportunities']")
	private WebElement opportunitiesHeader;

	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productsHeader;

	@FindBy(xpath = "//a[text()='Documents']")
	private WebElement documentsHeader;

	@FindBy(xpath = "//a[text()='Email']")
	private WebElement emailHeader;

	@FindBy(xpath = "//a[text()='Trouble Tickets']")
	private WebElement troubleticketsHeader;

	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement dashboardHeader;

	public WebElement getCalendarHeader() {
		return calendarHeader;
	}

	public WebElement getLeadsHeader() {
		return leadsHeader;
	}

	public WebElement getOrganizationsHeader() {
		return organizationsHeader;
	}

	public WebElement getContactsHeader() {
		return contactsHeader;
	}

	public WebElement getOpportunitiesHeader() {
		return opportunitiesHeader;
	}

	public WebElement getProductsHeader() {
		return productsHeader;
	}

	public WebElement getDocumentsHeader() {
		return documentsHeader;
	}

	public WebElement getEmailHeader() {
		return emailHeader;
	}

	public WebElement getTroubleticketsHeader() {
		return troubleticketsHeader;
	}

	public WebElement getDashboardHeader() {
		return dashboardHeader;
	}

	@FindBy(xpath = "//span[text()=' Administrator']/parent::td/following-sibling::td/img[contains(@src,'user')]")
	private WebElement usericon;

	public WebElement getUsericon() {
		return usericon;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutLink;

	public void signOut() {
		usericon.click();
		signOutLink.click();
	}

}
