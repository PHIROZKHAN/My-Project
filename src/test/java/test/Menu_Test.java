package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.MenuPage;

public class Menu_Test extends BaseLibrary {
	
	MenuPage ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl("chrome");
		ob= new MenuPage();
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
		ob.cllickOnWigets();
	}
	@Test(priority=4,groups= {"smoke","sanity"},enabled=true)
	public void clickAtMenu()
	{
		ob.clickOnMenu();
	}
	@Test(priority=5,groups= {"smoke","regression"},enabled=true)
	public void clickAtSelectMenue()
	{
		ob.selectMenu();
	}
	@Test(priority=6,groups= {"smoke","regression"},enabled=true)
	public void clickAtBlog()
	{
		ob.clickOnBlog();
	}
	
	
	

}
