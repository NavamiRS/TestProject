import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProject3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//manage chromedriver automatically
		WebDriver driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/home");
		driver.manage().window().maximize();
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.quit();
	}

}
