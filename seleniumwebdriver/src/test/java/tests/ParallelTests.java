package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTests {
	
	public WebDriver driver1;
	public WebDriver driver2;
	
	@BeforeClass
	public void browserinitialize() {
		
		WebDriverManager.chromedriver().setup();
		
	}
	
	@Test
	public void chromeDriverTest()
	{
		driver1= new ChromeDriver();
		driver1.get("http://google.com/");
		System.out.println("browser 1");
		
	}
	
	@Test
	public void chromeDriverTest2()
	{
		driver2= new ChromeDriver();
		driver2.get("https://www.bibain.stagingsites.capillary.in/");
		System.out.println("browser 2");
		
	}

}
