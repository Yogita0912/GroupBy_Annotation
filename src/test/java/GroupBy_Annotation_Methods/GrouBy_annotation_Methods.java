package GroupBy_Annotation_Methods;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GrouBy_annotation_Methods
{
	WebDriver driver;
	@BeforeSuite
	public void openbrowser()
	{
		System.out.println("Open Browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sh\\Downloads\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@BeforeTest
	public void EnterURL()
	{
		System.out.println("Enter URL");
	}
	
	@BeforeClass
	public void MaxBrowser()
	{
		System.out.println("Maximize Browser");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void GetCookies()
	{
		System.out.println("Get Cookies");
	}
	
	@Test(groups= {"demo1"})
	public void Amazon() throws InterruptedException
	{
		System.out.println("Amazon Starts");
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Kurtis");
		Thread.sleep(2000);
	}
	
	@Test(groups= {"demo1"})
	public void Flipkart()
	{
		System.out.println("Flipkart Starts");
		driver.get("https://www.flipkart.com/");
	}
	
	@Test(groups= {"demo2"})
	public void Meesho()
	{
		System.out.println("Meesho starts");
		driver.get("https://meesho.com/");
	}
	
	@Test(groups= {"demo2"})
	public void snapdeal()
	{
		System.out.println("Snapdeal starts");
		driver.get("https://www.snapdeal.com/");
	}
	
	@AfterMethod
	public void GetScreenshot() throws IOException
	{
		System.out.println("Take Sceenshot");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("C:\\Users\\sh\\eclipse-workspace\\GroupBy_Annotation_Methods\\Screenshot"));
	}
  
	@AfterClass
	public void DeleteCookies()
	{
		System.out.println("Delete Coookies");
	}
	
	@AfterTest
	public void DBConnectionclosed()
	{
		System.out.println("Close Database Connection");
	}
	
	@AfterSuite
	public void Close()
	{
		System.out.println("Close");
	}
	
	
	
	
	
}
