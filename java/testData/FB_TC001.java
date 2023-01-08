package testData;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Pages;
import seleniumBase.Locators;
import startBase.BeforeStating;

public class FB_TC001 extends BeforeStating 
{
	Pages pg=new Pages();
	
	@BeforeTest
	public void setData() {
		fileName = "TC001";
		url="https://www.facebook.com/";
		
		
	}
	
	@Test(dataProvider="data",priority=0)
	public void loginTest(String data[]) {
		
	
		Assert.assertEquals(pg.loginLable("//button[@type='submit']"), true);
		Assert.assertEquals(pg.forgetLable("Forgotten password?"), true);
		Assert.assertEquals(pg.newAccoundLable("Create New Account"), true);
		
		type(element(Locators.id, "email"),data[0]);
		type(element(Locators.id,"pass"),data[1]);
	
	}
	
	@Test(priority=1,dataProvider="data")
	public void createNewAccount(String data[]) {
		
		click(element(Locators.link, "Create New Account"));
		
		type( element(Locators.name, "firstname"), "DURAI");
		
		type(element(Locators.name, "lastname"), "raj");
		
		type(element(Locators.name,"reg_email__"), "sdurairaj123");
		
		type(element(Locators.name,"reg_passwd__"), "pass123");
		
		selectText(element(Locators.xpath, "//select[@title='Day']"), "16");
		
		selectText(element(Locators.name, "birthday_month"), "Oct");
		
		selectText(element(Locators.name, "birthday_year"), "2000");
		
		click(element(Locators.xpath, "//label[text()='Male']"));
		
		boolean displayed = isDisplayed(element(Locators.name, "websubmit"));
		
		System.out.println(displayed);
		
		
		
		


		
		
		

		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

//WebElement element = element(Locators.xpath, "//select[@title='Day']");

//WebElement element = element(Locators.name, "lastname");

//WebElement element = element(Locators.name, "firstname");

//element(Locators.link, "Create New Account")

//Assert.assertEquals(pg.iyeLable("//div[@class='_9lsb _9ls8']"), true);
//Assert.assertEquals(pg.iyeLable("//div[@class='_9lsb _9ls8']"), true);
//boolean loginLable = pg.loginLable("//button[@type='submit']");

