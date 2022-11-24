package assignment1obsquraapp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPresentExpectedCondition {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		

		WebElement customerId=driver.findElement(By.name("cusid"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		customerId=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("cusid")));
		customerId.sendKeys("1357");
		
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Alert alert =wait.until(ExpectedConditions.alertIsPresent());
		String text=alert.getText();
		System.out.println(text);
		alert.dismiss();
		
		
	
		

	}

}
