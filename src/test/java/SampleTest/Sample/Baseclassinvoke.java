package SampleTest.Sample;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LandingPage;
import pages.LoginPage;
import resources.BaseClass;

public class Baseclassinvoke extends BaseClass {
	
	@Test
	public void callbrowser() throws IOException
	{
		driver=initializebrowser();
		driver.get("http://qaclickacademy.com");
		driver.manage().window().maximize();
		
		LandingPage l=new LandingPage(driver);
		l.login();
		//driver.switchTo().alert().dismiss();
		LoginPage lo=new LoginPage(driver);
		lo.navigatelogin("abc@qw.com", "123456");
		
		
	}

}
