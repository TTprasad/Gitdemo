package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	
	public LandingPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//h2[text()='Featured Courses']")
	WebElement capturetext;
	
	
	public void login()
	{
		login.click();
	}
	
	public void textverify()
	{
		System.out.println(capturetext.getText());
		
		
	}
	
	
	
	
	
	
	

}
