package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(id="user_email")
	WebElement username;
	
	@FindBy(id="user_password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement clicklogin;
	
	public void navigatelogin(String uname,String pword)
	{
		username.sendKeys(uname);
		password.sendKeys(pword);
		clicklogin.click();
	}
	
	

}
