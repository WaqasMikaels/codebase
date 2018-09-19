package com.frankai;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseClass.BaseUi;
import com.resources.DSLLibDesktop;

public class FrankTestClass {
	DSLLibDesktop dsl;
	  //public String xPath = "D:/Excels/MyExcel.xls";
	  //public String xPath = "D:/Excels/MyFirstExcel.xlsx";
	  //public String xlPath_Res = "D:/Excels/userStatuses.xlsx";
	  //public static String XData[][];
	  //public String xlData[][];
	  

	  @BeforeClass
	  public void beforeClass() throws Exception {
		  	dsl = new DSLLibDesktop();
			//dsl.launchCubixCo();
		  	//dsl.launchGoogle();
		  	//dsl.xlRead(xPath);
		  	dsl.launchFrank();
	  }
	  
	  @Test
	  public void Test01_Verify_Frank_Title() {
		  dsl.franktestclass.CheckFrankTitle();
	  }
	  
	  @Test
	  public void Test02_Perform_Signin() {
		  dsl.franktestclass.EnterEmailAddress();
		  dsl.franktestclass.EnterPassword();
		  dsl.franktestclass.ClickSignin();
	  }
	  
	  @Test
	  public void Test03_Verify_Signin() {
		  dsl.franktestclass.VerifyLogin();
	  }
	  
	  @Test
	  public void Test04_Click_Create_Campaign() {
		  dsl.franktestclass.ClickCreateCampaign();
	  }
	  
	  @Test
	  public void Test05_Campaign_Setup_Step() {
		  dsl.franktestclass.EnterCampaignName();
		  dsl.franktestclass.SelectChannels();
		  dsl.franktestclass.SelectFacebookPage();
	  }
	  
	  @Test
	  public void Test06_Select_Location() {
		  dsl.franktestclass.SelectLocation();
	  }
	  
	  @Test
	  public void Test07_Click_Save_And_Continue() {
		  dsl.franktestclass.ClickSaveAndContinue();
	  }
	  
	  @Test
	  public void Test08_Select_Age_Group() {
		  dsl.franktestclass.ClickAgeGroup();
	  }
	  
	  @Test
	  public void Test09_Select_Target_Language_Speakers() {
		  dsl.franktestclass.ClickLanguage();
	  }
	 
	  @Test
	  public void Test10_Select_Specific_Interest() {
		  dsl.franktestclass.ClickInterest();
	  }
	  
	  @Test
	  public void Test11_Upload_1000_Contacts_txt_or_csv() throws IOException {
		  dsl.franktestclass.SelectEmailList();
	  }
	  
	  @Test
	  public void Test12_Click_Save_And_Continue2() {
		  dsl.franktestclass.ClickSaveAndContinue2();
	  }
	  
	  @Test
	  public void Test13_Click_Create_Fb_Ad() {
		  dsl.franktestclass.ClickUploadFbAd();
	  }
	  
	  @Test
	  public void Test14_Fill_Fb_Ad_Form() {
		  dsl.franktestclass.EnterPostText();
		  dsl.franktestclass.EnterHeadline();
		  dsl.franktestclass.EnterIntroText();
		  dsl.franktestclass.EnterWebsiteLink();
	  }
	  
	  @Test
	  public void Test15_Upload_Banners() throws IOException {
		  dsl.franktestclass.UploadBanners();
	  }
	  
	  @Test
	  public void Test16_Click_Continue_To_Billing() {
		  dsl.franktestclass.ClickContinueToBilling();
	  }
	  
	  @Test
	  public void Test17_Select_End_Date() {
		  dsl.franktestclass.SelectEndDate();
	  }
	  
	  @Test
	  public void Test18_Create_Campaign_And_Verify() {
		  dsl.franktestclass.VerifyCampaignCreatedSuccessMessage();
	  }
	  
	  @AfterClass
	  public void afterClass() throws Exception {
		  dsl.closeBrowser();
		  //xlwrite(xlPath_Res, XData);//Writes the results
		  //BaseUi.xlwrite(xlPath_Res, XData);
		  
	  }
}
