
import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize(); 	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		dropDown.click();
		Select select=new Select(dropDown);
		
		//select.selectByIndex(1);
		//select.selectByValue("Yellow");
		select.selectByVisibleText("Green");
		
		
		String k=select.getFirstSelectedOption().getText();//validating selected value is printed or not in single dropdown,getting the slected option
		System.out.println(k);
		
		boolean b2=select.isMultiple();//validating dopdown is a multi selecting dropdown or not
		System.out.println(b2);
		
		
		
		
		List<WebElement> list=select.getOptions();//getting all values inside the dropdown
		int size=list.size();
		
		
		for(int i=0;i<size;i++) 
		{
			
			String options=list.get(i).getText();
			System.out.println(options);
		}
		WebElement dropdown_2 = driver.findElement(By.id("multi-select-field"));
		Select j = new Select(dropdown_2);
		j.selectByIndex(1);
		j.selectByIndex(2);

//		j.deselectByIndex(1);
//		j.deselectByIndex(2);
		
//		j.deselectAll();
		
		List<WebElement> list1=j.getAllSelectedOptions();//getting all selected options in the dropdown
		int size2=list1.size();
		for(int j1=0;j1<size2;j1++) 
		{
			
			String options1=list.get(j1).getText();
			System.out.println(options1);
		}
		
		boolean b=j.isMultiple();
		System.out.println(b);
		
		
		
	}

}
