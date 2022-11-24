package assignment1obsquraapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitVisibilityOfElementLocated {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().refresh();//refresh the page
		WebElement datePicker=driver.findElement(By.xpath("//a[contains(text(),'Date Pickers')]"));

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		datePicker=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Date Pickers')]")));//visibilityOfElementLocated
		datePicker.click();
		
	}

}
