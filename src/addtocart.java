import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\software\\eclipse-java-2020-12-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	     WebDriverWait w = new WebDriverWait(driver,5);
	     driver.manage().window().maximize();
	     String[] items = { "Brocolli" , "Cucumber" , "Tomato" , "Onion"};
	     driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	     //Thread.sleep(5000);
	     addItems(driver ,items );
	     driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	     driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
	     driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	     driver.findElement(By.cssSelector("button.promoBtn")).click();
	     
	     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	     System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	     
	}

	public static void addItems(WebDriver driver, String[] items)
	{
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
	     int j=0;
	     for(int i=0 ; i<=product.size() ; i++)
	     {
	    	 String[] name = product.get(i).getText().split("-");
	    	 String formatname = name[0].trim();
	         List al = Arrays.asList(items); 
	         if(al.contains(formatname))
	    	 {
	        	 j++;
	    		 driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
	    		 //driver.findElements(By.cssSelector("button[type='button']")).get(i).click();
	    		 if(j==items.length)
	    			 break;
	    		 
	    	 }
	     }
	}

}
