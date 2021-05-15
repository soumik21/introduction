import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class selectdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\software\\eclipse-java-2020-12-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     
     //Static dropdown choose
     WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
     Select dropdown = new Select(staticDropdown);
     dropdown.selectByIndex(3);
     System.out.println(dropdown.getOptions());
     System.out.println(dropdown.getFirstSelectedOption().getText());
     dropdown.selectByVisibleText("AED");
     System.out.println(dropdown.getFirstSelectedOption().getText());
     dropdown.selectByValue("INR");
     
     
     System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
     driver.findElement(By.id("divpaxinfo")).click();
     Thread.sleep(2000);
//     int i=1;
//    		 while(i<5) {
//     driver.findElement(By.id("hrefIncAdt")).click();
//     i++;
//    		 }
     for(int i=1 ; i < 4 ; i++)
     {
    	 driver.findElement(By.id("hrefIncAdt")).click();
     }
     driver.findElement(By.id("btnclosepaxoption")).click();
     Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
     System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
