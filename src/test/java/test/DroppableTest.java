package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.DroppablePage;

public class DroppableTest extends BaseLibrary{
	
	DroppablePage ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl("chrome");
		ob= new DroppablePage();
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
		ob.clickOnDroppable();
	}
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void imageToDiv()
	{
		ob.dragImageToDiv();
	}
}
