package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.TabsPage;
import pages.ToolTipPage;
	
public class TabsTest extends BaseLibrary {
	
	TabsPage ob;
	
	@BeforeTest(groups= {"smoke"})
	@Parameters("Browser1")
	public void launcher(String browser)
	{
		launchUrl(browser);
		ob= new TabsPage();
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
	public void clickAtWigets()
	{
		ob.clickOnWiget();
	}
	@Test(priority=4,groups= {"smoke"},enabled=true)
	public void clickAtTab()
	{
		ob.clickOnTabs();
	}
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void clickAtTab1()
	{
		ob.clickOnTab1();
	}
	@Test(priority=6,groups= {"smoke"},enabled=true)
	public void clickAtTab2()
	{
		ob.clickOnTab2();
	}
	@Test(priority=7,groups= {"smoke"},enabled=true)
	public void clickAtTab3()
	{
		ob.clickOnTab3();
	}

}
