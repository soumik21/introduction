import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://the-internet.herokuapp.com/nested_frames");
	     int countIframesInPage =driver. findElements(By. tagName("frameset")). size();
	     driver.switchTo().frame("frame-top");
	     driver.switchTo().frame("frame-middle");
	     System.out.println(driver.findElement(By.id("content")).getText());
	}

}
