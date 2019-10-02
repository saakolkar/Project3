package com.qa.test1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MySeleniumTestCases {

	WebDriver driver;



	@Test
	public void OpenAutomationRegistrationPage() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");

		driver.close();

	}

	public void takeScreenshot(String MethodName) throws Exception {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(scrFile, new File("C:\\Users\\Admin\\Desktop\\Screenshot\\" + MethodName + ".png"));
	}

}
