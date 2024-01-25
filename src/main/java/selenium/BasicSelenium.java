package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSelenium {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","driver Path");
		//System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.edge.driver", "D:\\Driver\\edge\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "D:\\Driver\\mozilla\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");
		/*driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		String title=driver.getTitle();
		System.out.println(title);
		String uRL=driver.getCurrentUrl();
		System.out.println(uRL);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		//driver.close();
		driver.quit();
		

	}

}
