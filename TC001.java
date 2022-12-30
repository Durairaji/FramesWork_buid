package org.testdata;

import org.BasePages.BasePage;
import org.pages.LoginPages;
import org.testng.annotations.Test;

public class TC001 extends BasePage {
	@Test()
	public void loginTest() {
		System.out.println(LoginPages.getUserLable());
		System.out.println(LoginPages.getPasswordLable());
		System.out.println(LoginPages.getLoginLable());
		
		LoginPages.enterUserName("Theanraj");
		LoginPages.enterPassword("Theanraj@123");
		LoginPages.loginClick();
	}

}
