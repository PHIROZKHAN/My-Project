 
 package test;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.LoginPage;

public class LoginTest extends BaseLibrary {
	
	LoginPage ob;

	@Parameters("Browser1")
	@BeforeTest
	public void launcher(String Browser) { 
	    
	    launchUrl(Browser); // Dynamically pass the browser parameter
	    ob = new LoginPage(); // Ensure this initialization does not fail
	}

	@Test
	public void clickonclose()
	{
		ob.clickonclose();
	}
	@Test
	public void geturl()// printing current page url
	{
		ob.geturl();
	}
	@Test
	public void gettitle() // printing page title
	{
		ob.getTitle();
	}

}
