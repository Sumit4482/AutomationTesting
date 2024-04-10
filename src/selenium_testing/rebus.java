package selenium_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rebus {
public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
	 Actions act = new Actions(d);
	 d.get("https://www.redbus.in/");
	 WebElement help = d.findElement(By.xpath("//I[@class='icon icon-help_new icon_rb_secondary_item']/self::I"));
	 help.click();
	  
	 WebElement myAccountParent = d.findElement(By.xpath("//span[@class='name_rb_secondary_item'][text()='My Account']"));
     act.moveToElement(myAccountParent).perform();

	WebElement myticket = d.findElement(By.xpath("//LI[@id='ticket_details']//SPAN[@class='header_dropdown_item_name'][text()='Show My Ticket']"));
	myticket.click();
}
}
