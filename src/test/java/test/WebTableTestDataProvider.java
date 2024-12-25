package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;

import pages.WebTablesPageDataProvider;

public class WebTableTestDataProvider extends BaseLibrary {
	 
	WebTablesPageDataProvider ob ;

	@BeforeTest
	public void launcher()
	{
		launchUrl("chrome");
		ob = new WebTablesPageDataProvider();
	}
	@Test(priority=1)
	public void clickonclose()
	{
		ob.clickonclose();
	}
	@Test(priority=2)
	public void clickonpractice()
	{
	   ob.clickonpractice();
	}
	@Test(priority=3)
	public void clickonelement()
	{
		ob.clickonelement(); 
	}
	@Test(priority=4)
	public void clickonwebtables()
	{
		ob.clickonwebtable();
	}
	@Test(priority=5,dataProvider = "webtable")
	public void clickonfilldetailes(String name, String email)
	{
		ob.filldetails(name, email);
	}
	
	
	/*@Test(priority=7)
	public void printna() {
		ob.printNames();	}
*/
}
