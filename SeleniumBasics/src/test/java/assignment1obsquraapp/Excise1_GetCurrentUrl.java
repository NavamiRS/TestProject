package assignment1obsquraapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excise1_GetCurrentUrl {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		System.out.println("URL "+driver.getCurrentUrl()); //Getting current url in the console
		System.out.println("Title of the page "+driver.getTitle());//get title of the page


	}

}
