package assignment1obsquraapp;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class RegistrationFormMultipleWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement openNewBtn=driver.findElement(By.id("newWindowBtn"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollInToView();",openNewBtn );
		openNewBtn.click();
		
		
		Set<String>allChildWindows=driver.getWindowHandles();
		System.out.println(allChildWindows);
		
		Iterator<String>iterator=allChildWindows.iterator();
		
		while (iterator.hasNext()) {
			String childWindow=iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.manage().window().maximize();
				
				WebElement first_Name=driver.findElement(By.xpath("//input[@id='firstName']"));
				first_Name.sendKeys("Rishith");
				
				WebElement last_Name=driver.findElement(By.id("//input[@id='lastName']"));
				last_Name.sendKeys("Rudra");
				
				WebElement gender=driver.findElement(By.xpath("//input[@id='malerb']"));
				gender.click();
				
				WebElement languages_Known=driver.findElement(By.xpath("//input[@id='englishchbx']"));
				gender.click();
				
				WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
				gender.sendKeys("navami@gmail.com");
				
				WebElement passwordTextBox=driver.findElement(By.xpath("//input[@id='password']"));
				passwordTextBox.sendKeys("qwerty");
				
				WebElement registerButton=driver.findElement(By.id("registerbtn"));
				registerButton.click();
				
				WebElement messageTextBox=driver.findElement(By.xpath("//label[@id='msg']"));
				System.out.println(messageTextBox.isDisplayed()); 
				
				
				
			}
			

			
			
			
			
		}
		
		
		

	}

}
