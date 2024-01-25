package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php/r/n");
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.id("single-input-field"));
		Select obj = new Select(dropDown);
		obj.selectByIndex(1);
		obj.selectByVisibleText("Yellow");
		obj.selectByValue("Green");
		WebElement multi = driver.findElement(By.id("multi-select-field"));
		Select multiObj = new Select(multi);
		for(int i=0;i<3;i++) {
			multiObj.selectByIndex(i);
		}
		List <WebElement> list1 = multiObj.getAllSelectedOptions();
		
		for(int j=0;j<list1.size();j++) {
			String color = list1.get(j).getText();
			System.out.println(color);
		}
		
	}

}
