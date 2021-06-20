import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("uni");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='ui-id-1'] /li[6]/div")).click();
	}

}
