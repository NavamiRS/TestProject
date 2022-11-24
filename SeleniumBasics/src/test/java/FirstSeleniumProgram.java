import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v104.page.model.NavigatedWithinDocument;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Workspace\\src\\main\\resources\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		//driver.navigate().to("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
		driver.close();
		/*System.setProperty("webdriver.edge.driver","D:\\Selenium_Workspace\\src\\main\\resources\\msedgedriver.exe" );
		WebDriver driver=new EdgeDriver();*/
	}

}
