package datadrivernframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exceldatadriven {
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
	public Object[][] indata(){
		Libraryexcel data = new Libraryexcel("C:\\Users\\Jatt\\Desktop\\SampleTest.xlsx");
		int rows = data.sheet.getLastRowNum();
		Object[][] value = new Object[rows][2];
		for(int i =0;i<rows;i++)
		{
			value[i][0]=data.getdata(0, i, 0);
			value[i][1]=data.getdata(0,i,0);
			
		}
		
		
		return value;
		
	}


}
