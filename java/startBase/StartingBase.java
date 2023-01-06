package startBase;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import dataProvider.Dataprovider;
import seleniumBase.SeleniumBase;

public class StartingBase extends SeleniumBase {
	public RemoteWebDriver driver = null;

	public String fileName = "";
	public String url = "";

	@DataProvider(name = "data")
	public String[][] dataRead() {
		String[][] xlData = Dataprovider.getXlData(fileName);
		return xlData;

	}

	@BeforeClass
	public void startApp() {
		setUp(url);

	}

	@AfterClass
	public void driverQuit() {
		quit();
	}

}
