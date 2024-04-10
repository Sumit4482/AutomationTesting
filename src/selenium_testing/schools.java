package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class schools {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver d = new ChromeDriver();
	 Actions act = new Actions(d);
	 d.get("https://schooledn.py.gov.in/admission/hsc.html");

	 WebElement p1 = d.findElement(By.xpath("//a[@href='#'][text()='Schools']/self::a"));
	 WebElement p2 = d.findElement(By.xpath("//A[@href='#'][text()='Private']/self::A"));
	 WebElement p3 = d.findElement(By.xpath("//A[@href='../schools/govtAided.html'][text()='Govt Aided']/self::A"));

     
     act.click(p1).perform();     
     Thread.sleep(2000);
     act.moveToElement(p2).click().perform();
     Thread.sleep(2000);
     act.moveToElement(p3).perform();
     Thread.sleep(2000);
     act.click(p3).perform();
 }
}
