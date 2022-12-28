package pagesBase;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import dataproviderr.Older;
import seleniumBase.SeleniumBase;

public class PagesBase extends SeleniumBase{
	public static RemoteWebDriver driver=null;// static pothu use panna once driver object create agidum program mudiravaraium but paralalle excution problem varum
	String url="http://adactinhotelapp.com/";
	
	public String filename="";
	@DataProvider(name="data")
	public String[][] dataProvider()
	{
		String[][] xlData = Older.getXlData(filename);
		return xlData;
	}
	@BeforeMethod
	public void setAp()
	{
		setUp(url);
	}
	@AfterMethod
	public void quitApp()
	{
		quit();
		
	}
}
