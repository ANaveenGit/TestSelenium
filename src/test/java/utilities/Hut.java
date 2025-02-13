package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Hut {

	public static void ClickOn(WebDriver Driver, String ElementName, String path)
	{
		Driver.findElement(By.xpath(path)).click();		
	}
	
	public static void DropDownSelect(WebDriver Driver, String ElementName, String path, String value)
	{
		Select Element = new Select(Driver.findElement(By.xpath(path)));
		Element.selectByValue(value);	
	}
	
	public static void EnterValue(WebDriver Driver, String ElementName, String path, String value)
	{
		Driver.findElement(By.xpath(path)).sendKeys(value);
	}

}
