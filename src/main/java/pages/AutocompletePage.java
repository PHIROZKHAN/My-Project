package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baselibrary.BaseLibrary;


public class AutocompletePage extends BaseLibrary
{
	public AutocompletePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement wiget;
	@FindBy(xpath = "//*[text()='auto complete' and @href='#tab_17']")
	private WebElement autocomplete;
	
	@FindBy(xpath = "//input[@id='myInput']")
	private WebElement autocompletetext;
	
	@FindBy(xpath = "//*[@id='myInputautocomplete-list']/div[1]/strong")
	private WebElement dropdowntext;

	@FindBy(xpath = "//iframe[@src='Autocomplete.html']")
	private WebElement frame;
	
	
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
	public void clickOnAutoComplete()
	{
		waitforClick(autocomplete);
	}
	public void clickOnAutocompletetext()
	{
		driver.switchTo().frame(frame);
		waitforDisplay(autocompletetext, "In");
		 new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(dropdowntext));
//		autocompletetext.sendKeys(Keys.ARROW_DOWN); 
//	    autocompletetext.sendKeys(Keys.ENTER);
	    WebElement firstSuggestion = driver.findElement(By.xpath("//*[@id='myInputautocomplete-list']/div[1]/strong"));
        firstSuggestion.click(); 
        String act=autocompletetext.getAttribute("value");
        String exp="India";
	    Assert.assertEquals(act, exp);
	    
	    driver.switchTo().defaultContent();
	}

	
	
	
	
	
	
}
