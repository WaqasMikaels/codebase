package com.codebase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseClass.BaseUi;
import com.resources.DSLLibDesktop;

public class ClappyTestClass {
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
		  
	  }
	  
	  
	  @AfterClass
	  public void afterClass() throws Exception {
		  dsl.closeBrowser();
		  //xlwrite(xlPath_Res, XData);//Writes the results
		  //BaseUi.xlwrite(xlPath_Res, XData);
		  
	  }
}
