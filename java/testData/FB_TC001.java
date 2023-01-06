package testData;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Pages;
import seleniumBase.Locators;
import startBase.StartingBase;

public class FB_TC001 extends StartingBase 
{
	
	@BeforeTest
	public void setData() {
		fileName = "TC001";
		url="https://www.facebook.com/";
		
		
	}
	
	@Test(dataProvider="data")
	public void loginTest(String data[]) {
		
		Pages pg=new Pages();
		Assert.assertEquals(pg.loginLable("//button[@type='submit']"), true);
		Assert.assertEquals(pg.forgetLable("Forgotten password?"), true);
		Assert.assertEquals(pg.newAccoundLable("Create New Account"), true);
		
		type(element(Locators.id, "email"),data[0]);
		type(element(Locators.id,"pass"),data[1]);
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//Assert.assertEquals(pg.iyeLable("//div[@class='_9lsb _9ls8']"), true);
//Assert.assertEquals(pg.iyeLable("//div[@class='_9lsb _9ls8']"), true);
//boolean loginLable = pg.loginLable("//button[@type='submit']");

