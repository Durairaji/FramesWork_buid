package pageObjectModel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel2 {
	public static WebElement ClicK(WebDriver driver) {
		return driver.findElement(By.id("nav-search-submit-button"));
		
		
	}

}
