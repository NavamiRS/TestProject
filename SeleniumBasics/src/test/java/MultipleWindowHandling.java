import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize(); 	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement openNewWindowBtn=driver.findElement(By.id("newWindowBtn"));
		openNewWindowBtn.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		WebElement openNewTabBtn=driver.findElement(By.id("newTabBtn"));
		js.executeScript("argument[0].scrollIntoView();", openNewTabBtn);
		openNewTabBtn.click();
		
		Set<String>allChildWindows=driver.getWindowHandles();
		System.out.println(allChildWindows);
		
		Iterator<String>iterator=allChildWindows.iterator();
		
		while (iterator.hasNext()) {
			String childWindow=iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				
				driver.manage().window().maximize();
				System.out.println(driver.getCurrentUrl());
				
			}
			String childWindow1=iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow1)) {
				driver.switchTo().window(childWindow1);
				
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				
			}
			
		}
		 driver.switchTo().window(parentWindow);
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 driver.quit();
	}

}
