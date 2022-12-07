package seleniumrevision;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement skills=driver.findElement(By.xpath("//select[@id='Skills']"));
		js.executeScript("arguments[0].scrollIntoView();", skills);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofMillis(1000))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		//skills.click();
		js.executeScript("arguments[0].click();",skills);
		
		Thread.sleep(2000);
		Select select=new Select(skills);
		select.selectByValue("Analytics");
		
		
		WebElement dob_Year=driver.findElement(By.id("yearbox"));
		dob_Year.click();
		
		WebElement dob_Year_selected=driver.findElement(By.xpath("//option[@value='1993']"));
		js.executeScript("arguments[0].scrollIntoView();",dob_Year_selected);
		Thread.sleep(500);
		//wait.until(ExpectedConditions.elementToBeSelected(By.id("yearbox")));
		select.selectByVisibleText("1993");
	
		
		
		
		WebElement dob_Month=driver.findElement(By.xpath("(//select[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched'])[3]"));
		//js.executeScript("arguments[0].click();",dob_Month);
		dob_Month.click();
		select.selectByIndex(7);  
		
		
		
	}

}
