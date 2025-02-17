package test_case1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Project4 {

	//Checking for the GitHub
	public WebDriver Driver;
	
	@BeforeTest
	public void BeforeTest()
	{
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		System.out.println("Opened Chrome Browser");
	}
	
	@Test
	public void GoogleTest()
	{
		Driver.get("https://www.google.com/");
		System.out.println("Entered Google URL");
		//Driver.out;
		//Assert.assertEquals(Get.title(), "google.com");
	}
	
	@AfterTest
	public void AfterTest()
	{
		Driver.close();
		System.out.println("Close Browser");
	}

}
