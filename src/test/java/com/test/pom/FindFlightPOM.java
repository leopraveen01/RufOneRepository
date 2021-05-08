package com.test.pom;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.baseclass.LibGlobal;


public class FindFlightPOM extends LibGlobal {

	public FindFlightPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="fromPort")
	WebElement DropDepar;
	@FindBy(name="toPort")
	WebElement DropDest;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnFind;

	public WebElement getDropDepar() {
		return DropDepar;
	}

	public WebElement getDropDest() {
		return DropDest;
	}

	public WebElement getBtnFind() {
		return btnFind;
	}

	public void selectSourceAndDest(String Departure, String Destination) {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		dropAndDown(getDropDepar(), Departure);
		dropAndDown(getDropDest(), Destination);
	}

	public void findFlightButtonClickWithValidation() {
		boolean enabled = getBtnFind().isEnabled();
		Assert.assertTrue(enabled);
		getBtnFind().click();
	}
}
