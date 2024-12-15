package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class DragablePage extends BaseLibrary{
	
	public DragablePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target='#interations']")
	private WebElement interactions;
	
	@FindBy(xpath = "//*[text()='draggable' and@ role='tab']")
	private WebElement dragable;
	
	@FindBy(xpath = "//*[@id='draggable']")
	private WebElement drag;
	
	@FindBy(xpath = "//iframe[@src='dragable.html']")
	private WebElement iframe;
	
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
	public void clickOnDragable()
	{
		waitforClick(dragable);
	}
	
	public void clickOnDrag()
	{
		driver.switchTo().frame(iframe);
		dragAndDrop(drag, 550, 280);
		driver.switchTo().defaultContent();
	}

}
