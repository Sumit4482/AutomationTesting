package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test {
	public static WebElement bmiCal(WebDriver driver) {
		WebElement bmi = driver.findElement(By.linkText("BMI Calculator"));
		return bmi;
	}
}
