package seleniumrevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommand {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/* WebDriver is an Interface. So can’t create an object or reference for it. So, 
		can’t write as,

		WebDriver driver = new WebDriver; //invalid*/

		
		//browser commands
		//Go to the url
		
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		//maximize
		
		driver.manage().window().maximize();
		
		//minimize
		driver.manage().window().minimize();
		
		//again maximize
		driver.manage().window().maximize();
		
		//get current url return type string
		
		String current_Url=driver.getCurrentUrl();
		System.out.println(current_Url);
		//OR
		System.out.println(driver.getCurrentUrl());
		
		//get title of the page return type string
		String title=driver.getTitle();
		System.out.println(title);
		//OR
		System.out.println(driver.getTitle());
		
		//get page source
		
		String page_Source=driver.getPageSource();
		System.out.println(page_Source);
		
		//naviagation commands
		
		//navigate to
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		
		//naviagte Back
		
		driver.navigate().back();
		
		//naviagte forword
		
		driver.navigate().forward();
		
		//refresh
		
		driver.navigate().refresh();
		
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
	}

}
