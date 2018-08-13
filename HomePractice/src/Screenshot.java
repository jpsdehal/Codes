import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	
	public static void capturescreenshot (WebDriver driver, String screenshotname){
	    
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("C:\\Users\\Jatt\\Documents\\Eclipse\\HomePractice\\Screenshot\\"+screenshotname+".png") );
			System.out.println("Screenshot Captured");
		} catch (IOException e) {
		
			System.out.println("Screenshot Capture Failed");
		}
		
		}

}
