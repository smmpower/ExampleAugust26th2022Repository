package chromedemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actichromedemo {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApplication();
		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","F:\\ECLIPSETOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	private static void navigate()
	{
		try 
		{
			driver.get("http://localhost/user/submit_tt.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	private static void closeApplication() 
	{
		try
		{
			driver.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}

