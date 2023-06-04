package DEMO.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
	public static ChromeDriver driver;
	public static JavascriptExecutor js;
	
	@BeforeClass
	public void BrowserLunch()
	{
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public static void elementClick() throws InterruptedException
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='Elements']")).click();
	    Thread.sleep(1000);
	
}
}
