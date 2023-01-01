package org.testdata;

import org.BasePages.BasePage;
import org.pages.LoginPages;
import org.pages.SearchHotalPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001 extends BasePage {
	@BeforeTest
	public void setData() {
		fileName = "TC001";
	}


	public void hotalSearchPage() {

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
		LoginPages.LoginTestCase(data[0],data[1]);
		hotalSearchPage();
		SearchHotalPage.getLocationDropDown();

	}
}

















































// System.out.println(LoginPages.getUserLable());
// System.out.println(LoginPages.getPasswordLable());
// System.out.println(LoginPages.getLoginLable());

// LoginPages.enterUserName("Theanraj");
// LoginPages.enterPassword("Theanraj@123");
// LoginPages.loginClick();
