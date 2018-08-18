package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Loginwordpress {
	@Test
	public void wordpress_login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jatt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		Account_login obj = new Account_login(driver);
		obj.login("admin", "demo123");
		driver.close();
		
	}

}
