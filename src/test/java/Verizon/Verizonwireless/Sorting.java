package Verizon.Verizonwireless;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		WebDriverManager.firefoxdriver().setup();
		driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=fefbecd8-5080-42c5-8a53-431b892ff29d");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		driver.findElement(By.cssSelector("._34RNph")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_10UF8M'][2]")).click();
		List<WebElement> pricebeforesort =driver.findElements(By.className("_30jeq3"));
		
		List<Double> pricebeforefilter =new ArrayList<>();
		for(WebElement p:pricebeforesort)
		{
			pricebeforefilter.add(Double.valueOf(p.getText().replace("₹", "").replace(",", "")));
		}
		
		List<WebElement> priceaftersort =driver.findElements(By.className("_30jeq3"));
		List<Double> priceafterfilter =new ArrayList<>();
		
		for(WebElement c:priceaftersort)
		{
			priceafterfilter.add(Double.valueOf(c.getText().replace("₹", "").replace(",","")));
		}
		
		Collections.sort(pricebeforefilter);
		Assert.assertEquals(pricebeforefilter, priceafterfilter);
		
		
		
		
		}

	

}
