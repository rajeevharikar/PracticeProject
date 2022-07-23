package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleHomePage;

public class FindBrokenImages {
	
	public WebDriver driver;
	
	@BeforeClass
	public void browserinitialize() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	@Test
	public void findBrokenImagesFromPage() throws IOException {
		
		driver.get("https://www.google.com/");
		GoogleHomePage gpage= new GoogleHomePage(driver);
		gpage.findBrokenImages(driver);	
		
	}

}
