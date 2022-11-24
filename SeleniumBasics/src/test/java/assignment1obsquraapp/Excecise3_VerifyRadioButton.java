package assignment1obsquraapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excecise3_VerifyRadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement radio_Button_Demo=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		radio_Button_Demo.click();
		
		WebElement click_Female_Radio_Button=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		click_Female_Radio_Button.click();
		
		Boolean female_Radio_Button=click_Female_Radio_Button.isSelected();
		System.out.println("Female radio button is enabled  "+female_Radio_Button);
		WebElement show_Selected_Value=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		show_Selected_Value.click();
		WebElement show_Selected_Message=driver.findElement(By.xpath("//div[@id='message-one']"));
		String display_Message=show_Selected_Message.getText();
		System.out.println(display_Message);
		
	}

}
