package assignment1obsquraapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excecise6_getTagCssAttribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		System.out.println("Tag Name "+home.getTagName());
		System.out.println("Attribute vale"+home.getAttribute("href"));
		System.out.println("CSS Value "+home.getCssValue("font-size"));
	}

}
