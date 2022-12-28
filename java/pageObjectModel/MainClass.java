package pageObjectModel;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class MainClass {

	@Test
	@Parameters({"going","gone","date"})
	private void testCase(String going,String gone,String date)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAIRAJ\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/bus-tickets");
		
		PageObjectModel.from(driver).sendKeys(going);
		PageObjectModel.to(driver).sendKeys(gone);
		PageObjectModel2.dateSearch(driver).sendKeys(date);
		PageObjectModel2.searchh(driver).click();
		
		driver.quit();
		
	}
}














// PageObjectModel.userName(driver).sendKeys("durairaj");
// PageObjectModel.passWord(driver).sendKeys("56354");
// PageObjectModel.nextpage(driver).click();
// WebElement findElement = driver.findElement(By.id("email"));
// findElement.sendKeys("1234");
//
// WebElement findElement2 = driver.findElement(By.id("pass"));
// findElement2.sendKeys("jflfj");
//
// WebElement findElement3 = driver.findElement(By.id("loginbutton"));
// findElement3.click();
//
//
// }
