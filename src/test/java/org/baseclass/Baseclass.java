package org.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void btnclick(WebElement element) {
		element.click();
	}

	public void dragAnddrop(WebElement source, WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();
	}

	public void rightclick(WebElement click) {
		Actions a = new Actions(driver);
		a.contextClick(click).perform();
	}

	public void doubleclick(WebElement click) {
		Actions action = new Actions(driver);
		action.doubleClick(click).perform();
	}

	public void Alter(WebElement enter) {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

//	public void Screenshot(WebElement target) throws IOException {
//		TakesScreenshot tc = (TakesScreenshot) driver;
//		File ScreenshotAs = tc.getScreenshotAs(OutputType.FILE);
////		File destFile=new File(System.getProperty("used.dir")+"//target//"+data+".png");
////		FileUtils.copyFile(ScreenshotAs, destFile);
//	}
//
//	public void selectByvisibletext(WebElement element, String text) {
//		Select select = new Select(element);
//		select.deselectByVisibleText(text);
//	}

}
