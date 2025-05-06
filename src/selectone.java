import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Select book = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		//book.selectByValue("search-alias=stripbooks");
		
		File file = new File("text.xls");
		FileInputStream inputstream = new FileInputStream(file);
		HSSFWorkbook wb = new HSSFWorkbook(inputstream);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		HSSFRow row2 = sheet.getRow(1);
		HSSFCell cell0 = row2.getCell(0);
		String dropdown = cell0.getStringCellValue();
		
		
	}

}
