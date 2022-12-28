package pageObjectModel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel1 {
public static WebElement searCh(WebDriver driver) {
	return driver.findElement(By.id("twotabsearchtextbox"));
}

}
