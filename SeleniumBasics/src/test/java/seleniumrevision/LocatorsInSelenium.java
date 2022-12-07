package seleniumrevision;

import java.time.Duration;

import org.apache.xmlbeans.GDurationSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get url
		
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
		
		//applying implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locating an element
		
		WebElement input_Form=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		input_Form.click();
		
		WebElement text_Box=driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		text_Box.sendKeys("Hai Navami");
		
		
		WebElement show_Message=driver.findElement(By.xpath("//div[@id='message-one']"));
		show_Message.click();
		
		WebElement your_Message=driver.findElement(By.xpath("//div[@id='message-one']"));
		Boolean yourMessageDispalyed=your_Message.isDisplayed();
		System.out.println(yourMessageDispalyed);
		
		
		
	}

}
