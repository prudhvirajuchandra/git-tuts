package Verizon.Verizonwireless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		
		driver.findElement(By.id("newTabBtn")).click();
		
		
	}

}
