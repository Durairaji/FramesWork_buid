package org.testdata;

import org.BasePages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pages.LoginPages;
import org.pages.SearchHotalPage;
import org.seleniumBase.Locators;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001 extends BasePage {
	@BeforeTest
	public void setData() {
		fileName = "TC001";
	}


	public void hotalSearchPageAssert() {

		System.out.println(SearchHotalPage.getLocationLabel());
		System.out.println(SearchHotalPage.getHotalLable());
		System.out.println(SearchHotalPage.getRoomTypeLable());
		System.out.println(SearchHotalPage.getNumberOfRoomLable());
		System.out.println(SearchHotalPage.getCheckInDateDateLable());
		System.out.println(SearchHotalPage.getCheckOutDateLable());
		System.out.println(SearchHotalPage.getAdultsPerRoomLable());
		System.out.println(SearchHotalPage.getChildrunPerRoomLable());
		System.out.println(SearchHotalPage.getSearchLable());
		System.out.println(SearchHotalPage.getResetLable());
	}
	
	@Test(dataProvider="data")
	public void testCases(String[] data) {

		//WebElement element = element(Locators.id, "username");
		type(element(Locators.id, "username"), data[0]);
		
		type(element(Locators.id,"password"),data[1]);
		
		WebElement element2 = element(Locators.id,"login");
		click(element2);
		
		
		
		
		
		
		
		
		
		
	}
}


//
//String title = getTitle();
//System.out.println(title);

//LoginPages.LoginTestCase(data[0],data[1]);
//
//hotalSearchPageAssert();
//
//SearchHotalPage.Details();
//












































//SearchHotalPage.getLocationDropDown();
//SearchHotalPage.getLocationDropDown();
//SearchHotalPage.getHotalLocationDropDown();
//SearchHotalPage.getRoomTypeDropDown();
//SearchHotalPage.getNumberOfRoomDropDown();
//SearchHotalPage.getCheckInDropDown();
//SearchHotalPage.getcheckoutDropDown();
//SearchHotalPage.getAdaltPerRommDropDown();
//SearchHotalPage.getChildRunPerRoom();


// System.out.println(LoginPages.getUserLable());
// System.out.println(LoginPages.getPasswordLable());
// System.out.println(LoginPages.getLoginLable());

// LoginPages.enterUserName("Theanraj");
// LoginPages.enterPassword("Theanraj@123");
// LoginPages.loginClick();
