package DataProviderXlSheet;

import org.testng.annotations.DataProvider;



public class DataProviderStore {
	@DataProvider(name="login",parallel=!true)
	public  String[][] data() {
		String[][] xlData = DataProvideXlBase.getXlData();
		
//		String[][]data=new String[2][2];
//		data[0][0]="sdurairaj123123@gmail.com";
//		data[0][1]="12345";
//		data[1][0]="thaen@1234";
//		data[1][1]="4321";
//		
		return xlData;
	}
}



