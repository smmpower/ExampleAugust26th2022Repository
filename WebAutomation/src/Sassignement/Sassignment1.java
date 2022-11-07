package Sassignement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sassignment1 {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutwindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ECLIPSETOOL\\ExampleAutomation\\Automation\\WebAutomation\\library\\driver\\chromedriver.exe");
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
			driver.get("http://localhost/login.doin.do");
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
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();       
		}
	}
	
	private static void minimizeFlyOutwindow()
	{
		try
		{
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("demo");
			driver.findElement(By.name("middleName")).sendKeys("A");
			driver.findElement(By.name("lastName")).sendKeys("User1");
			driver.findElement(By.name("email")).sendKeys("demo@gmail.com");
			driver.findElement(By.name("username")).sendKeys("demoUser1");
			driver.findElement(By.name("password")).sendKeys("Welcome123");
			driver.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			driver.findElement(By.xpath("//span[text()='User1, demo A.']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=driver.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
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