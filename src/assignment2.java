import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\software\\eclipse-java-2020-12-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.cleartrip.com/");
	     WebElement Dropdown1 = driver.findElement(By.id("Adults"));
	     Select dropdown = new Select(Dropdown1);
	     dropdown.selectByIndex(3);
	     WebElement Dropdown2 = driver.findElement(By.id("Childrens"));
	     Select dropdown1 = new Select(Dropdown2);
	     dropdown1.selectByIndex(2);
	     driver.findElement(By.id("DepartDate")).click();
	     driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.cssSelector(".blue.rArrow")).click();
	     driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
	     driver.findElement(By.id("SearchBtn")).click();
			System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

		}

}
