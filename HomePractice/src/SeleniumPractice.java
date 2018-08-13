import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPractice {
	static WebDriver driver;
	static Actions actions;
	public static WebDriverWait wait;
	public static WebElement element;
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jatt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// How to open a webpage and inspect the element using linktext, id and name.
//		driver.get("https:\\www.facebook.com");
//		driver.findElement(By.name("email")).click();
//		driver.findElement(By.name("email")).sendKeys("jpsdehal@yahoo.in");
//		driver.findElement(By.id("loginbutton")).click();
//		driver.findElement(By.linkText("Not You?")).click();
//		Thread.sleep(3000);
		
		// How to scroll down the cursor by finding a webelement.
		//driver.get("https://www.toolsqa.com/automation-practice-form/");   //toolsqa website
		
		
//		WebElement scroll = driver.findElement(By.name("lastname"));
//		actions = new Actions(driver);
//		actions.moveToElement(scroll).click();
//		scroll.sendKeys("wonu");

		//driver.manage().window().maximize();
		
//		driver.findElement(By.cssSelector("a[title='Automation Practice Table']")).click();
        
//		driver.findElement(By.id("datepicker")).click();
//		driver.findElement(By.id("datepicker")).sendKeys("07/30/2018");
          
		//Selecting Drop down menu
//		driver.findElement(By.id("continents")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id='continents']/option[3]")).click();
		
		// Explicit Wait:

//	   wait = new WebDriverWait(driver,20);
//	   element =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='leagues']/li[1]/div/div[2]/a")));
//	   element.click();
//	   driver.findElement(By.cssSelector(".uiList.pageFooterLinkList._509-._4ki._703._6-i")).click();
		
		//driver.findElement(By.id("photo")).sendKeys("C:\\Users\\Jatt\\Desktop\\QA\\QA Cycle.jpg");
		
		Thread.sleep(4000);
		//driver.close();
		
		
	}

}
