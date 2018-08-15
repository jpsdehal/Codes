import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandles {

	@Test
	public static void handles(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jatt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		String current = driver.getWindowHandle();
		System.out.println("Naukri is opened along with the popups");
		Set<String> open_links = driver.getWindowHandles();
		int totallinks = open_links.size();
		System.out.println("Total opened links along with popups are :"+ totallinks);
		
		for (String child : open_links)
		{
			if(!current.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.close();
				System.out.println("Closing the popups");
				
			}
			driver.switchTo().window(current);
			
		}
		driver.close();
	}
}
