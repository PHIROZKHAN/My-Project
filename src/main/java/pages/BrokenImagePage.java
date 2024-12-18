package pages;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class BrokenImagePage extends BaseLibrary {
	
	public BrokenImagePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy (xpath="//*[contains(@data-target,'#elements')]")
	private WebElement element;
	
	@FindBy (xpath = "//*[@data-toggle=\"pill\" and text()='broken  - images']")
	private WebElement brokenimage;
	
	@ FindBy(xpath = "//a")
	private List<WebElement> imagelist;
	 
	public void clickOnClose()
	{
		waitforClick(close);
	}
	public void clickOnPractice()
	{
		waitforClick(practice);
	}
	public void clickOnElement()
	{
		waitforClick(element);
	}
	public void clickOnBrokenImage()
	{
		waitforClick(brokenimage);
	}
	public void verifyimagelink()
	{
		for(WebElement dd:imagelist)
		{
			String url=dd.getAttribute("href");
			getResponseCodeForRequest(url);
			System.out.println(url);
			
		}
	}
	

}
