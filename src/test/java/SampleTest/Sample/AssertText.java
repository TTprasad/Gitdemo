package SampleTest.Sample;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.LandingPage;
import resources.BaseClass;

public class AssertText extends BaseClass {
	
	@Test
	
	public void callbrowser() throws IOException
	{
		
		driver=initializebrowser();
		driver.get("http://qaclickacademy.com");
		driver.manage().window().maximize();
		
		LandingPage p1=new LandingPage(driver);
		String actual=p1.textverify();
		
		
		
		
	
	
	}

}
