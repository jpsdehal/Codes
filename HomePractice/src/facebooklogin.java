import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jatt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Login");
		driver.findElement(By.xpath("//*[@id='email']")).click();
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abab");
		
		Screenshot.capturescreenshot(driver, "Login1");
		
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		driver.navigate().refresh();
		driver.close();
		
		
		
		

	}

}
