import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggesteddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     driver.findElement(By.id("autosuggest")).sendKeys("in");
	     Thread.sleep(3000);
			List<WebElement> Options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	     for(WebElement option:Options)
	     {
	    	 if(option.getText().equalsIgnoreCase("Benin"))
	    	 {
	    		 option.click();
	    		 break;
	    	 }
	     }

	}

}
