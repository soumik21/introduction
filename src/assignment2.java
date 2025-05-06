import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 //System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
		 //WebDriver driver=new InternetExplorerDriver();  
		driver.manage().window().maximize();
		driver.get("https://getlike.io/login/");
		Thread.sleep(5000);
		driver.findElement(By.id("User_loginLogin")).sendKeys("wreview001@gmail.com");
		driver.findElement(By.id("User_passwordLogin")).sendKeys("Get@045");
		WebDriverWait wait = new WebDriverWait(driver, 300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() = \"My tasks\"]")));
		//driver.findElement(By.name("submitLogin")).click();
		driver.get("https://getlike.io/en/tasks/telegram/watch/");
		Thread.sleep(5000);
		for (;;)
		{
		driver.findElement(By.xpath("//*[@class=\"media-right media-middle task-btn\"]/a")).click();
		Thread.sleep(10000);
		driver.navigate().refresh();
		}
		
	}

}
