package genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersImplementation extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		String FailedTestCase = result.getName();
		System.out.println(FailedTestCase);
		EventFiringWebDriver Web = new EventFiringWebDriver(driver);
			try 
			{
				File src = Web.getScreenshotAs(OutputType.FILE);
				File dest = new File("./Screenshot/"+FailedTestCase+".png");
				FileUtils.copyFile(src, dest);
			}catch(IOException e) 
			{
				e.printStackTrace();
			}
	}

}
