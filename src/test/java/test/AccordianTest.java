package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.AccordianPage;

public class AccordianTest extends BaseLibrary {
	
	AccordianPage ob;
	@Parameters("Browser1")
	@BeforeTest(groups= {"smoke"})
	public void launcher(String browser1)
	{
		launchUrl(browser1);
		
		ob= new AccordianPage();
		
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
	
	@Test(priority=4,groups= {"smoke"},enabled=true)
	public void clickAtAccordian()
	{
		ob.clickOnAccordian();
	}
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void clickAtAccordianPara()
	{
		ob.clickOnAccordianPara();
	}
	@Test(priority=3,groups= {"smoke"},enabled=true)
	public void clickAtWidgets()
	{
		ob.clickOnWidgets();
	}

	
}
