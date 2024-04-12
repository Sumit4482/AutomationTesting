package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rebus {
public static void main(String[] args) throws InterruptedException {
	WebDriver d = new ChromeDriver();
	 
	   d.get("https://www.redbus.in/");
 
       WebElement Account = d.findElement(By.xpath("(//DIV[@class='rb_main_secondary_item  link'])[2]"));
       WebElement Details = d.findElement(By.id("ticket_details"));	 

       Actions actions = new Actions(d);
       actions.moveToElement(Account).click().perform();
       Thread.sleep(2000);
       actions.moveToElement(Details).perform();
       Thread.sleep(2000);
       actions.click(Details).perform();
       
}
}
