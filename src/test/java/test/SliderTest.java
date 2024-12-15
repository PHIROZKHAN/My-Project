package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.ProgressBarPage;
import pages.SliderPage;

public class SliderTest extends BaseLibrary {
	
	SliderPage ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl("chrome");
		ob= new SliderPage();
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


}
