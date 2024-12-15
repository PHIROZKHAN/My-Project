package baselibrary;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.apache.poi.poifs.property.Property;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import applicationUtility.ApplicationUtility;
import excelUtility.ExcelUtility;
import propertyUtility.PropertyUtility;
import screenshotutility.ScreenShotUtility;
import waitUtility.WaitUtility;

public  class BaseLibrary implements ExcelUtility, PropertyUtility, ApplicationUtility, WaitUtility, ScreenShotUtility
    {
	
	public static WebDriver driver=null;
	//
	public void launchUrl(String browser)
	{
		if(browser.equals("chrome"))
		{
			//<---------------chrome driver folder path-------------------------------->
			String path="C:\\Users\\PHIROZ KHAN\\TestingBaba_automation17th_june\\webdriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver" ,path);
			//initialize the driver
			 driver= new ChromeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			//<---------------gecko driver folder path-------------------------------->
			String path="C:\\Users\\PHIROZ KHAN\\TestingBaba_automation17th_june\\webdriver\\geckodriver.exe";
			
			System.setProperty("webdriver.gecko.driver" ,path);
			//initialize the driver
			 driver= new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			//<---------------edge driver folder path-------------------------------->
			String path="C:\\Users\\PHIROZ KHAN\\TestingBaba_automation17th_june\\webdriver\\msedgedriver.exe";
		
			System.setProperty("webdriver.edge.driver" ,path);
			//initialize the driver
			 driver= new EdgeDriver();
		}
		
		//launching the URL
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();	
        
		
	}
	public void launchUrl(String browser, String url)//passing dynamic url with dyn browser
	{
		if(browser.equals("chrome"))
		{
			//<---------------chrome driver folder path-------------------------------->
			String path="C:\\Users\\PHIROZ KHAN\\TestingBaba_automation17th_june\\webdriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver" ,path);
			//initialize the driver
			 driver= new ChromeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			//<---------------gecko driver folder path-------------------------------->
			String path="C:\\Users\\PHIROZ KHAN\\TestingBaba_automation17th_june\\webdriver\\geckodriver.exe";
			
			System.setProperty("webdriver.gecko.driver" ,path);
			//initialize the driver
			 driver= new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			//<---------------edge driver folder path-------------------------------->
			String path="C:\\Users\\PHIROZ KHAN\\TestingBaba_automation17th_june\\webdriver\\msedgedriver.exe";
		
			System.setProperty("webdriver.edge.driver" ,path);
			//initialize the driver
			 driver= new EdgeDriver();
		}
		
		//launching the URL
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait
		driver.get(url);
		driver.manage().window().maximize();	
        
		
	}
	//<-----------------------Data Reading from Excel--------------------------------->
	@Override
	public String getReadData(int shtno,int rownum ,int colnum) 
	{    
		 String path="C:\\Users\\PHIROZ KHAN\\TestingBaba_automation17th_june\\testdata\\Untitled spreadsheet.xlsx";
		 String value="";
		 try
		 {
			 FileInputStream fis= new FileInputStream(path);
			 XSSFWorkbook wb= new XSSFWorkbook(fis);
			 XSSFSheet sheet=wb.getSheetAt(shtno);
			 value= sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		 }
		 catch(Exception e)
		 {
		 	System.out.println("issue getread data"+e); 
		 }
		return value;
	} 
//<-----------------------------Data Reading From Properties File------------------------->
	@Override
	public String getReadData(String key) {
		String value = "";
	    String path = "C:\\Users\\PHIROZ KHAN\\TestingBaba_automation17th_june\\testdata\\config.properties";
	    
		try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (Exception e) {
			System.out.println("Issue in getReadData : " + e);
		}
		return value;
	}
  // <--------------------ApplicationUtility codes----------------------------->
	@Override
	public void doubleclick(WebElement ele)
	{
		Actions act= new Actions(driver );
		 act.doubleClick(ele).perform();
	}
	
    @Override
	public void rightclick(WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}

	@Override
	public void clickme(WebElement ele)
	{
		Actions act = new Actions (driver);
		act.click(ele).perform();
	}

	@Override
	public void windowHandle(int tab_no) {
		Set<String> handles=driver.getWindowHandles();
		ArrayList<String> handle= new ArrayList<String>(handles);
		driver.switchTo().window(handle.get(tab_no));
		
		
		}
//<-------------------Wait Utility Code--------------------------->
	@Override
	public void waitforClick(WebElement ele) {

	WebDriverWait wait= new WebDriverWait(driver,15);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	ele.click();
		
	}
	@Override
	public void waitforDisplay(WebElement ele, String val) {
		
		WebDriverWait wait= new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(val);
		
	}
	//<-----------------------File Uploading------------------------->
	@Override
	public void uploadFile(String filepath)
	{
		StringSelection ss= new StringSelection(filepath); // taking filepath into ss
		 Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard(); // clipboard into cb 
		 cb.setContents(ss, null);// set or copy into clipboard
		 
		 
//		press  Ctrl +V and ENTER (virtual   key )		 
		 try {
			Robot rb= new Robot();
			rb.delay(400);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.delay(400);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			
			System.out.println("issue in upload file ....");
			e.printStackTrace();
		}
	}
//<---------------------Wait for Alert----------------------------->
	@Override
	public void waitForAlerts(int time) {
		WebDriverWait wdw=  new WebDriverWait(driver, time);
		wdw.until(ExpectedConditions.alertIsPresent());
		
	}
	
//<--------------------screenshot------------------------------->	
	@Override
	public void getScreenShot(String foldername, String filename) {
		try {
			//open project path
				String loc = System.getProperty("user.dir");
				//creating location folder
				String finalpath=loc+"//screenshots//"+foldername+"//"+filename+".png";
				//
				EventFiringWebDriver efw= new EventFiringWebDriver(driver);
				//capturing screen shot and file type
				 File file=   efw.getScreenshotAs(OutputType.FILE);
				  
				 FileUtils.copyFile(file, new File(finalpath));// FileUtils.copyFile(src , dest);
		} catch (Exception e) {
			System.out.println("issue in get screenshot......");
			e.printStackTrace();
		} 
			    
	}	    
			
@AfterMethod
public void resultAnalysis(ITestResult result) {
	try {
		String  methodname=result.getMethod().getMethodName();
		String timedate=getDate_time();
		String finalname= methodname+timedate;
		if(	result.getStatus()==ITestResult.SUCCESS) {
			getScreenShot("pass", finalname);
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			getScreenShot("fail",finalname);
		}
		else
		{
			getScreenShot("skip",finalname);
		}
	} catch (Exception e) {
		System.out.println("issue in result analysis.....");
		e.printStackTrace();
	}
}
	@Override
public String getDate_time() {
	String val="";
	
	
	try {
		
		Date date=new Date();
		SimpleDateFormat sf= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		val=sf.format(date);
	} catch (Exception e) {
		System.out.println("issue in getdate time");
		e.printStackTrace();
	}
	return val;
	
//<-------------------------SELECT MENUE------------------------->
}
	@Override
	public void selectbyvisibleText(WebElement ele, String text) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	@Override
	public void selectbyindex(WebElement ele, int index) {
		Select sel = new Select(ele);
		sel.selectByIndex(index);
		
	}
	@Override
	public void selectbyvalue(WebElement ele, String value) {
		Select sel = new Select(ele);
		sel.selectByValue(value);
		
	}
	
	//<---------------Actions Class------------>
	@Override
	public void movetoElement(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}
	@Override
	public void dragAndDrop(WebElement ele, int x, int y) {
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele, x, y).perform();
		
		//act.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();

	}	
}
	
	/*@AfterTest
	public void flush()
	{
		try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		System.out.println("issue in flush wait.............");
		e.printStackTrace();
	}
		driver.close();
	}*/
	


