package report;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportBuid {

	RemoteWebDriver driver;
	ExtentReports extent;
	@BeforeSuite
	public void lunchBrowser() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		ExtentSparkReporter report=new ExtentSparkReporter("./Testreport.html");
		 extent =new ExtentReports();
		 extent.attachReporter(report);


	}
	@Test
	public void loginTest() {
		ExtentTest createTest = extent.createTest("Loginpage");
		createTest.pass("username pass");
		
	//	createTest.log(status, markup)
	//	createTest.pass("username");
		driver.findElement(By.id("email")).sendKeys("hello");
		
	}
	
	@AfterSuite
	public void driverClose() {
		
		driver.quit();
		extent.flush();
		

	}
}
