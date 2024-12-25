package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.AutocompletePage;

public class AutocompleteTest extends BaseLibrary {
	
	AutocompletePage ob;
	
	@BeforeTest(groups= {"smoke"})
	@Parameters("Browser1")
	public void launcher(String browser1)
	{
		launchUrl(browser1);
		ob= new AutocompletePage();
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
	public void clickAtAutoComplete()
	{
		ob.clickOnAutoComplete();
	}
	@Test(priority=5,groups= {"smoke"},enabled=true)
	public void clickAtAutoCompletetext()
	{
		ob.clickOnAutocompletetext();
	}

}
