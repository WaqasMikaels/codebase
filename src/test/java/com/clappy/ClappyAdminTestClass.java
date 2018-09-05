package com.clappy;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseClass.BaseUi;
import com.resources.DSLLibDesktop;

public class ClappyAdminTestClass {
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
		  	//dsl.launchFrank();
		  	dsl.launchClappy();
	  }
	  
	 /* @Test
	  public void Test01_Verify_Frank_Title() {
		  dsl.franktestclass.CheckFrankTitle();
	  }*/
	  
	  @Test
	  public void Test01_Fill_Login_Credentials() {
		  dsl.clappytestclass.EnterEmailAddress();
		  dsl.clappytestclass.EnterPassword();
	  }
	  
	  @Test
	  public void Test02_Click_Login_Button() {
		  dsl.clappytestclass.ClickLogin();
	  }
	  
	  @Test
	  public void Test03_Verify_Login() {
		  dsl.clappytestclass.VerifyLogin();		  
	  }
	  
	  @Test
	  public void Test04_Redirect_To_Admin_Management() {
		  dsl.clappytestclass.ClickOnAdminManagement();
	  }
	  
	  @Test
	  public void Test05_Verify_Redirection_To_Admin_Management() {
		  dsl.clappytestclass.VerifyRedirectionToAdminManagement();		  
	  }
	  
	  @Test
	  public void Test06_Verify_8_Admin_Management_Elements() {
		  dsl.clappytestclass.VerifyAdminManagementElements();
	  }
	  
	  @Test
	  public void Test07_Create_New_Admin() {
		  dsl.clappytestclass.ClickNewAdminButton();
	  }
	  
	  @Test
	  public void Test08_Verify_Redirection_To_Create_Admin_Form() {
		  dsl.clappytestclass.VerifyRedirectionToCreateAdminForm();		  
	  }
	  
	  @Test
	  public void Test09_Fill_Create_Admin_Form() {
		  dsl.clappytestclass.FillCreateAdminForm();		  
	  }
	  
	  @Test
	  public void Test10_Click_Create_Admin() {
		  dsl.clappytestclass.ClickCreateAdminButton();
	  }
	  
	  @Test
	  public void Test11_Verify_Create_Admin_Success_Message() {
		  dsl.clappytestclass.VerifyCreateAdminSuccessMessage();
	  }
	  
	  
	  
	  @AfterClass
	  public void afterClass() throws Exception {
		  dsl.closeBrowser();
		  //xlwrite(xlPath_Res, XData);//Writes the results
		  //BaseUi.xlwrite(xlPath_Res, XData);
		  
	  }
}
