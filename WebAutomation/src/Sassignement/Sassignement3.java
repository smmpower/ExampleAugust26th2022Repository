package Sassignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sassignement3 {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutwindow();
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginUser1();
		logoutUser1();
	    loginUser2();
		logoutUser2();
		loginUser3();
		logoutUser3();
		loginUser1A();
		modifyuserUser1() ;
		logoutUser1A();
		loginUser2B();
		modifyuserUser2();
		logoutUser2B();
	    loginUser3C();
		 modifyuserUser3();
		 logoutUser3C();
		
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
	}{
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

	private static void createUser1()
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
	private static void createUser2()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("demo");
			driver.findElement(By.name("middleName")).sendKeys("B");
			driver.findElement(By.name("lastName")).sendKeys("User2");
			driver.findElement(By.name("email")).sendKeys("demo@gmail.com");
			driver.findElement(By.name("username")).sendKeys("demoUser2");
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


	private static void createUser3()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("demo");
			driver.findElement(By.name("middleName")).sendKeys("C");
			driver.findElement(By.name("lastName")).sendKeys("User3");
			driver.findElement(By.name("email")).sendKeys("demo@gmail.com");
			driver.findElement(By.name("username")).sendKeys("demoUser3");
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

	private static void loginUser1()
	{
		try
		{    
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='User1, demo A.']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"closeUserDataLightBoxBtn\"]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void logoutUser1()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser2()
	{
		try
		{   


			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='User2, demo B.']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"closeUserDataLightBoxBtn\"]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{                                 
			e.printStackTrace();
		}
	}


	private static void logoutUser2()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser3()
	{
		try
		{   


			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='User3, demo C.']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"closeUserDataLightBoxBtn\"]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{                                 
			e.printStackTrace();
		}
	}


	private static void logoutUser3()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void loginUser1A()
	{
		try
		{    
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='User1, demo A.']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"closeUserDataLightBoxBtn\"]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuserUser1()                                                     
	{
		try
		{
			driver.findElement(By.xpath("//span[text()='User1, demo A.']")).click();
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

	private static void logoutUser1A()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginUser2B()
	{
		try
		{    
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='User1, demo A.']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"closeUserDataLightBoxBtn\"]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuserUser2()                                                     
	{
		try
		{
			driver.findElement(By.xpath("//span[text()='User2, demo B.']")).click();
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

	private static void logoutUser2B()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginUser3C()
	{
		try
		{    
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='User3, demo C.']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"closeUserDataLightBoxBtn\"]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuserUser3()                                                     
	{
		try
		{
			driver.findElement(By.xpath("//span[text()='User3, demo C.']")).click();
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

	private static void logoutUser3C()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}		



