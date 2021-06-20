import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.get("http://yahoo.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.close();
//		driver.get("https://www.rediff.com/");
//		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		// driver.get("https://www.facebook.com/");
		// driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("anc@abc.com");
		// driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("abc");
//driver.get("http://talkerscode.com/webtricks/demo/demo_multiple-tabs-in-single-page-using-javascript-and-css.php");
//driver.findElement(By.xpath("//*[@id='main_content']/following-sibling::li[2]")).click();
//driver.findElement(By.xpath("//li[@id='page1']/parent::div")).click();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.username")).sendKeys("abc");
//driver.findElement(By.cssSelector("#Login")).click();
	}

}
