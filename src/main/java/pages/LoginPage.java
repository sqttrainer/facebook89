package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Page;

public class LoginPage extends Page{
	

	public void doLogin(String username, String password)
	{
		
		driver.findElement(By.xpath("")).sendKeys(username);
		driver.findElement(By.xpath("")).sendKeys(password);
		driver.findElement(By.xpath("")).click();
		
	}
	
	public void navigateToForgetAccount()
	{
		driver.findElement(By.xpath("")).click();
	}
	
	public void doSingnIn()
	{
		
	}
	
	
	public void navigateToCreatePage()
	{
		
	}

}
