package genericlibrary;

import java.io.IOException;

import javax.xml.datatype.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class RegisterBaseTest {
	
	public WebDriver driver;
	public DataUtility du = new DataUtility();
	
	public UtilityMethods utility_methods = new UtilityMethods();
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(du.getDataFromProperties("url"));
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}

}
