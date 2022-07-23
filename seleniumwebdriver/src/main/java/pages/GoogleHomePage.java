package pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePage.BaseClass;
import utils.VerifyimageActive;

public class GoogleHomePage extends BaseClass {
	
	
	
	public  GoogleHomePage(WebDriver driver) {
		
		super(driver);
	}
	
	public void findBrokenImages(WebDriver driver) throws IOException {
		
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		for(int i=0;i<images.size();i++) {
			
			String url = images.get(i).getAttribute("src");
			if(!VerifyimageActive.verifyimageActive(url));
			{
				System.out.println(url);
			}
		}		
		
	}
}
