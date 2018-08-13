import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Class2 {
   @Test
	public  void select (){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jatt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("month"));
		Select monthdd = new Select(dropdown);
		WebElement selected_option = monthdd.getFirstSelectedOption();
		System.out.println("selected option is : "+ selected_option.getText());
	    List<WebElement> total = monthdd.getOptions();
		for (WebElement e : total)
		{
			System.out.println(e.getText());
		}
		
		
		monthdd.selectByVisibleText("Dec");
		driver.close();
	
		
	

	}

}
