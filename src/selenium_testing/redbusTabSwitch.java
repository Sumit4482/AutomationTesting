package selenium_testing;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbusTabSwitch {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Help")).click();
	
	Thread.sleep(3000);
	Set<String> alw= driver.getWindowHandles();
	Iterator<String> it = alw.iterator();

	String pw = it.next();
	String cw= it.next();
	Thread.sleep(3000);
	
	driver.switchTo().window(cw);
	driver.findElement(By.xpath("//I[@class='icon-close']")).click();
}
}
