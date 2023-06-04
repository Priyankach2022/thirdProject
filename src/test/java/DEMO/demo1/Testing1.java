package DEMO.demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.sl.usermodel.TextBox;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.ReadExcel;

public class Testing1 extends BaseClass
{
	@Test(dataProvider="getdata1")
	public void demoqa1(String name, String gmail, String city, String address) throws InterruptedException
	{ 
		//TextBox
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()='Elements']")).click();
	    Thread.sleep(1000);
	   // driver.findElement(By.xpath("//*[text()='Elements']")).click();*/
		BaseClass.elementClick();
	    driver.findElement(By.xpath("//*[text()='Text Box']")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//*[@id='userName']")).clear();
	    driver.findElement(By.xpath("//input[@id='userEmail']")).clear();
	    driver.findElement(By.xpath("//*[@id='currentAddress']")).clear();
	    driver.findElement(By.xpath("//*[@id='permanentAddress']")).clear();
	    driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(name);
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,200)");
	    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(gmail);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys(city);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys(address);
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,150)");
	    driver.findElement(By.xpath("//*[@id='submit']")).click();
	    String us = driver.findElement(By.xpath("//p[@id='name']")).getText();
	    System.out.println(us+" us");
	    String us1 = driver.findElement(By.xpath("//p[@id='email']")).getText();
	    String us2 = driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
	    String us3 = driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
	   
	  //  Assert.assertEquals(us, "PRIYANKA");
	    Assert.assertTrue(us.contains(name));
	    Assert.assertTrue(us1.contains(gmail));
	    Assert.assertTrue(us2.contains(city));
	    Assert.assertTrue(us3.contains(address));	    
	    
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][4];
		data[0][0]="Priyanka";
		data[0][1]="priyankac841@gmail.com";
		data[0][2]="Ghaziabad";
		data[0][3]="Shamli";
		data[1][0]="Teena";
		data[1][1]="primca50@gmail.com";
		data[1][2]="Noida";
		data[1][3]="Lilon";
	    return data;
	}
	
	@DataProvider
	public Object[][] getdata1(ITestContext context) throws IOException
	{
		//String s = context.getCurrentXmlTest().getParameter("sheet");	
		Object[][] ob = ReadExcel.read(context.getCurrentXmlTest().getParameter("sheet"));
		
		return ob;
		
		
		
	}
	
	@Test
	public void demoqa2() throws Exception
	{
		//CheckBox
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Elements']")).click();
	    Thread.sleep(1000);*/
		BaseClass.elementClick();
	    driver.findElement(By.xpath("//span[text()='Check Box']")).click();
	    driver.findElement(By.xpath("//button[@aria-label='Expand all']")).click();
		js.executeScript("window.scrollBy(0,300)");
	    driver.findElement(By.xpath("//span[text()='Notes']")).click();
	    driver.findElement(By.xpath("//span[text()='Documents']")).click();
	    WebElement checkbox= driver.findElement(By.xpath("//input[@id='tree-node-notes']"));
	    Assert.assertTrue(checkbox.isSelected());
	
	}
	
	@Test
	public void demoqa3() throws Exception
	{
		//RadioButton
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Elements']")).click();*/
		BaseClass.elementClick();
	    Thread.sleep(1000);
	    js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		WebElement radio1= driver.findElement(By.xpath("//input[@id='yesRadio']"));
		Assert.assertTrue(radio1.isSelected());
	}
	
	@Test
	public void demoqa4() throws Exception
	{
		//WebTables
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Elements']")).click();*/
		BaseClass.elementClick();
	    Thread.sleep(1000);
	    js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
		js.executeScript("window.scrollBy(0,400)");
		//Edit the entry
		driver.findElement(By.xpath("//span[@title='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='salary']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("15000");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		//String sal=driver.findElement(By.xpath("//input[@id='salary']")).getText();
	
	}
	
	@Test
	public void demoqa5() throws InterruptedException
	{
		//Buttons
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Elements']")).click();*/
		BaseClass.elementClick();
	    Thread.sleep(1000);
	    js.executeScript("window.scrollBy(0,400)");
	    
	    driver.findElement(By.xpath("//span[text()='Buttons']")).click();
	    Actions action=new Actions(driver);
	    //doubleClick
	    WebElement db=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	    action.doubleClick(db).perform();
	    //RightClick
	    
	    
	}
	
	@Test
	public void demoqa6() throws Exception
	{   //Links
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Elements']")).click();*/
		BaseClass.elementClick();
	    Thread.sleep(1000);
	    js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//span[text()='Links']")).click();
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(1000);
		Actions action=new Actions(driver);
		Set<String> allwindows= driver.getWindowHandles();
		for(String a: allwindows)
		{
		driver.switchTo().window(a);
	    System.out.println("a value:"+a);
		BaseClass.elementClick();
	}
}
	
	@Test
	public void demoqa7() throws Exception
	{
		BaseClass.elementClick();
	    Thread.sleep(1000);
	    js.executeScript("window.scrollBy(0,700)");
	   driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']")).click();
	   driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
	   driver.findElement(By.xpath("//button[text()='New Tab']")).click();
	   driver.findElement(By.xpath("//button[text()='New Window']")).click();
	  driver.findElement(By.xpath("//button[text()='New Window Message']")).click();
	   String parentwindow=driver.getWindowHandle();
	   Set<String> chilwindow=driver.getWindowHandles();
	   System.out.println("value of childwindow"+chilwindow);
	  // Iterator<String> itr=chilwindow.iterator();
	   //System.out.println("enter the counter value");
	 //  Scanner sc=new Scanner(System.in);
	   int counter=1;
	  // while(itr.hasNext())
	   for(String Child_window:chilwindow)
	   {
		   
		  // String Child_window=itr.next();
		   
		   
		   if(!parentwindow.equals(Child_window))
		   {
			  
			   driver.switchTo().window(Child_window);
			   if(counter==1)
			   {
			//	System.out.println(driver.findElement(By.xpath("//h1")).getText());
			
			   System.out.println(" window address1="+Child_window);
		       }
			   
			   else if(counter==2)
			   {
				  // System.out.println(driver.findElement(By.xpath("//h1")).getText());
					
				   System.out.println(" window address2="+Child_window);
			   }
			   
			   else if(counter==3)
			   {
				 //  System.out.println(driver.findElement(By.xpath("//body")).getText());
				   System.out.println(" window address3="+Child_window);
			   }
			   
			   
	      }
		   System.out.println("counter is:"+counter);
		   counter++;
	   }
	   
	  // driver.switchTo().window(parentwindow);
	   
	}
	public void demoqa8() throws Exception
	{
		BaseClass.elementClick();
	    Thread.sleep(1000);
	    js.executeScript("window.scrollBy(0,700)");
	    
driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		WebElement el = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
	int x=	el.getLocation().getX();
	int y=	el.getLocation().getY();
		Select s = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
		s.selectByIndex(0);
		s.selectByValue("");
		s.selectByVisibleText("");
	    List<WebElement> ls =	s.getOptions(); // total number of option present in the dropdown
        int size	= ls.size();
        System.out.println(size);
        
     Actions ac = new Actions(driver);
       ac.moveToElement(el).click().click(driver.findElement(By.xpath("(//option[@value='4'])[1]"))).build();
       ac.perform();
	       
       Actions ac = new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.xpath("//div[@class='draggable ui-widget-content ui-draggable ui-draggable-handle']")), driver.findElement(By.xpath("//span[@class='ui-widget-header ui-draggable ui-draggable-handle']"))).build().perform();
	
       ac.(clickAndHoldel).moveToElement(e).release();
	}
}





