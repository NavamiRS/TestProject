package assignment1obsquraapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excecise5_SearchValidation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement table_Sort_Search=driver.findElement(By.xpath("//a[text()='Table Sort And Search']"));
		table_Sort_Search.click();
		WebElement search_Box=driver.findElement(By.xpath("//input[@type='search']"));
		search_Box.sendKeys("Dai Rios");
		WebElement verify_SearchBox=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[1]"));
		boolean searchBox_Status=verify_SearchBox.isDisplayed();
		System.out.println( searchBox_Status);
	}

}
