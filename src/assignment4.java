import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://the-internet.herokuapp.com/");
	     driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
	     driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	     Set<String> window = driver.getWindowHandles();
	     Iterator<String> it = window.iterator();
	     String ParentID = it.next();
	     String ChildID = it.next();
	     driver.switchTo().window(ChildID);
	     System.out.println(driver.findElement(By.cssSelector("h3")).getText());
	     driver.switchTo().window(ParentID);
	     System.out.println(driver.findElement(By.cssSelector("h3")).getText());
	}

}
