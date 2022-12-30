package org.pages;

import org.BasePages.BasePage;
import org.openqa.selenium.By;

public class LoginPages extends BasePage {
	public static boolean getUserLable() {
		return driver.findElement(By.xpath("(//td[@align='right'])[1]")).isEnabled();
	}
	public static boolean getPasswordLable() {
		return driver.findElement(By.xpath("(//td[@align='right'])[2]")).isEnabled();
	}
	public static boolean getLoginLable() {
		return driver.findElement(By.xpath("//input[@type='Submit']")).isEnabled();
	}
	
	
	
//	public static void enterUserName(String name) {
//		driver.findElement(By.id("username")).sendKeys(name);
//	}
	public static void enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	public static void loginClick() {
		driver.findElement(By.id("login")).click();
	}
	public static void enterUserName(String name) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("username")).sendKeys(name);
		
	}
}
