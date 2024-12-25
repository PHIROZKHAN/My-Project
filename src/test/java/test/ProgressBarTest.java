package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.ProgressBarPage;
import pages.TabsPage;

public class ProgressBarTest extends BaseLibrary {
	
	ProgressBarPage ob;
	
	@BeforeTest(groups= {"smoke"})
	@Parameters("Browser1")
	public void launcher(String br)
	{
		launchUrl(br);
		ob= new ProgressBarPage();
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
	public void clickAtProgressBar()
	{
		ob.clickOnProgressBar();	}
	
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void clickAtStrtBtn()
	{
		ob.clickOnStrtBtn();
		}
	@Test(priority=6,groups= {"smoke"},enabled=true)
	public void ProgressBar()
	{
		ob.Progressbars();
		}
}
