package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baselibrary.BaseLibrary;

public class MenuPage extends BaseLibrary{

	public MenuPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement wiget;
	
	@FindBy(xpath="//a[text()='menu']")
	private WebElement menu;
	
	@FindBy(xpath="(//nav[@id=\"navbar\"]//li)[3]")
	private WebElement selectmenu;
	
	@FindBy(xpath="//li[text()='Web Development']")
	private WebElement webdevelopment;
	
	@FindBy(xpath = "(//*[@id=\"navbar\"]//li)[4]")
	private WebElement blog;
	
	@FindBy(xpath = "//a[text()='JavaScript']")
	private WebElement javascript;
	
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
	public void clickOnMenu()
	{
		waitforClick(menu);
	}
	public void selectMenu()
	{
		movetoElement(selectmenu);
//		Select sele= new Select(selectmenu);
//		sele.selectByIndex(3);
	}
	public void clickOnBlog()
	{
		movetoElement(blog);
	}
	
	
	
}
