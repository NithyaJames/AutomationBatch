package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement checkBox = driver.findElement(By.id("gridCheck"));
		checkBox.click();
		boolean checkBoxSelected = checkBox.isSelected();
		System.out.println(checkBoxSelected);
		boolean checkBoxDisplayed = checkBox.isDisplayed();
		System.out.println(checkBoxDisplayed);
		boolean checkBoxEnabled = checkBox.isEnabled();
		System.out.println(checkBoxEnabled);
		List <WebElement> multiList=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(int i=0;i<multiList.size();i++) {
		    	multiList.get(i).click();
        }
		for(int j=0;j<multiList.size();j++) {
			boolean multiCheckSelected = multiList.get(j).isSelected();
			System.out.println("Selcted Multicheckbox "+j+"\t"+multiCheckSelected);
			boolean multiCheckDisplayed = multiList.get(j).isDisplayed();
			System.out.println("Displayed Multicheckbox "+j+"\t"+multiCheckDisplayed);
			boolean multiCheckEnabled = multiList.get(j).isEnabled();
			System.out.println("Enabled Multicheckbox "+j+"\t"+multiCheckEnabled);
		}
			
		
	}

}
