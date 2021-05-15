import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\software\\eclipse-java-2020-12-R-win32-x86_64\\eclipse\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.spicejet.com/");
	     Thread.sleep(2000);
	     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	     driver.findElement(By.xpath("//a[@value='MAA']")).click();
	     Thread.sleep(2000);
	     //driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
	     driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	     driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	     System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	     if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	     {
	    	 System.out.println("It's enabled");
	    	 Assert.assertTrue(true);
	     }
	     else
	     {
	    	 Assert.assertTrue(false);
	     }

	}

}
