package Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Hybridframework.LoginPage;
import Utilities.XLUtilies;

public class TestCase03 extends BaseClass {
	@Test(dataProvider="setdata")
	public void loginTest(String user,String pwd) throws InterruptedException
	{
		driver.get(baseURL);

		LoginPage lp=new LoginPage(driver);
		lp.setusername(user);
		Thread.sleep(3000);
		logger.info("user name provided");
		lp.setPassword(pwd);
		Thread.sleep(3000);
		logger.info("password provided");
		lp.ClickLoginbtn();
		logger.info("clicking activity completed");

		Thread.sleep(3000);
	lp.Clicklogoutbtn();
logger.info("logout activity completed");

		Thread.sleep(3000);

		/*	if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}*/
		/*		else
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
			lp.clickLogoutbtn();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();

		}


	}*/


		/*	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}*/

	}


		@DataProvider(name="setdata")
		String [][] getData() throws IOException
		{
			String path=System.getProperty("user.dir")+"/src/test/java/TestData/setdata.xlsx";

			int rownum=XLUtilies.getRowCount(path, "Sheet1");
			int colcount=XLUtilies.getCellCount(path,"Sheet1",1);

			String setData[][]=new String[rownum][colcount];

			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					setData[i-1][j]=XLUtilies.getCellData(path,"Sheet1", i,j);//1 0
				}

			}
			return setData;
		}
}
