package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.MenuPage;
import pages.ToolTipPage;

public class ToolTipTest extends BaseLibrary {
	ToolTipPage ob;
	
	@BeforeTest(groups= {"smoke"})
	@Parameters("Browser1")
	public void launcher(String br)
	{
		launchUrl(br);
		ob= new ToolTipPage();
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
	public void clickAtToolTip()
	{
		ob.clickOnToolTip();
	}
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void clickAtToolTip1()
	{
		ob.clickOnToolTip1();
	}
	
	@Test(priority=6,groups= {"smoke"},enabled=true)
	public void clickAtToolTip2()
	{
		ob.clickOnToolTip2();
	}
	

}
