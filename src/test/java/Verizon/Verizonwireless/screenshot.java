package Verizon.Verizonwireless;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		
	   //File src =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//File target = new File("/Users/prudhvirajgopilli/desktop/Screenshots/img.jpg");
		
		//FileUtils.copyFile(src, target);
		//System.out.println("Screen shot saved successfully");
		
		Actions a = new Actions(driver);
	}

}
