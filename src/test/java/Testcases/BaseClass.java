package Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Utilities.Readingdata;

public class BaseClass {
	

		Readingdata rd=new Readingdata();
		String baseURL=rd.getapplicationURL();
		String username=rd.getUsername();
		String password=rd.getpassword();
	
		
		public static Logger logger;
		
		//launch browser
		public static WebDriver driver;
    @BeforeClass
		public void openApplication() {
    	logger = Logger.getLogger("SeleniumMave");
		PropertyConfigurator.configure("log4j.properties");

		
	driver=new ChromeDriver();

	}
	
	@AfterClass
	public void closeApplication() {
	//driver.quit();
	}
  public void captureScreenshot(WebDriver driver,String tname) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots02/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screensht is taken");
	}

}