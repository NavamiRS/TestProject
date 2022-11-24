package assignment1obsquraapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excecise2_NavigateToInput {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");//navigate to input form
		WebElement checkbox_Demo=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
		checkbox_Demo.click();
		WebElement click_CheckBox_1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		click_CheckBox_1.click();
		boolean checkbox_1 =click_CheckBox_1.isEnabled();
		System.out.println("checkbox_1 is enabled "+checkbox_1);
		WebElement click_CheckBox_3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		click_CheckBox_3.click();
		boolean checkbox_3 =click_CheckBox_1.isEnabled();
		System.out.println("checkbox_3 is enabled "+checkbox_3);
		

	}

}
