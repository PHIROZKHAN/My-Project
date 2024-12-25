package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.BrowserWindowPage;


public class BrowserWindowTest  extends BaseLibrary{
	BrowserWindowPage ob ;
	   
	@BeforeTest(groups={"smoke","sanity","regression"})
	@Parameters("Browser1")
	public void launcher(String br)
	{
		launchUrl(br);
		ob= new BrowserWindowPage ();
		}
	@Test(priority=1, groups= {"smoke","sanity","regression"},enabled = true)
	public void cllickAtClose()
	{
		ob.clickOnClose();
	}
	@Test(priority=2, groups= {"smoke","sanity","regression"},enabled = true)
	public void cllickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3, groups= {"smoke","sanity","regression"},enabled = true)
	public void cllickAtAlertsFrameWindow()
	{
		ob.clickOnAlertsFrameWindow();
	}
	@Test(priority=4, groups= {"smoke","sanity","regression"},enabled = true)
	public void cllickAtBrowserWindows()
	{
		ob.clickOnBrowserWindows();
	}
	@Test(priority=5 , groups= {"smoke","sanity","regression"},enabled = true)
	public void cllickAtNewTab()
	{
		ob.clickOnNewTab();
	}
	@Test(priority=6 ,groups= {"smoke","sanity","regression"},enabled = true)
	public void clickAtNewWindow()
	{
		ob.clickOnNewWindow();
		driver.getTitle();
		
	}
	@Test(priority=7)
	public void clickAtNewWindowMsg()
	{
		ob.clickOnNewWindowMsg();
		driver.close();
	}
	

}
