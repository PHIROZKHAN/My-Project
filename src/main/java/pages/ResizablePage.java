package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class ResizablePage extends BaseLibrary{
	
	public ResizablePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target='#interations']")
	private WebElement interactions;
	
	@FindBy(xpath = "//*[text()='resizable' and @role='tab']")
	private WebElement resizable;
	
	@FindBy(xpath = "//*[text()='Resize me']")
	private WebElement Resize;
	
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
	public void clickOnResizable()
	{
		waitforClick(resizable);
	}
	public void Resizebox()
	{
		dragAndDrop(Resize, 150, 123);
	}
	

}
