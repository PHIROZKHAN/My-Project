package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baselibrary.BaseLibrary;
import pages.DatePickerPage;

public class DatePickerTest extends BaseLibrary {
	
	DatePickerPage ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl("chrome");
		ob= new DatePickerPage();
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
	public void clickAtDatePicker()
	{
		ob.clickOnDatePicker();
	}
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void clickAtDate()
	{
		ob.clickOnDate();
	}
	@Test(priority=6,groups= {"smoke"},enabled=true)
	public void clickAtDateTime()
	{
		ob.clickOnDateTime();
	}
	

}
