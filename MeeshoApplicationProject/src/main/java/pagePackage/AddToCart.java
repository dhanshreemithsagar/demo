package pagePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.meesho.com/");
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	// search product 
	// identify search box 
WebElement searchTextbox = driver.findElement(By.name("q"));
	searchTextbox.sendKeys("shoes",Keys.ENTER);
	

	
	}

}
