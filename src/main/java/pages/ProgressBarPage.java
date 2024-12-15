package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class ProgressBarPage extends BaseLibrary {
	
	public ProgressBarPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement wiget;
	
	@FindBy(xpath="//*[text()='progress bar' and @href='#tab_20' ]")
	private WebElement progressbar;
	//*[@id='myBar']
	
	@FindBy(xpath="//*[@id='resetButton']")
	private WebElement strtbtn;
	
	@FindBy(xpath="//*[@id='myBar']")
	private WebElement bar;
	
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
	public void clickOnProgressBar()
	{
		waitforClick(progressbar);
	}
	public void clickOnStrtBtn()
	{
		waitforClick(strtbtn);
	}
	public void Progressbars()
	{
//		WebDriverWait wait= new WebDriverWait(driver,20);
	//	Boolean res= wait.until(ExpectedConditions.attributeToBe(bar, "aria-valuemax", "100"));
//		Assert.assertEquals(ExpectedConditions.attributeToBe(bar, "aria-valuemax", "100"), true);
		String value=bar.getAttribute("aria-valuemax");
		Assert.assertEquals(value, "100");

	}
	
	
	

}
