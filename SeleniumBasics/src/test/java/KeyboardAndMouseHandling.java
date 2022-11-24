import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAndMouseHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize(); 	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions=new Actions(driver);// actions declaration/Instantiate a new Actions object.
		
		WebElement message_TextBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		actions.keyDown(Keys.SHIFT).build().perform();
		message_TextBox.sendKeys("h");
		actions.keyUp(Keys.SHIFT).build().perform();
		message_TextBox.sendKeys("ai");
		
		actions.keyDown(Keys.TAB).build().perform();
		
		actions.keyUp(Keys.TAB).build().perform();
		
		WebElement showbtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		actions.sendKeys(showbtn,Keys.ENTER).build().perform();
		
		
		WebElement messgae=driver.findElement(By.xpath("//*[starts-with(text(),'Your Message : ')]"));
		//actions.moveToElement(messgae).build().perform();
		actions.contextClick(messgae).build().perform();
		Thread.sleep(5000);
		driver.quit();
		
			}
		
		
		
		

	}


