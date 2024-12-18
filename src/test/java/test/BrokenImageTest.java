package test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.BrokenImagePage;

public class BrokenImageTest extends BaseLibrary {
	
	BrokenImagePage ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl("chrome", "https://demoqa.com/broken");
		ob= new BrokenImagePage();
	}
//	@Test(priority=1,groups= {"smoke","sanity"},enabled=true)
//	public void clickAtClose()
//	{
//		ob.clickOnClose();
//	}
//	@Test(priority=2,groups= {"smoke","sanity"},enabled=true)
//	public void clickAtPractice()
//	{
//		ob.clickOnPractice();
//	}
//	@Test(priority=3,groups= {"smoke","sanity"},enabled=true)
//	public void clickAtElement()
//	{
//		ob.clickOnElement();
//	}
//	@Test(priority=4,groups={"smoke","sanity"},enabled=true)
//	public void clickAtBrokenImage()
//	{
//		ob.clickOnBrokenImage();
//	}
	@Test(priority=5,groups= {"smoke","sanity"},enabled=true)
	public void veryfyImageLink()
	{
		ob.verifyimagelink();
	}
}
