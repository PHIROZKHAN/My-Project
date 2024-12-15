package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class ToolTipPage extends BaseLibrary {
	
	public ToolTipPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement wiget;
	
	@FindBy(xpath = "//a[text()='tool tips']")
	private WebElement tooltip;
	@FindBy(xpath = "//button[@data-toggle='tooltip']")
	private WebElement tooltip1;
	
	@FindBy(xpath = "//input[@data-toggle='tooltip']")
	private WebElement tooltip2;
	
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
	public void clickOnToolTip()
	{
		waitforClick(tooltip);
	}
	public void clickOnToolTip1()
	{
		waitforClick(tooltip1);
		String expectedtooltip="you hovered over the button";
		String actualtooltip=tooltip1.getAttribute("title");
		Assert.assertEquals(actualtooltip, expectedtooltip);
	}
	public void clickOnToolTip2()
	{
		waitforClick(tooltip2);
		String actualtooltip2=tooltip2.getAttribute("title");
		String expectedtooltip2="you hovered over the input";
		Assert.assertEquals(actualtooltip2,expectedtooltip2);
	}
	
	
	
	
	
	
	
	

}
