package Verizon.Verizonwireless;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRM {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//ul/li[5]")).click();
		driver.findElement(By.className("oxd-select-text-input")).click();
		Thread.sleep(3000);
		List<WebElement> dp1 = driver.findElements(By.className("oxd-select-dropdown"));
		
		for (int i=0;i<dp1.size();i++)
		{
			if(dp1.get(i).getText().contains("QA Engineer"));
			dp1.get(i).click();
			break;
		}
		
		
		

	}

}
