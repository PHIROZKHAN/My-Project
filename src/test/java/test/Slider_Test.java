package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Slider_Page;


public class Slider_Test extends BaseLibrary {
	
	Slider_Page ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl("chrome");
		ob= new Slider_Page();
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
	public void clickAtSlider()
	{
		ob.clickOnSlider();
	}
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void clickAtSliderBar()
	{
		ob.clickOnSliderBar();
	}
	

}
