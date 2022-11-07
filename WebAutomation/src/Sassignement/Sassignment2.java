package Sassignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sassignment2 {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		creatuser();
		modifyuser();
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
	private static void minimize()
	 {
		 try
		 {
		 driver.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
		
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	private static void creatuser()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			driver.findElement(By.xpath("//div[text()='Add User'] ")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("vishwa");
			driver.findElement(By.name("middleName")).sendKeys("R");
			driver.findElement(By.name("lastName")).sendKeys("Korimath");
			driver.findElement(By.name("email")).sendKeys("korimathvr@gmail.com");
			driver.findElement(By.name("username")).sendKeys("demoUserY");
			driver.findElement(By.name("password")).sendKeys("1234");
			driver.findElement(By.name("passwordCopy")).sendKeys("1234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser()                                                     
	{
		try
		{
			driver.findElement(By.xpath("//span[text()='Korimath, vishwa R.']")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("4567");
			Thread.sleep(3000);
			driver.findElement(By.name("passwordCopy")).sendKeys("4567");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
			
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
