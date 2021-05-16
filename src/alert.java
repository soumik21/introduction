import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text = "Soumik";
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     driver.findElement(By.id("name")).sendKeys(text);
	     driver.findElement(By.cssSelector("#alertbtn")).click();
	     System.out.println(driver.switchTo().alert().getText());
	     Thread.sleep(2000);
	     driver.switchTo().alert().accept();
	     driver.findElement(By.id("name")).sendKeys(text);
	     driver.findElement(By.cssSelector("#confirmbtn")).click();
	     Thread.sleep(2000);
	     driver.switchTo().alert().dismiss();

	}

}
