package chromedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edge {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		//navigate();
		//closeApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.edge.driver","");
			driver=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
