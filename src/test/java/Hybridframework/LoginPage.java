package Hybridframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;

	//Parameterized constructor
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		//pageobject model
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
WebElement txtusername;
	
@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement btnlogin;
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement btnlogout;

	
	
	public void setusername(String user) {
		
	txtusername.sendKeys(user);
		
	}
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	
	public void ClickLoginbtn() {
		btnlogin.click();
	}
		
		public void Clicklogoutbtn() {
			// TODO Auto-generated method stub
			btnlogout.click();

		}
		
			
		}
	






