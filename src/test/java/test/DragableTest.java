package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.AutocompletePage;
import pages.DragablePage;

public class DragableTest extends BaseLibrary{
	
	DragablePage ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl("chrome");
		ob= new DragablePage();
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
	public void clickAtDragable()
	{
		ob.clickOnDragable();
	}
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void clickAtDrag()
	{
		ob.clickOnDrag();
	}
}
