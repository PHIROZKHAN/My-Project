package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class DatePickerPage extends BaseLibrary {
	public DatePickerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement wiget;
	
	@FindBy(xpath = "//*[text()='date picker']")
	private WebElement datepicker;
	@FindBy(xpath = "//*[@id='tab_18']/descendant::input[@type='date']")
	private WebElement date;
	
	@FindBy(xpath = "//input[@type='datetime-local']")
	private WebElement datetime;
	
	
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
	public void clickOnDatePicker()
	{
		waitforClick(datepicker);
	}
	public void clickOnDate()
	{
		date.clear();
		date.sendKeys("12-05-2023");
	}
	
	public void clickOnDateTime()
	{
		datetime.clear();
		datetime.sendKeys("20-12-2024T20:06Z");
//		"2013-04-02T14:58:33Z"  2024-12-17T20:06:39.997Z
	}

}
