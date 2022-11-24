package assignment1obsquraapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excecise4_Navigate_Tablepage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");//table page
		WebElement tiger_Nixon_Name=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[1]"));
		String name_Nixon=tiger_Nixon_Name.getText();
		System.out.println("Name :  "+name_Nixon);
		WebElement tiger_Nixon_Position=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[2]"));
		String position_Nixon=tiger_Nixon_Position.getText();
		System.out.println("Position : "+position_Nixon);
		
		WebElement tiger_Nixon_Office=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[3]"));
		String office_Nixon=tiger_Nixon_Office.getText();
		System.out.println("Office : "+office_Nixon);
		
		WebElement tiger_Nixon_Age=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[4]"));
		String age_Nixon=tiger_Nixon_Age.getText();
		System.out.println("Age : "+age_Nixon);
		
		
		WebElement tiger_Nixon_Startdate=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[5]"));
	String start_Nixon=tiger_Nixon_Startdate.getText();
		System.out.println("StartDate : "+start_Nixon);
		
		WebElement tiger_Nixon_Salary=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tr[1]//td[6]"));
		String salary_Nixon=tiger_Nixon_Salary.getText();
		System.out.println("Salary : "+salary_Nixon);
		
	}

}
