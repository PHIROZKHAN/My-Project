package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Slider_Page extends BaseLibrary{
	public Slider_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement wiget;
	
	@FindBy(xpath = "//*[text()='slider']")
	private WebElement slider;
	
	@FindBy(xpath = "//*[@id='range-slider']")
	private WebElement sliderbar;
	
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
	public void clickOnSlider()
	{
	waitforClick(slider);
	}
	public void clickOnSliderBar()
	{
		dragAndDrop(sliderbar, 50, 0);
	}

}
