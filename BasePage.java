package org.BasePages;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	public static RemoteWebDriver driver=null;
	String url="http://adactinhotelapp.com/";
	
	@BeforeMethod
	public void startApp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(url);
	}
	@AfterMethod
	public void driverQuit() {
		driver.quit();
	}

}
