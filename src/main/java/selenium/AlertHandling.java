package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php\\r\\n");
		driver.manage().window().maximize();
		WebElement clickMeButton = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMeButton.click();
		driver.switchTo().alert().accept();
		WebElement clickMe2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMe2.click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().dismiss();
		WebElement clickPromptbox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickPromptbox.click();
		driver.switchTo().alert().sendKeys("Nithya");
		Alert alertSend = driver.switchTo().alert();
		alertSend.sendKeys("Nithya");
		alertSend.accept();
	}

}
