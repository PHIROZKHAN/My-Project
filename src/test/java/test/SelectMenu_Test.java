package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.SelectMenu_Page;

public class SelectMenu_Test extends BaseLibrary {
	
	SelectMenu_Page ob;
	
	@BeforeTest
	public void launcher()

	{
		launchUrl("chrome");
		ob = new SelectMenu_Page();
	}
	
	@Test(priority=1,groups={"smokeTest","Regression"},enabled=true)
	public void clickAtClose()
	{
		ob.clickOnClose();
	}
	@Test(priority=2,groups= {"smaoke","regression"},enabled=true)
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3,groups= {"smoke","regression"},enabled=true)
	public void clickAtWigets()
	{
	ob.cllickOnWigets();	
	}
	@Test(priority=4, groups={"smoke"},enabled=true)
	public void clickAtSelectMenu()
	{
		ob.clickOnSelectMenu();
	}
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void clickAtSelectValue()
	{
		ob.clickOnSelectValue();
		
	}
	@Test(priority=6,groups= {"smoke"},enabled=true)
	public void clickAtSelectTitle()
	{
		ob.clickOnSelectTitle();	
	}
	@Test(priority=7,groups= {"smoke"},enabled=true)
	public void clickAtOldStyle()
	{
		ob.clickOnOldStyle();	
	}
	@Test(priority=8,groups= {"smoke"},enabled=true)
	public void clickAtStdMultiSelect()
	{
		ob.clickOnStdMultiSelect();	
	}
	

}
