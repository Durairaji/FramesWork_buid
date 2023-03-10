package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportingDetails {

	public static void main(String[] args) {

		//WE ASSIGN THE LOCATION Template report
		ExtentSparkReporter report = new ExtentSparkReporter("./TestReport.html");
		// create the report
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		
		ExtentTest test = extent.createTest("TC001-loginTest");
		
	   //test case 1
		test.pass("enter the username and password");
		test.pass("type the personal details ");
		test.pass("login is successful");
		
		//testcase2
		
		ExtentTest test2 = extent.createTest("TC002-payment testcase");
		test2.fail("payment fail");
		
		
		//flush() which is do save of the report
		extent.flush();
		
		
		
		
		
	}

}
