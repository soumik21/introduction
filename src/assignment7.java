import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 WebDriverWait w = new WebDriverWait(driver,5);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String option = driver.findElement(By.cssSelector("label[for=benz]")).getText();
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
	     Select dropdown = new Select(staticDropdown);
	     dropdown.selectByVisibleText(option);
	     driver.findElement(By.id("name")).sendKeys(option);
	     driver.findElement(By.id("alertbtn")).click();
	     String alert = driver.switchTo().alert().getText();
	     if(alert.contains(option))
	     {
	    	 System.out.println("Yes");
	     }
	     else
	     {
	    	 System.out.println("No");
	     }
	}

}
