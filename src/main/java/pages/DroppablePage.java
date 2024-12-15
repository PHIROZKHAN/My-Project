package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class DroppablePage extends BaseLibrary{
	
	public DroppablePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target='#interations']")
	private WebElement interactions;
	
	@FindBy(xpath = "//*[text()='droppable' and @role='tab']")
	private WebElement droppable;
	
	@FindBy(xpath = "//*[@id='drag1']")
	private WebElement img;
	
	@FindBy(xpath = "//*[@id='div1']")
	private WebElement divbox;
	
	@FindBy(xpath = "//iframe[@src='drop.html']")
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
	public void clickOnDroppable()
	{
		waitforClick(droppable);
	}
	
	public void dragImageToDiv()
	{
		driver.switchTo().frame(iframe);
		Actions actions = new Actions(driver);

        // Perform drag-and-drop action
        actions.dragAndDrop(img, divbox).perform();
  
		driver.switchTo().defaultContent();
	}

}
