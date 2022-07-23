package tests;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ZooplaHomePage;

public class SeleniumChallenge1 {
	
public WebDriver driver;
	
	@BeforeClass
	public void browserinitialize() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	@Test
	public void Zoomplatest1() throws ParseException, InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ZooplaHomePage zPage= new ZooplaHomePage(driver);
		zPage.zoomplaSeleniumChallenge1(driver);
		
	}

}
