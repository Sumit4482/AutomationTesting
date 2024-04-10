package selenium_testing;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		  driver.get("http://localhost:4200/signup");
		    driver.findElement(By.cssSelector(".nameInputLayout > .customInputField")).click();
		    driver.findElement(By.cssSelector(".ng-valid")).sendKeys("shreyash kale");
		    driver.findElement(By.cssSelector(".ng-untouched")).sendKeys("shreyash@test.com");
		    driver.findElement(By.cssSelector(".signInBtn")).click();
		    driver.findElement(By.cssSelector(".genderInputLayout > .customInputField")).click();
		    driver.findElement(By.cssSelector(".ng-untouched")).click();
		    driver.findElement(By.cssSelector(".signInBtn")).click();
		    driver.findElement(By.cssSelector(".customInputField")).click();
		    driver.findElement(By.cssSelector(".customInputField")).sendKeys("2024-04-01");
		    driver.findElement(By.cssSelector(".mat-mdc-select-placeholder")).click();
		    driver.findElement(By.cssSelector("#mat-option-0 > .mdc-list-item__primary-text")).click();
		    driver.findElement(By.cssSelector(".cdk-overlay-backdrop")).click();
		    driver.findElement(By.cssSelector(".signInBtn")).click();
		    driver.findElement(By.cssSelector(".usernameInputLayout > .customInputField")).click();
		    driver.findElement(By.cssSelector(".ng-valid")).sendKeys("shreyash");
		    driver.findElement(By.cssSelector(".ng-untouched")).sendKeys("test123");
		    driver.findElement(By.cssSelector(".signInBtn")).click();
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).sendKeys("shreyash@test.com");
		    driver.findElement(By.name("password")).sendKeys("test123");
		    driver.findElement(By.cssSelector(".signInBtn")).click();
		    driver.findElement(By.cssSelector(".username")).click();
		    driver.findElement(By.cssSelector(".rightSide")).click();
		    driver.findElement(By.cssSelector(".rightSide")).click();
      
	}
}
