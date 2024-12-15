package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.ResizablePage;


public class ResizableTest extends BaseLibrary{
	
	ResizablePage ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl("chrome");
		ob= new ResizablePage();
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
	public void clickAtResizable()
	{
		ob.clickOnResizable();
	}
	@Test(priority=6,groups= {"smoke"},enabled=true)
	public void ResizeBox()
	{
		ob.Resizebox();
	}
}
