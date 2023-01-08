package pages;

import org.hamcrest.Description;
import org.openqa.selenium.WebElement;

import seleniumBase.Locators;
import seleniumBase.SeleniumBase;

public class Pages extends SeleniumBase {

	/**
	 * this methods store the locator value and check the the button visible or not
	 * and that is return value boolean
	 * 
	 * @author DURAIRAJ
	 * @param Received
	 *            String Locator Value.
	 * @return boolean
	 */
	public boolean loginLable(String value) {

		WebElement element = element(Locators.xpath, value);
		return element.isEnabled();

	}

	/**
	 * this methods store the locator value and check the the button visible or not
	 * and that is return value boolean
	 * 
	 * @author DURAIRAJ
	 * @param Received
	 *            String Locator Value.
	 * @return boolean
	 */
	public boolean forgetLable(String value) {
		return element(Locators.link, value).isEnabled();
	}

	/**
	 * this methods store the locator value and check the the button visible or not
	 * and that is return value boolean
	 * 
	 * @author DURAIRAJ
	 * @param Received
	 *            String Locator Value.
	 * @return boolean
	 */
	public boolean newAccoundLable(String value) {
		return element(Locators.link, value).isEnabled();
	}
	
	/**
	 * this methods get the tittle of the page
	 * @author DURAIRAJ
	 */
	public void getCuurentTile() {
	
		driver.getTitle();
	}
}












// public boolean iyeLable(String value) {
// return element(Locators.xpath, value).isDisplayed();
// }
//
//
// }

// public boolean iyeLable(String value) {
// return element(Locators.xpath, value).isDisplayed();
// }

// public boolean usernameLable()
// {
// WebElement element = element(Locators.xpath, "(//td[@align='right'])[1]");
// return element.isEnabled();
// }
