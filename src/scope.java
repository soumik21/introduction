import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 WebDriverWait w = new WebDriverWait(driver,5);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement footercoloumn1 = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footercoloumn1.findElements(By.tagName("a")).size());
		for(int i=1 ; i<footercoloumn1.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footercoloumn1.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000);
		}
			Set<String> abd = driver.getWindowHandles();
			Iterator<String> it = abd.iterator();
		
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		
		
	}

}
