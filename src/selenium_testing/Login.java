package selenium_testing;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4200/login");
        driver.manage().window().setSize(new Dimension(768, 816));
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("sai@example.com");
        driver.findElement(By.name("password")).sendKeys("sai123");
        driver.findElement(By.cssSelector(".signInBtn")).click();
      
	}

}
