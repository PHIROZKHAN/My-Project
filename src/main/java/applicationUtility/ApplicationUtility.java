package applicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility
   {
	
	public void doubleclick(WebElement ele);
	public void rightclick(WebElement ele);
	public void clickme(WebElement ele);
	public void windowHandle(int tab_no);
	public void uploadFile(String filepath);
	public void waitForAlerts(int time);
	public String getDate_time();
	public void selectbyvisibleText(WebElement ele, String text);
	public void selectbyindex(WebElement ele, int index);
	public void selectbyvalue(WebElement ele, String value);
	public void movetoElement(WebElement ele); 
	public void dragAndDrop(WebElement ele, int x,int y);
	public void getResponseCodeForRequest(String url);
	
   }
