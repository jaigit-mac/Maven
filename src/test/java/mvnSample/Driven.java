package mvnSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driven extends BaseClass
{
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jai\\eclipse-workspace\\mavenfirstproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(getData(1,0));
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(getData(2,0));
	}
}
