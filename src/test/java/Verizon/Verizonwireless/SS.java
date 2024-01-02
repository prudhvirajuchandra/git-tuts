package Verizon.Verizonwireless;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SS {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		//implict wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		///explicit wait
		//WebDriverWait wait = new WebDriverWait(driver,10);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); // Set a maximum wait time of 10 seconds

		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("style-scope"))));
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File target = new File("/Users/prudhvirajgopilli/Desktop/Screenshots/image.png");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		
		FileUtils.copyFile(src, target);
		
		System.out.println("ScreenShot Saved Successfully");
		
		
	}

}
