package Verizon.Verizonwireless;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exp {
	
	
	private static boolean isSortedAscending(List<Integer> amount)
	{
		for(int i=0;i<amount.size()-1;i++)
		{
			if(amount.get(i)<amount.get(i+1) || amount.get(i)==amount.get(i+1))
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		String desiredProductName = "ringme 1709";
		WebElement foundProduct = null;
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=fefbecd8-5080-42c5-8a53-431b892ff29d");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		driver.findElement(By.cssSelector("._34RNph")).click();
		driver.findElement(By.xpath("//div[@class='_10UF8M'][2]")).click();
		
		List<WebElement> prices = driver.findElements(By.className("_30jeq3"));
		
		
		List<WebElement> prod = driver.findElements(By.className("_1fQZEK"));
//		
//		for(WebElement product :prod)
//		{
//			WebElement item = product.findElement(By.cssSelector("._4rR01T"));
//			String productName = item.getText();
//			
//			if(productName.equals(desiredProductName))
//			{
//			 foundProduct=product;
//			 break;
//			}
//		}
//		
//		if(foundProduct!=null)
//		{
//			foundProduct.click();
//		}
		
		//sored order for price list
		
		List<WebElement> amountelements = driver.findElements(By.cssSelector("._30jeq3"));
		
		List<Integer> amount = new ArrayList<>();
		for(WebElement amountelement:amountelements)
		{
			String pricetext = amountelement.getText().replaceAll("[^\\d]" ,"");
			if (!pricetext.isEmpty()) { // Check if the resulting text is not empty
		        int parsedPrice = Integer.parseInt(pricetext); // Parse the text to an Integer
		        amount.add(parsedPrice);
			}
		}
		
		boolean isSorted = isSortedAscending(amount);
		if (isSorted) {
            System.out.println("Prices are sorted in ascending order");
        } else {
            System.out.println("Prices are NOT sorted in ascending order");
        }
        driver.quit();
		
	}

}
