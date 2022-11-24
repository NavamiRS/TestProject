import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class Scroling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize(); 	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait syntax
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);//old version syntax
		JavascriptExecutor js = (JavascriptExecutor) driver;//java scriptor
		js.executeScript("window.scrollBy(0,1000)");//scroll down
		Thread.sleep(5000);//execution stop for 5 second then run next line of code
		js.executeScript("window.scrollBy(0,-1000)");//scroll up
		WebElement all_CoursesInclude=driver.findElement(By.xpath("//h2[contains(text(),' Courses include')]"));
		;//execute scripter use cheyyunne click num scrolling num anu
		System.out.println(all_CoursesInclude.getText());
		
		WebElement insurace_Project=driver.findElement(By.xpath("//a[text()='Insurance Project']"));
		
		js.executeScript("arguments[0].click();",insurace_Project);//execute scripter use cheyyunne click num scrolling num anu
	

		

	}

}
