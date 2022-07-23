package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesInSelenium {
	
	@Test
	public void windowHandlesExamples() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"windowButton\"]")).click();
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		System.out.println(driver.getTitle());
		
		Set<String> listOfBrowsers = driver.getWindowHandles();
		
		for(String browser:listOfBrowsers) {
			WebDriver popup = driver.switchTo().window(browser);
			if(popup.getTitle().contains("demoqa")) {
				{
					System.out.println("swichted to new window");
					break;
				}
			}
		}
		
	}
	

}
