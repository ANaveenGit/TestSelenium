package test_case1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import local_station.TestBase;


public class Project3 extends TestBase
{
	@Test
	public static void Test2() throws InterruptedException
	{
		Driver.get("https://www.amazon.in/");
		Driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(2000);
		/*Driver.findElement(By.id("ap_email")).sendKeys("9177879108");
		Driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("ap_password")).sendKeys("Navepava@21");
		Driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(4000);*/
	}
}
