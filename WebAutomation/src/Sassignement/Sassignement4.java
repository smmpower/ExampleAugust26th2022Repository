package Sassignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sassignement4 {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		addCustomer();
		deleteCustomer();
		logout();
		closeApplication();

	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver" ,
					"F:\\ECLIPSETOOL\\ExampleAutomation\\Automation\\WebAutomation\\library\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{ 
		try
		{
			driver.get("http://localhost/login.do");
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void login()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{                                                    
			e.printStackTrace();
		}
	}
	private static void addCustomer()
	{                                                  
		try
		{
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[text()='Add New'] ")).click();
			driver.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Akash");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteCustomer()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			driver.quit(); 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}