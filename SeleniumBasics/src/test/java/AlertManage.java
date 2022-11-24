import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertManage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize(); 	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement customerId=driver.findElement(By.name("cusid"));
		customerId.sendKeys("12345");
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Thread.sleep(2000);
		/*driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();*/
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

}
