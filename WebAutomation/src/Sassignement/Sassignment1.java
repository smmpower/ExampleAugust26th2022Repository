package Sassignement;

import org.openqa.selenium.By;

//import org.openqa.selenium.Alert;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sassignment1 {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		//minimizeFlyOutwindow();
//		createUser();
	//	deleteUser();
	//	logout();
	//	closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\GitRepository\\Currentworkspace\\ExampleAugust26th2022Repository\\WebAutomation\\library\\driver\\chromedriver.exe");
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
	