

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement customerId=driver.findElement(By.name("cusid"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("cusid"))); //ingine ezhutham
		customerId=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("cusid")));// ingeneyum ezhutham
		customerId.sendKeys("1357");
		
		
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='submit']")));
		submit=wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
		submit.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
	
	
	}

}
