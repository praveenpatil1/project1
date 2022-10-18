package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;


public class BaseClass 
{
	public WebDriver driver;
	public PropertyFileData pdata=new PropertyFileData();
	
	@BeforeTest
	public void openApp() throws IOException
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pdata.getData("url"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}



}
