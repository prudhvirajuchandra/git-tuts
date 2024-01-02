package Verizon.Verizonwireless;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement dp = driver.findElement(By.id("course"));
		
		Select dropdown = new Select(dp);
		dropdown.selectByVisibleText("Python");
		
		List<WebElement> op = driver.findElements(By.id("ide"));
		
		for(WebElement ops:op)
		{
			if(ops.getText().equals("NetBeans"))
			{
				ops.click();
			}
		}
		
	}

}
