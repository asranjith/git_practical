package com.comcast.crm.generic.Webdriverutility;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
     public void waitForPageToLoad(WebDriver driver,int seconds) {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds)); 
     }
     
     public void waitUntilElementToBeVisible(WebDriver driver,WebElement element,int seconds) {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    	 wait.until(ExpectedConditions.visibilityOf(element));
     }
     public void waitUntilElementToBeClickable(WebDriver driver,WebElement element,int seconds) {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    	 wait.until(ExpectedConditions.elementToBeClickable(element));
     }
     public void waitUntilTitleContains(WebDriver driver,int sec, String title) {
 		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
 		wait.until(ExpectedConditions.titleContains(title));
     }
     public void waitUntilUrlToBe(WebDriver driver,String url,int seconds) {
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
 		wait.until(ExpectedConditions.urlToBe(url));
 	}
     public void selectByVisibleText(WebElement element,String text) {
 		Select builder = new Select(element);
 		builder.selectByVisibleText(text);
     }
 	public void selectByIndex(WebElement element,int index) {
		Select builder = new Select(element);
		builder.selectByIndex(index);
	}
	public void selectByValue(WebElement element,String value) {
		Select builder = new Select(element);
		builder.selectByValue(value);
	}
 	public void mouseHoverAndClickElement(WebDriver driver,WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).click().perform();
	}
 	public void doubleClick(WebDriver driver,WebElement element) {
 		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
 	}
 	public void rightClick(WebDriver driver,WebElement element) {
 		Actions act = new Actions(driver);
		act.contextClick(element).perform();
 	}
 	public void dragAndDop(WebDriver driver,WebElement sourceElement,WebElement targetElement) {
 		Actions act = new Actions(driver);
		act.dragAndDrop(sourceElement, targetElement).perform();
 	}
 	public void scrollToElement(WebDriver driver,WebElement element) {
 		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
 	}
 	
 	public void clickOnElementUsingJavaScript(WebDriver driver,WebElement element) {
     JavascriptExecutor js = (JavascriptExecutor)driver;
     js.executeScript("argument[0].click()", element);
 	}
	public void sendValuesUsingJavaScript(WebDriver driver,String value,WebElement element) {
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     js.executeScript("arguments[0].value='"+value+"'", element);
	 	}
 	
 	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void switchToActiveElement(WebDriver driver,String keys) {
		driver.switchTo().activeElement().sendKeys(keys);
	}
	
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchToframe(WebDriver driver,String id_name) {
		driver.switchTo().frame(id_name);
	}
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void switchToNewTabByURL(WebDriver driver,String partialURL) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String windowid = it.next();
			driver.switchTo().window(windowid);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains(partialURL)) {
				break;
			}
			
		}
	}
		public void switchToNewTabByTitle(WebDriver driver,String partialTitle) {
			Set<String> set = driver.getWindowHandles();
			Iterator<String> it = set.iterator();
			while(it.hasNext()) {
				String windowid = it.next();
				driver.switchTo().window(windowid);
				String acttitle = driver.getTitle();
				if(acttitle.contains(partialTitle)) {
					break;
				}
				
			}	
		
		
	}
		public String getRequiredDate(String day_mon_year,int day) {
			Date date = new Date();
			SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
			sim.format(date);
			String val="";
			Calendar cal = sim.getCalendar();
			if(day_mon_year.equalsIgnoreCase("week")) {
				cal.add(Calendar.DAY_OF_WEEK_IN_MONTH, day);
				val= sim.format(cal.getTime());
			}
			else if(day_mon_year.equalsIgnoreCase("month")) {
				cal.add(Calendar.DAY_OF_MONTH, day);
				val= sim.format(cal.getTime());
			}
			else if(day_mon_year.equalsIgnoreCase("year")){
				cal.add(Calendar.DAY_OF_YEAR, day);
				val= sim.format(cal.getTime());
			}
			return val;
		}
		
}
