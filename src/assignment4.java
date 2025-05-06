import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment4 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
		 //WebDriver driver=new InternetExplorerDriver();  
		driver.manage().window().maximize();
		driver.get("https://www.coinpayu.com/login");
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type=\"email\"]")));
		driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("wreview001@gmail.com");
		driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("Coin@045");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() = \"Main Balance\"]")));		
		driver.get("https://www.coinpayu.com/dashboard/ads_active");
		Thread.sleep(5000);
		for (;;)
		{
			driver.findElement(By.xpath("//*[@class=\"clearfix ags-list-box\"]/div/div/div/span")).click();
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    Thread.sleep(20000);
		    driver.close();
		    driver.switchTo().window(tabs.get(0));
		}
		
	}

}
