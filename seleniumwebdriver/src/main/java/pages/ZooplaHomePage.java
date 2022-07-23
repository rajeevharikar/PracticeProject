package pages;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.BaseClass;

public class ZooplaHomePage extends BaseClass {

	
	public ZooplaHomePage(WebDriver driver) {
		
		super(driver);
	}

	static List<Integer> sortList = new ArrayList<Integer>();
	
	Map<String, String> vendorName= new HashMap<String, String>();
	
	public void zoomplaSeleniumChallenge1(WebDriver driver) throws InterruptedException {
		WebElement searchbox = driver.findElement(By.xpath("//*[@id='header-location']"));
		searchbox.sendKeys("London");
		searchbox.click();
		Thread.sleep(1000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		searchbox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@data-testid='search-button']")).click();
		
		List<WebElement> priceList = driver.findElements(By.xpath("//*[@data-testid=\"listing-price\"]//p[2]"));
		sortPrice(priceList);
		for(int i=0;i<priceList.size();i++) {
			if(i==4) {
				priceList.get(i).click();
			}
			
		}
		
		String vendor = driver.findElement(By.xpath("//p[@class=\"css-lnx84k-AgentName e5vsiog3\"]")).getText();
		System.out.println(vendor);
		vendorName.put("venderTitle", vendor);
		driver.findElement(By.xpath("//*[@data-testid=\"agent-properties-link\"]")).click();
		String actualTitle = driver.findElement(By.xpath("//h1/a")).getText();
		System.out.println(actualTitle);
		if(this.verifyElement(driver, actualTitle)){
			System.out.println("Success");
		}
	}

	
	
	public static void sortPrice(List<WebElement> priceList) {
		
		for(int i=0;i<priceList.size();i++)
		{
		String price=priceList.get(i).getText();
		String changedPrice = price.replace("£", "").replace(",", "");
		int finalPrice = Integer.parseInt(changedPrice);
		sortList.add(finalPrice);
	}
		Collections.sort(sortList,Collections.reverseOrder());
		for(int j=0;j<sortList.size();j++) {
			System.out.println(sortList.get(j));
		}
	}
	
	public boolean verifyElement(WebDriver driver,String elementToVerify) {
		 
		Set keys=vendorName.keySet();
		
		Iterator it = keys.iterator();
		
		while(it.hasNext()) {
			String actualValue=vendorName.get(it.next());
			if(elementToVerify.contains(actualValue)) {
				System.out.println(elementToVerify);
				return true;
			}
			
		}
		return false;
		
	}
		
	}
	

