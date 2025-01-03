package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.SelectablePage;
import pages.SortablePage;

public class SoratbleTest extends BaseLibrary{

	SortablePage ob;
	
	@BeforeTest(groups= {"smoke"})
	@Parameters("Browser1")
	public void launcher(String browser)
	{
		launchUrl(browser);
		ob= new SortablePage();
	}
	@Test(priority=1,groups= {"smoke"},enabled=true)
	public void clickAtClose()
	{
		ob.clickOnClose();
	}
	@Test(priority=2,groups= {"smoke"},enabled=true)
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}

	@Test(priority=3,groups= {"smoke"},enabled=true)
	public void clickAtInteractions()
	{
		ob.clickOnInteractions();
	}
	@Test(priority=4,groups= {"smoke"},enabled=true)
	public void clickAtSortable()
	{
		ob.clickOnSortable();
	}
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void clickAtCities()
	{
		ob.clickOnCities();
	}
	
}
