package testCase;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class NewTest {
    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setUp() {
        driver.manage().window().setSize(new Dimension(768, 816));
        driver.get("http://localhost:4200/login");
    }

    @Test(dataProvider = "credentials")
    public void loginTest(String email, String password) throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector(".signInBtn")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:4200/home", "Login failed");
    }

    @AfterMethod
    public void tearDown() {
        // driver.quit();
    }

    @DataProvider(name = "credentials")
    public Object[][] provideCredentials() {
        return new Object[][] {
        	 {"sai@example.com", "sai123"}, 
             {"wrong@example.com", "sai123"}, 
             {"sai@example.com", "wrong123"},
        };
    }
}
