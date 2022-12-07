package seleniumrevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sleniumDriverExecutionAndInstatiation 
{
		public static void main(String args[]) {
			//System.setProperty("webdriver.chrome.driver","/SeleniumBasics/src/main/resources/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
		}

}
