package com.eva.vtiger.testscripts;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.eva.vtiger.genericcode.WebDriverUtil;


public class LeadsTestScripts { /// 750 15 m Maintainance

  
	
	
	
	
	public void verifyCreateLead() {
    
		WebDriverUtil webUtil=new WebDriverUtil("VerifyCreateLead");
	//	webUtil.initializeExtentTest("VerifyCreateLeadScenario");	
		
		webUtil.launchBrowser("chrome");
		webUtil.setImplicitWait(60);
		webUtil.openUrl("http://localhost:8888/");
		webUtil.enterTextboxValue( "user_name", "name", "user name", "admin");
		webUtil.enterTextboxValue( "input[name='user_password']", "css", "Password", "admin");
		webUtil.click( "//input[@name='Login']", "xpath", "Login Button");
		webUtil.click("Marketing", "linkText", "Login Button");
	
		webUtil.validateText("//td[@class='moduleName']",  "xpath", "My Home Page > Home", "My Home Page Header");
		webUtil.validateAttributeValue("searchBtn", "class", "value", "Find", "Find Button");
        
		webUtil.flush();
        

	}
	
}
