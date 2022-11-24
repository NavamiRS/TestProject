import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementLocating {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		String current_Url=driver.getCurrentUrl();//get current url
		System.out.println("Current url : "+current_Url);
		WebElement tableTab=driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
		tableTab.click();
		WebElement newyork=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[6]//td[3]"));
		boolean newyork_displayed=newyork.isDisplayed();
		System.out.println(newyork_displayed);
		/*WebElement input_form=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		input_form.click();
		WebElement enter_Message_Box=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		enter_Message_Box.sendKeys("hai");
		WebElement show_Message_Button=driver.findElement(By.xpath("//button[@id='button-one']"));
		show_Message_Button.click();
		WebElement your_Message=driver.findElement(By.xpath("//div[@id='message-one']"));
		boolean message_displayed=your_Message.isDisplayed();
		String display_Message=your_Message.getText();
		System.out.println(display_Message);*/
		//driver.close();
	}

}
