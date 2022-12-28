package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjectModel.BaseClass;

public class BookingDetails extends BaseClass{
	
	public  void selectLocation(int i) {
		WebElement findElement = driver.findElement(By.id("location"));
		Select select=new Select(findElement);
		select.selectByIndex(i);

	}
	public void selectHotal(int index) {
		WebElement findElement = driver.findElement(By.id("hotels"));
		Select select=new Select(findElement);
		select.selectByIndex(index);
	
	}
	

}
