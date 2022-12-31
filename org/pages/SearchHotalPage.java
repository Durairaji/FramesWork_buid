package org.pages;

import org.BasePages.BasePage;
import org.openqa.selenium.By;


public class SearchHotalPage extends BasePage {
	
public static boolean getLocationLabel() {
	return driver.findElement(By.xpath("//table[@class='login']/tbody[1]/tr[2]/td[1]")).isEnabled();
	
}
public static boolean getHotalLable() {
	return driver.findElement(By.xpath("//table[@class='login']/tbody[1]/tr[3]/td[1]")).isEnabled();
	
}
public static boolean getRoomTypeLable() {
	return driver.findElement(By.xpath("//table[@class='login']/tbody[1]/tr[4]/td[1]")).isEnabled();
	
}
public static boolean getNumberOfRoomLable() {
	return driver.findElement(By.xpath("//td[text()='Number of Rooms']")).isEnabled();
	
}
public static boolean getCheckInDateDateLable() {
	return driver.findElement(By.xpath("//table[@class='login']/tbody[1]/tr[6]/td[1]")).isEnabled();
	
}
public static boolean getCheckOutDateLable() {
	return driver.findElement(By.xpath("//table[@class='login']/tbody[1]/tr[7]/td[1]")).isEnabled();
}
public static boolean getAdultsPerRoomLable() {
	return driver.findElement(By.xpath("//table[@class='login']/tbody[1]/tr[9]/td[1]")).isDisplayed();
}
public static boolean getChildrunPerRoomLable() {
	return driver.findElement(By.xpath("//table[@class='login']/tbody[1]/tr[9]/td[1]")).isEnabled();
	
}
public static boolean getSearchLable() {
	return driver.findElement(By.id("Submit")).isEnabled();
	
}
public static boolean getResetLable() {
	return driver.findElement(By.id("Reset")).isEnabled();
	
}
}
