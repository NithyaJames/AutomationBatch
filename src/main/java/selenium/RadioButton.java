package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
		WebElement femaleRadioButton=driver.findElement(By.id("inlineRadio2"));
		femaleRadioButton.click();
		WebElement showSelectedValue=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		showSelectedValue.click();
		boolean maleSelectedOrNot = maleRadioButton.isSelected();
		System.out.println(maleSelectedOrNot);
		boolean femaleSelectedOrNot = femaleRadioButton.isSelected();
		System.out.println(femaleSelectedOrNot);
		boolean maleEnable = maleRadioButton.isEnabled();
		System.out.println(maleEnable);
		boolean femaleEnable = femaleRadioButton.isDisplayed();
		System.out.println(femaleEnable);
		WebElement malePatientButton = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		malePatientButton.click();
		WebElement femalePatientButton = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		femalePatientButton.click();
		WebElement ageGroup18 = driver.findElement(By.id("inlineRadio22"));
		ageGroup18.click();
		WebElement ageGroup44 = driver.findElement(By.id("inlineRadio23"));
		ageGroup44.click();
		WebElement ageGroup60 = driver.findElement(By.id("inlineRadio24"));
		ageGroup60.click();
		WebElement getResultsButton = driver.findElement(By.xpath("//button[text()='Get Results']"));
		getResultsButton.click();
		boolean malePatientEnable = malePatientButton.isEnabled();
		System.out.println(malePatientEnable);
		boolean malePatientDisplayed = malePatientButton.isDisplayed();
		System.out.println(malePatientDisplayed);
		boolean malePatientSelected = malePatientButton.isSelected();
		System.out.println(malePatientSelected);
		boolean femalePatientEnable = femalePatientButton.isEnabled();
		System.out.println(femalePatientEnable);
		boolean femalePatientDisplayed = femalePatientButton.isDisplayed();
		System.out.println(femalePatientDisplayed);
		boolean femalePatientSelected = femalePatientButton.isSelected();
		System.out.println(femalePatientSelected);
		boolean ageGroup18Selected = ageGroup18.isSelected();
		System.out.println(ageGroup18Selected);
		boolean ageGroup18Enable = ageGroup18.isEnabled();
		System.out.println(ageGroup18Enable);
		boolean ageGroup18Displayed = ageGroup18.isDisplayed();
		System.out.println(ageGroup18Displayed);
		boolean ageGroup44Enabled = ageGroup44.isEnabled();
		System.out.println(ageGroup44Enabled);
		boolean ageGroup44Selected = ageGroup44.isSelected();
		System.out.println(ageGroup44Selected);
		boolean ageGroup44Displayed = ageGroup44.isDisplayed();
		System.out.println(ageGroup44Displayed);
		boolean ageGroup60Displayed = ageGroup60.isDisplayed();
		System.out.println(ageGroup60Displayed);
		boolean ageGroup60Enable = ageGroup60.isEnabled();
		System.out.println(ageGroup60Enable);
		boolean ageGroup60Selected = ageGroup60.isSelected();
		System.out.println(ageGroup60Selected);
		
	}

}
