package genericlibrary;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplimentation implements ITestListener {
	
	@Override
	public void onTestFailure(ITestResult Results)
	{
		TakesScreenshot ts = (TakesScreenshot)BaseTest.listenersDriver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./failedTC/"+Results.getName()+".png");
	}

}
