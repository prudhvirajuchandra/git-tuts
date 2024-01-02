package Verizon.Verizonwireless;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verizon {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String ProductName = "Apple iPhone 15";
		WebDriver driver = new FirefoxDriver();
		WebDriverManager.firefoxdriver().setup();
		
		driver.get("https://www.verizon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Shop Menu List']")).click();
		driver.findElement(By.id("gnav20-Shop-L2-3")).click();
		driver.findElement(By.id("gnav20-Shop-L3-1")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Apple_3")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("gridwallProductName"))));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");
		List<WebElement> products = driver.findElements(By.className("mb-auto"));
		
		WebElement item = products.stream().filter(prod->prod.findElement(By.id("tileProductText")).getText().equals(ProductName)).findFirst().orElse(null);
		Thread.sleep(5000);
		item.findElement(By.id("tileProductText")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div/label[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='storageClick'][2]")).click();
		driver.findElement(By.xpath("//div[@id='new']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-testid='pricingClick'][1]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Next steps']")));
		driver.findElement(By.xpath("//button[@aria-label='Next steps']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='zipConfirm']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("select_for_tile1")).click();
		Thread.sleep(5000);
		//js.executeScript("window.scroll(0,500)");
		//driver.findElement(By.cssSelector(".ivFgBn")).click();
		//driver.findElement(By.xpath("//input[@value='SJRQ2LL/BUS']")).click();
		//driver.findElement(By.xpath("//input[@aria-label='AppleCare+']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Continue']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@aria-label='Continue']")).click();
		
		
		
		
		
	}

}
