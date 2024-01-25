package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		//switch by name or id
		//driver.switchTo().frame("frame1"); //step 1
		//switch by webelement
		WebElement iframeElement=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement);
		WebElement frameText = driver.findElement(By.id("sampleHeading"));  //step 2
		System.out.println(frameText.getText());            
		
		//driver.switchTo().parentFrame();                   //step 3
		driver.switchTo().defaultContent();                 
		

	}

}
