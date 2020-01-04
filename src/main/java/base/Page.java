package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
	
	public WebDriver driver;	
	public Page()
	{
		System.setProperty("webdriver.chrome.driver", "E:/SeleniumWeekend8_9/facebook/src/main/resources/executables/chromedriver.exe");
		driver = new ChromeDriver();
		
	}

}
