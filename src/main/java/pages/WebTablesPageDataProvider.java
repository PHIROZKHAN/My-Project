package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class WebTablesPageDataProvider extends BaseLibrary {
	
	public WebTablesPageDataProvider()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='×'] ")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath="//a[text()='web tables']")
	private WebElement webtable;
	
	@FindBy(xpath="//iframe[@src='Webtable.html']")
	private WebElement iframe;
	
	@FindBy(xpath="//*[text()='Name:']/following::input[@name='name']")
	//@FindBy(xpath="//input[@pattern'^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement name;
	
	@FindBy(xpath="//*[text()='Email:']/following::input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="//button[text()='Edit']")
	public  List<WebElement> edit;
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement delete;
	
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement cancel;
	
	@FindBy(xpath="//button[text()='Update']")
	private WebElement update;
	
	@FindBy(xpath="//*[@name='edit_name']")
	private WebElement editname;
	
	@FindBy(xpath="//*[@name='edit_email']")
	private WebElement editemail;
	
	
	public void clickonclose()
	{
		close.click();
	}
	public void clickonpractice()
	{
		practice.click();
	}
	public void clickonelement()
	{
		element.click();
	}
	public void clickonwebtable()
	{
		webtable.click();
	}
	//filling WebTable By Data Provider
	public void filldetails(String name2, String email2)
	{
		driver.switchTo().frame(iframe);
		waitforDisplay(name, name2);
		waitforDisplay(email, email2);
		waitforClick(save);
		
		
		
		
		driver.switchTo().defaultContent();			
	}
		  
	
}
	
	
	        
	    
	
	
