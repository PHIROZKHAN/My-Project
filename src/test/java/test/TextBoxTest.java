package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.TextBoxPage;

public class TextBoxTest extends BaseLibrary {
	
	TextBoxPage ob ;
	@Parameters("Browser1")
	@BeforeTest
	public void launcher(String brow)
	{
		launchUrl(brow);
		ob = new TextBoxPage();
	}
	
	@Test(priority=1)
	public void clickonclose()
	{
		ob.clickonclose();
	}
	@Test(priority=2)
	public void clickonpractice()
	{
		ob.clickonpractice();
	}
	@Test(priority=3)
	public void clickonelements()
	{
		ob.clickonelements();
	}
	@Test(priority=4)
	public void clickontextbox()
	{
		ob.clickontextbox();
	}
	@Test(priority=5 ,enabled=true)
	public void filldetails()
	{
		ob.filldetails();
	}
	
	@Test(priority=6)
	public void clickonsubmit()
	{
		ob.submit();
	}
	@Test(priority=7)
	public void validate()
	{
		ob.validate();
	}
	
	

}
