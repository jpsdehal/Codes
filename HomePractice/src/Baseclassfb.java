import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclassfb {
	WebDriver driver;
	@BeforeMethod
	public void browser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jatt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
	

}
