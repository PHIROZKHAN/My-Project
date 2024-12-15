package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;

import pages.SelectablePage;

public class SelectableTest extends BaseLibrary{
	
	SelectablePage ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl("chrome");
		ob= new SelectablePage();
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
	public void clickAtSelectable()
	{
		ob.clickOnSelectable();
	}
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void clickAtSelectableList()
	{
		ob.clickOnSelectableList();
	}
	@Test(priority=6,groups= {"smoke"},enabled=true)
	public void clickAtSelectableListItem()
	{
		ob.clickOnSelectableListItem();
	}
	@Test(priority=7,groups= {"smoke"},enabled=true)
	public void clickAtSelectableGrid()
	{
		ob.clickOnSelectableGrid();
	}
	@Test(priority=8,groups= {"smoke"},enabled=true)
	public void clickAtSelectableGridItem()
	{
		ob.clickOnGridItem();
	}
	
}
