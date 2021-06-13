import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int row = driver.findElements(By.cssSelector(".table-display tr")).size();
		System.out.println(row);
		int coloumn = driver.findElements(By.cssSelector(".table-display th")).size();
		System.out.println(coloumn);
		String content = driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText();
		System.out.println(content);
	}

}
