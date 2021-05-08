package com.test.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	public void getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void enterKeys(WebElement element, String senKeys) {
		element.sendKeys(senKeys);
	}

	public void enterKeys(WebElement element) {
		element.sendKeys();
	}

	public void click(WebElement element) {
		element.click();
	}

	public void dropAndDown(WebElement element,String text) {
		Select se = new Select(element);
		se.selectByVisibleText(text);
	}

	public void mouseAction() {
		Actions ac = new Actions(driver);
	}

	public void mouseOverAction(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	public void ContextClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();
	}

	public void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}

	public void actionClick() {
		Actions ac = new Actions(driver);
		ac.click();
	}

	public void dragAndDrop(WebElement source, WebElement destination) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, destination).perform();
	}
	public void getScreenShot(String string) throws IOException {
TakesScreenshot ts=(TakesScreenshot)driver;
File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
File file=new File("C:\\Eclipse-New\\BlazeDemo\\target\\screenshot\\"+string+".png");
FileUtils.copyFile(screenshotAs, file);
	}
	



}
