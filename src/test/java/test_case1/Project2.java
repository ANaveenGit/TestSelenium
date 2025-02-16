package test_case1;
import org.testng.annotations.Test;
import local_station.TestBase;


public class Project2 extends TestBase
{
	@Test
	public void Test2(String[] args) throws InterruptedException
	{
		Driver.get("https://www.amazon.in/");
		//Hut.ClickOn(Driver, "Account Name", "//*[@id='nav-link-accountList-nav-line-1']");
		//Driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(2000);
		System.out.println("Passed Test Method");
		//Driver.findElement(By.id("captchacharacters")).sendKeys("Naveen");
		/*Hut.EnterValue(Driver, "Email Address", "//*[@id='ap_email']", "9177879108");
		//Driver.findElement(By.id("ap_email")).sendKeys("9177879108");
		Hut.ClickOn(Driver, "Continue Button", "//*[@id='continue']");
		//Driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		Hut.EnterValue(Driver, "Password", "//*[@id='ap_password']", "Nave");
		Hut.ClickOn(Driver, "Submit Button", "//*[@id='signInSubmit']");
		//Driver.findElement(By.id("ap_password")).sendKeys("Nave");
		//Driver.findElement(By.id("signInSubmit")).click();*/
		Thread.sleep(6000);
		
		
		//<class name="local_station.TestBase"/>
	}
}
