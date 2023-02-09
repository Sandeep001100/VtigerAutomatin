package com.eva.vtiger.testscripts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.eva.vtiger.genericcode.WebDriverUtil;

public class RegistrationTestScripts {

	public void validRegistration() {
		DateFormat df = new SimpleDateFormat("MM_dd_yyyy___HH_mm_ss");
		String timeStamp = df.format(new Date());

		ExtentSparkReporter esr = new ExtentSparkReporter("Automationreport" + timeStamp + ".html");
		ExtentReports ext = new ExtentReports();
		ext.attachReporter(esr);
		ExtentTest extTest = ext.createTest("verify create lead");
		
		extTest.log(Status.INFO, "Chrome Browser Has been launched successfully");
       /// 1st browser - vtiger registration
		WebDriverUtil webUtil1=new WebDriverUtil("");
		//webUtil1.driver.getTitle();
		
		
		webUtil1.getDriver().getTitle();
		
		
		webUtil1.launchBrowser("chrome");
		webUtil1.setImplicitWait(60);
		webUtil1.openUrl("http://localhost:8888/");
        //  10 steps on vtiger
		
		
		
		
		//// 2nd browser - gmail
		WebDriverUtil webUtil2=new WebDriverUtil("");
		webUtil2.launchBrowser("chrome");
		webUtil2.setImplicitWait(60);
		webUtil2.openUrl("http://gmail.com/");
		///  10-12 steps login - mail search mail open otp getText
		
		////  goto 1st browser - 
		//WebDriverUtil.enterTextboxValue("", "xpath", "", "otp  textbox");
		
		
		
		
		
		
	}

}
