package org.testdata;

import org.BasePages.BasePage;
import org.pages.LoginPages;
import org.pages.SearchHotalPage;
import org.testng.annotations.Test;

public class TC001 extends BasePage {
	@Test()
	public void loginTest() {
		LoginPages.LoginTestCase("sdurairaj", "56SCWM");
		
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
}



















































































//System.out.println(LoginPages.getUserLable());
//System.out.println(LoginPages.getPasswordLable());
//System.out.println(LoginPages.getLoginLable());

//LoginPages.enterUserName("Theanraj");
//LoginPages.enterPassword("Theanraj@123");
//LoginPages.loginClick();

