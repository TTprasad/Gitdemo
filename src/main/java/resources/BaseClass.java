package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass 

{
	
	public WebDriver driver;

public WebDriver initializebrowser() throws IOException
{
	
	
	Properties pr=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Prasad\\practice\\Sample\\src\\main\\java\\resources\\data.properties");
	pr.load(fis);
	String browsername=pr.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("IE"))
	{
		driver=new InternetExplorerDriver();
	}
	else if(browsername.equalsIgnoreCase("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	
}
}
