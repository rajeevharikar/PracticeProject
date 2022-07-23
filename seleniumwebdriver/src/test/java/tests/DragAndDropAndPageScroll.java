package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Guru99DragAndDropPage;

public class DragAndDropAndPageScroll {
	
	WebDriver driver;
	Guru99DragAndDropPage gpage= new Guru99DragAndDropPage(driver);
	
	@BeforeClass
	public void browserinitialize() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver= new ChromeDriver(options);
	}
	
//	@Test
//	public void dragAndDrop() {
//		
//		driver.get("http://demo.guru99.com/test/drag_drop.html");
//		
//		gpage.actionClassDragnDrop(driver);
//		
//	}
	
//	@Test
//	public void pageScroll() {
//		driver.manage().window().maximize();
//		driver.get("http://demo.guru99.com/test/guru99home/");
//		gpage.pageScrollTest(driver);
//		
//	}
	
	@Test
	public void ScrollIntoTheView() {
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		gpage.pageScrollTest(driver);
		
		
	}

}
