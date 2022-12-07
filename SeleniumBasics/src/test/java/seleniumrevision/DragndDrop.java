package seleniumrevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize(); 	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destination=driver.findElement(By.xpath("(//*[@class='placeholder'])[4]"));
		
		action.dragAndDrop(source, destination).build().perform();

	}

}
