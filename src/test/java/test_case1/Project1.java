package test_case1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Project1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.amazon.in/");
		Driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("ap_email")).sendKeys("9177879108");
		Driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("ap_password")).sendKeys("Navepava@21");
		Driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(4000);
		
		Driver.quit();
		System.out.println("Tested Project 1");

	}

}
