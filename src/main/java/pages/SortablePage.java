package pages;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class SortablePage extends BaseLibrary {
	
  public SortablePage()
  {
	  PageFactory.initElements(driver,this);
  }

  @FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target='#interations']")
	private WebElement interactions;
	
	@FindBy(xpath = " //*[text()='sortable']")
	private WebElement sortable;
	
	@FindBy(xpath = " //*[text()='Sort']")
	private WebElement sort;
	
	@FindBy(xpath = " //*[@id=\"myTable\"]//td")
	private List<WebElement> cities;
	
	
	
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
	
	public void clickOnSortable()
	{
		waitforClick(sortable);
	}
	
	public void clickOnCities()
	{
		LinkedList<String> list = new LinkedList<>();
		LinkedList<String> list2 = new LinkedList<>();
		for(int i =0; i<cities.size();i=i+2)
		{
			list.add(cities.get(i).getText());
		}
		waitforClick(sort);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort(list);
		
		for(int i =0; i<cities.size();i=i+2)
		{
			list2.add(cities.get(i).getText());
		}
		Assert.assertEquals(list, list2);
	}
	
}
