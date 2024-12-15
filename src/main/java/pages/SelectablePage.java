package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselibrary.BaseLibrary;

public class SelectablePage extends BaseLibrary{
	
	public SelectablePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target='#interations']")
	private WebElement interactions;
	
	@FindBy(xpath = "//*[text()='selectable' and @role='tab']")
	private WebElement selectable;
	
	@FindBy(xpath = " //*[text()='Select List']")
	private WebElement selectablelist;
	
	@FindBy(xpath = "//*[text()='There’s no traffic after the extra mile.']")
	private WebElement listitem;
	
	@FindBy(xpath = "//*[text()='Select Grid'] ")
	private WebElement selectablegrid;
	
	@FindBy(xpath = "//*[@id='grid-select']/descendant::div[5]")
	private WebElement griditem;
	
//	@FindBy(xpath = "//iframe[@src='drop.html']")
//	private WebElement iframe;
//	
	public void clickOnClose()
	{
		waitforClick(close);
	}
	public void clickOnPractice()
	{
		waitforClick(practice);
	}
	public void clickOnInteractions()
	{
		waitforClick(interactions);
	}
	public void clickOnSelectable()
	{
		waitforClick(selectable);
	}
	public void clickOnSelectableList()
	{
		waitforClick(selectablelist);
	}
	public void clickOnSelectableListItem()
	{
		doubleclick(listitem);
//to wait until the style attribute is updated	using this wait	
		 WebDriverWait wait = new WebDriverWait(driver, 20);
         wait.until(ExpectedConditions.attributeToBe(listitem, "style", "background: blue; color: white;"));	
     
	}
	
	public void clickOnSelectableGrid()
	{
		waitforClick(selectablegrid);
	}
	public void clickOnGridItem()
	{
		doubleclick(griditem);
		WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.attributeToBe(griditem, "style", "background: blue; color: white;"));	
    
	}
	
	
}
