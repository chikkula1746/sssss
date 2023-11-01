package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;


import Hybridframework.LoginPage;
import junit.framework.Assert;

public class TestCase02 extends BaseClass{
	@Test
	public void logintest() throws InterruptedException, IOException {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		logger.info("Username is entered");
		
		lp.setPassword(password);
		logger.info("password is entered");

		lp.ClickLoginbtn();
		logger.info("loginbutton Clicking activity is completed");
         String actual_res=driver.getTitle();
         
         String exp_res="Adactin.com - Search Hotel";
         System.out.println(actual_res);
         if(actual_res.equals(exp_res)) {
        	 Assert.assertTrue(true);
        	 logger.info("test case is passed");
         }
         else {
        	 captureScreenshot(driver,"logintest()");
        	 Assert.assertFalse(true);
        	 logger.info("test case failed");
         }
	}
}





