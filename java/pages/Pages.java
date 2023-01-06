package pages;

import org.openqa.selenium.WebElement;

import seleniumBase.Locators;
import seleniumBase.SeleniumBase;

public class Pages extends SeleniumBase {
	
	public boolean loginLable(String value) {
		
		WebElement element = element(Locators.xpath, value);
		return element.isEnabled();
		
	
	}
	public boolean forgetLable(String value)
	{
		return element(Locators.link,value).isEnabled();
	}
	
	public boolean newAccoundLable(String value) {
		return element(Locators.link, value).isEnabled();
	}
	
	public boolean iyeLable(String value) {
		return element(Locators.xpath, value).isDisplayed();
	}
	
	

	
	
	
	
	
	
	
	
}




//
//public  boolean usernameLable()
//{
//	WebElement element = element(Locators.xpath, "(//td[@align='right'])[1]");
//return	element.isEnabled();
//}
