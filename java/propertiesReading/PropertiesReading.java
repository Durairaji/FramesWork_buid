package propertiesReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesReading {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("C:\\Users\\DURAIRAJ\\eclipse-workspace\\MavanFrame\\src\\test\\java\\propertiesReading\\Login.properties"));
		//String property = properties.getProperty("password");
		//String property2 = properties.getProperty("username");
//		System.out.println(property);
//		System.out.println(property2);
//	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(properties.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(properties.getProperty("username"));
		
		
		
		
		
		
		
		
		
	}

}
