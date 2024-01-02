package Verizon.Verizonwireless;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2ETest {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Productname = "APPLE iPhone 14 (Blue, 128 GB)";

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=fefbecd8-5080-42c5-8a53-431b892ff29d");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		driver.findElement(By.cssSelector("._34RNph")).click();
		driver.findElement(By.xpath("//div[@class='_10UF8M'][2]")).click();
		
		List<WebElement> prices = driver.findElements(By.className("_30jeq3"));
		
		
		List<WebElement> prod = driver.findElements(By.className("_1fQZEK"));
		Thread.sleep(3000);
		
		WebElement item = prod.stream().filter(products->products.findElement(By.cssSelector("._4rR01T")).getText().equals(Productname)).findFirst().orElse(null);
		item.click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		//System.out.println(driver.findElement(By.className("B_NuCI")).getText());
		driver.findElement(By.className("_3iRXzi")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("_2IX_2-")).sendKeys("8885765860");
		driver.findElement(By.className("_2KpZ6l")).click();
		
	
		
		
		
		
	}

} 
