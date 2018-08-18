
package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Account_login {
	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.id("user_pass");
	By login_button = By.id("wp-submit");
	
	public Account_login(WebDriver driver)
	{
		this.driver = driver;
	}
	public void login(String userid, String pwd)
	{
		driver.findElement(By.id("user_login")).sendKeys(userid);
		driver.findElement(By.id("user_pass")).sendKeys(pwd);
		driver.findElement(By.id("wp-submit")).click();
		
	}

}
