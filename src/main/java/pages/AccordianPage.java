package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class AccordianPage extends BaseLibrary{
	
	public AccordianPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath = "//*[@data-target='#widget']")
	private WebElement wigets;
	@FindBy(xpath = "//*[text()='accordion']")
	private WebElement accordian;
	
	@FindBy(xpath = "//*[@data-target='#collapse1']")
	private WebElement accordianpara;
	
	@FindBy(xpath = "//*[@id='collapse1']/div[@class='card-body']")
	private WebElement pragraph1;
	
	
	public void clickOnClose()
	{
		waitforClick(close);
	}
	public void clickOnPractice()
	{
		waitforClick(practice);
	}
	public void clickOnWidgets()
	{
		waitforClick(wigets);
	}
	public void clickOnAccordian()
	{
		waitforClick(accordian);
	}
	public void clickOnAccordianPara()
	{
		String actualtext=pragraph1.getText();
	
		String expectedtext="Accordions are useful when you want to toggle between";

		Assert.assertEquals(actualtext.contains(expectedtext), true);

	}
	
	
	

}
