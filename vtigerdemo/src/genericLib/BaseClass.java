package genericLib;//not working before because dependency is put in to folder when i copy past the dependencies in project it starts working

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import objectrepository.LoginPage_Pom;

public class BaseClass {
	
	public static CommonFileHandlingMthods  f=new CommonFileHandlingMthods ();
	public static WebDriver driver;
	//public  WebDriver driver;
	
	@BeforeSuite(alwaysRun=true)//(alwaysRun=true) is given to resolver the configuration issue of group execution
	public void connectDB() 
	{
		System.out.println("----DB Connection Starts----");
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(String browser) throws Throwable 
	{
		System.out.println("--------Launch Browser--------");
		if(browser.equals("chrome")) 
		{
			driver=new ChromeDriver();
			Reporter.log("Chrome Browser launch");
		}else
		{
		driver=new FirefoxDriver();	
		Reporter.log("FireFox Browser launch", true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(f.getValueFromPropertyFile("url"));
	}
	@BeforeMethod(alwaysRun=true)
	public void loginToVtiger() throws Throwable 
	{
		System.out.println("-------Login Starts--------");
		
		LoginPage_Pom LP = PageFactory.initElements(driver, LoginPage_Pom.class);
		String un = f.getValueFromPropertyFile("un");
		String pw = f.getValueFromPropertyFile("pwd");
		LP.successfullLogin(un, pw);
		String ActTitle = driver.getTitle();
		String ExpTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		//TestNG Assertion
		SoftAssert s=new SoftAssert();
		s.assertEquals(ActTitle, ExpTitle);
		s.assertAll("Log In Success");
	}
	@AfterMethod(alwaysRun=true)
	public void logoutToVtiger() 
	{
		WebElement signout = driver.findElement(By.xpath(" //span[text()=' Administrator']/../following-sibling::td"));
		Actions act = new Actions(driver);
		act.moveToElement(signout).perform();
		driver.findElement(By.linkText("Sign Out")).click();
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser() 
	{
		System.out.println("----Close Browser----");
		driver.close();
	}
	@AfterSuite(alwaysRun=true)
	public void DisconnectDB() 
	{
		System.out.println("----DB Connection Stops----");
	}
	
}