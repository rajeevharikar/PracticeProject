package pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basePage.BaseClass;

public class Guru99DragAndDropPage extends BaseClass {
	
	
public Guru99DragAndDropPage(WebDriver driver) {
	super(driver);
}

public void actionClassDragnDrop(WebDriver driver) {
	
	WebElement source = driver.findElement(By.xpath("(//*[@class=\"block13 ui-draggable\"])[1]"));
	WebElement destination = driver.findElement(By.xpath("(//*[@class=\"field13 ui-droppable ui-sortable\"])[1]"));
	Actions action= new Actions(driver);
	action.dragAndDrop(source, destination).build().perform();	
      }

public void pageScrollTest(WebDriver driver) {
	JavascriptExecutor jse= (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,1000)");
}

public void pageScrollIntoTheView(WebDriver driver) {
	WebElement Element = driver.findElement(By.linkText("Linux"));
	JavascriptExecutor jse= (JavascriptExecutor) driver;
    jse.executeScript("arguments[0].scrollIntoView();", Element);
  //This will scroll the web page till end.		
    jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}


}
