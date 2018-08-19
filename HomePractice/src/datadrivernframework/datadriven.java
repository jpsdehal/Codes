package datadrivernframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadriven {
	WebDriver driver;
	@Test(dataProvider = "LoginData")
	public void login(String userid, String pwd){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jatt\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys(userid);
		driver.findElement(By.id("user_pass")).sendKeys(pwd);
		driver.findElement(By.id("wp-submit")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "Invalid user id and password");
		System.out.println("The user is able to login to the account with valid credentials");
	}
	@AfterMethod
	public void shutdown()
	{
		driver.quit();
	}
	
	@DataProvider(name = "LoginData")
	public Object [][] indata(){
		Object[][] data = new Object[3][2];
		data[0][0] = "admin1";
		data[0][1] = "demo";
		data[1][0] = "admin";
		data[1][1] = "demo123";
		data[2][0] = "admin2";
		data[2][1] = "dem";
		return data;
		
	}

}
