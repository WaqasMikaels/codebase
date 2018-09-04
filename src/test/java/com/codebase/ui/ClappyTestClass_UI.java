package com.codebase.ui;

import junit.framework.Assert;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.internal.Yaml;

import com.baseClass.BaseUi;
import com.codebase.WebTestClass;

public class ClappyTestClass_UI extends BaseUi {
	WebDriver driver;
	

	public ClappyTestClass_UI(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(css = "[id = 'email']")
	private WebElement txtEmail;
	
	@FindBy(css = "[id = 'password']")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//html/body/div/div/div/div/form/div[4]/button")
	private WebElement btnLogin;
	
	
	
	public void CheckClappyTitle() {
		Assert.assertEquals("Frank.ai", driver.getTitle()); 
		// OR
		// isElementDisplayed(googleTitle);
	}
	
	public void EnterEmailAddress() {
		txtEmail.sendKeys("admin1@clappy.com");
		hardwait(1);
	}
	
	public void EnterPassword() {
		txtPassword.sendKeys("12345678");
		hardwait(1);
	}
	
	public void ClickLogin() {
		btnLogin.click();
		hardwait(5);
	}
	
	public void VerifyLogin() {
		String lnkDashboard = driver.getCurrentUrl();
		assertEquals(lnkDashboard, "http://stage.clappy.live/admin/dashboard");
		hardwait(1);
	}
	

	
	
	
	/*public void CheckFooterCountryName() {
		isElementDisplayed(countryName);
		String footerCountryName = countryName.getText();
		if (footerCountryName.contentEquals("Pakistan")) {
			System.out.println("Country Name found");
		 
		}else {
			System.out.println("Country Name not found");
			
		}
	}*/
	
	
}
