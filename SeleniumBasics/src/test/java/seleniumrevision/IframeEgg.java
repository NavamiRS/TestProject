package seleniumrevision;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class IframeEgg {
	public WebDriver driver;
  @Test(priority = 1)
  public void verifyThatJmeterYouTubeLinkIsClikable() {
	  WebElement iframeVedio=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RbSlW8jZFe8']"));
	  driver.switchTo().frame(iframeVedio);
	  
	  WebElement clickAutomationTestingTutorialVedio=driver.findElement(By.xpath("//div[@id='player']"));
	 clickAutomationTestingTutorialVedio.click();
	  
  }
  @Test(priority = 2)
  public void verifyThatEmailTextBoxAcceptText() {
	  driver.switchTo().parentFrame();//or driver.switchTo().defaultContent(); switch to parent
		
	WebElement email_TextBox=driver.findElement(By.xpath("//input[@type='text']"));
	email_TextBox.sendKeys("navami.rudran@gmail.com");
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
  }
  

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
