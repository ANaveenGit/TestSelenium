package local_station;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase
{
	public WebDriver Driver;
	public Properties prop = new Properties();
	public FileReader fr;

	@BeforeTest
	public void setUp() throws IOException
	{
		if(Driver == null) 
		{
			FileReader fr = new FileReader("C:\\Users\\Naveen\\eclipse-workspace\\NaveProjectMaven\\TestSelenium\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			Driver = new ChromeDriver();
			Driver.get(prop.getProperty("testurl"));
			Driver.manage().window().maximize();				
		}
	}
	
	@AfterTest 
	public void tearDown()
	{
		Driver.close();
		System.out.println("Driver Closed Successfully");
	}
}
