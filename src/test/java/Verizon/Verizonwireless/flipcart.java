package Verizon.Verizonwireless;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Verizon.Verizonwireless.def.main;
import io.github.bonigarcia.wdm.WebDriverManager;

public class flipcart {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/mobile-phones-store");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		driver.findElement(By.cssSelector("._34RNph")).click();
		
		WebElement element = driver.findElement(By.xpath("//div[@class='_10UF8M'][2]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click()", element);
		
	}
}
