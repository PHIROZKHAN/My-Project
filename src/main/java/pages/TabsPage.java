package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class TabsPage extends BaseLibrary {
	
	public TabsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement wiget;
	
	@FindBy(xpath = "//a[text()='tabs']")
	private WebElement tabs;
	
	@FindBy(xpath="//a[@id='home-tab']")
	private WebElement tab1;
	@FindBy(xpath = "//a[@id='profile-tab']")
	private WebElement tab2;
	@FindBy(xpath="//*[@id='contact-tab']")
	private WebElement tab3;
	
	
	public void clickOnClose()
	{
		waitforClick(close);
	}
	public void clickOnPractice()
	{
		waitforClick(practice);
	}
	public void clickOnWiget()
	{
		waitforClick(wiget);
	}
	public void clickOnTabs()
	{
		waitforClick(tabs);
	}
	public void clickOnTab1()
	{
		waitforClick(tab1);
//		String expectedtab1="";
//		String actual=tab1.getText();
//		Assert.assertEquals(expectedtab1, actual);
	}
	public void clickOnTab2()
	{
		waitforClick(tab2);
	}
	public void clickOnTab3()
	{
		waitforClick(tab3);
	}
	

}
