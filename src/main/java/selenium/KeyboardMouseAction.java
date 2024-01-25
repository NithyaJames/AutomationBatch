package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardMouseAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons/");
		driver.manage().window().maximize();
		Actions actObj = new Actions(driver);
		WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
		actObj.doubleClick(doubleClickMe).perform();
		WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));
		actObj.contextClick(rightClickMe).perform();
		//MouseHovering
		actObj.moveToElement(doubleClickMe);
		//Keyboard Keys usage
		actObj.sendKeys(Keys.ARROW_DOWN).perform();

	}

}
