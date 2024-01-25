package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		WebElement newTab = driver.findElement(By.id("tabButton"));
		newTab.click();
		
		System.out.println(parentWindow);
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		for(String childWindow : allWindows) {
			System.out.println(childWindow);
			if(!parentWindow.equals(childWindow)) {
				System.out.println(childWindow);
				driver.switchTo().window(childWindow);
				WebElement newTabText=driver.findElement(By.id("sampleHeading"));
				System.out.println(newTabText.getText());
				
			}
		}
		driver.switchTo().window(parentWindow);
	}

}
