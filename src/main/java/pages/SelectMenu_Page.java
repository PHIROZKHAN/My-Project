package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class SelectMenu_Page extends BaseLibrary {
	
	public SelectMenu_Page()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement wiget;
	
	@FindBy(xpath = "//a[text()='select menu']")
	private WebElement selectmenu;
	
	@FindBy(xpath = "//div[@id='tab_24']/descendant::select[1]")
	private WebElement selectvalue;
	
	@FindBy(xpath = "//*[@id='tab_24']/descendant::select[2]")
	private WebElement selecttitle;
	
	@FindBy(xpath = "//*[@id='tab_24']/descendant::select[3]")
	private WebElement oldstyle;
	
	@FindBy(xpath = "//*[@id='tab_24']/descendant::select[5]")
	private WebElement stdmultiselect;
	
	public void clickOnClose()
	{
		waitforClick(close);
	}
	public void clickOnPractice()
	{
		waitforClick(practice);
	}
	public void cllickOnWigets()
	{
		waitforClick(wiget);
	}
	public void clickOnSelectMenu()
	{
		waitforClick(selectmenu);
	} public void clickOnSelectValue()
	{
		selectbyindex(selectvalue, 3);
	}
	public void clickOnSelectTitle()
	{
		selectbyindex(selecttitle, 2);
	}
	 public void clickOnOldStyle() {
		 selectbyindex(oldstyle, 4);
	 }
	
	 public void clickOnStdMultiSelect() {
		 selectbyindex(stdmultiselect, 3);
		 selectbyindex(stdmultiselect, 2);
	 }
	
	

}
