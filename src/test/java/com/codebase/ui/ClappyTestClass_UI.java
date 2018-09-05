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
	
	@FindBy(xpath = "//*[@id=\"left-col\"]/ul/a[2]/li")
	private WebElement menuAdminManagement;
	
	@FindBy(css = "[id = 'newAdminBtn']")
	private WebElement btnNewAdmin;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[1]")
	private WebElement colId;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[2]")
	private WebElement colFullName;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[3]")
	private WebElement colEmailAddress;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/table/thead/tr/th[4]")
	private WebElement colState;
	
	@FindBy(css = "[class = 'admin_checkbox']")
	private WebElement chkbxState;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[5]/a/button")
	private WebElement btnEditAdmin;
	
	@FindBy(xpath = "//*[@id=\"append-users-here\"]/tr[1]/td[5]/button")
	private WebElement btnDeleteAdmin;
	
	@FindBy(css = "[id = 'fullName']")
	private WebElement txtAdminFullName;
	
	@FindBy(css = "[id = 'email']")
	private WebElement txtAdminEmail;
	
	@FindBy(css = "[id = 'pwd']")
	private WebElement txtAdminPwd;
	
	@FindBy(xpath = "//*[@id=\"right-col\"]/div/div/form/button")
	private WebElement btnCreateAdmin;
	
	@FindBy(css = "[class = 'alert alert-success']")
	private WebElement msgCreateAdminSuccess;
	
	public void CheckClappyTitle() {
		Assert.assertEquals("Frank.ai", driver.getTitle()); 
		// OR
		// isElementDisplayed(googleTitle);
	}
	
	public void EnterEmailAddress() {
		hardwait(5);
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
	
	public void ClickOnAdminManagement() {
		menuAdminManagement.click();
		hardwait(2);
	}
	
	public void VerifyRedirectionToAdminManagement() {
		String lnkAdminManagement = driver.getCurrentUrl();
		assertEquals(lnkAdminManagement, "http://stage.clappy.live/admin/all");
		hardwait(1);
	}
	
	public void VerifyAdminManagementElements() {
		isElementDisplayed(btnNewAdmin);
		isElementDisplayed(colId);
		isElementDisplayed(colFullName);
		isElementDisplayed(colEmailAddress);
		isElementDisplayed(colState);
		isElementDisplayed(chkbxState);
		isElementDisplayed(btnEditAdmin);
		isElementDisplayed(btnDeleteAdmin);
	}
	
	public void ClickNewAdminButton() {
		btnNewAdmin.click();
		hardwait(3);
	}
	
	public void VerifyRedirectionToCreateAdminForm() {
		String lnkCreateAdminForm = driver.getCurrentUrl();
		assertEquals(lnkCreateAdminForm, "http://stage.clappy.live/admin/user/add");
		hardwait(1);
	}
	
	public void FillCreateAdminForm() {
		txtAdminFullName.sendKeys("AutoAdmin");
		txtAdminEmail.sendKeys(currentDate()+"@clappy.com");
		hardwait(1);
		txtAdminPwd.sendKeys("12345678");
	}
	
	public void ClickCreateAdminButton() {
		btnCreateAdmin.click();
		hardwait(5);
	}
	
	public void VerifyCreateAdminSuccessMessage() {
		isElementDisplayed(msgCreateAdminSuccess);
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
