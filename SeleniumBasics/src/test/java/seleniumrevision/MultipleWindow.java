package seleniumrevision;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement openNewWindow=driver.findElement(By.id("newWindowBtn"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",openNewWindow );
		//js.executeScript("arguments[0],click();",openNewWindow);
		openNewWindow.click();
		Thread.sleep(2000);
		
		
		Set<String> allChildWindow=driver.getWindowHandles();
		System.out.println(allChildWindow);
		
		Iterator<String> iterator=allChildWindow.iterator();
		while (iterator.hasNext()) {
			String childWindow=iterator.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.manage().window().maximize();
				
				System.out.println(driver.getTitle());
				
			}
			
			
		}
		driver.switchTo().window(parentWindow);
	
		System.out.println(	driver.getTitle());
		
		
				
	}

}
