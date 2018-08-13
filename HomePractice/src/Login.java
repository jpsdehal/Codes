import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login extends Baseclassfb {
	@Test
	public void login() throws InterruptedException{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("abc");
		Thread.sleep(3000);
		Reporter.log("Login Test Passed ===========", true );
	}

}
