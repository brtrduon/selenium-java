import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("this is my first code");
//		driver.findElement(By.name("pass")).sendKeys("123456");
//		driver.findElement(By.linkText("Forgot Password?")).click();
		
		driver.findElement(By.className("inputtext")).sendKeys("Hello World");
		
//		driver.get("https://login.salesforce.com/");
//		driver.findElement(By.id("username")).sendKeys("Hello");
//		driver.findElement(By.name("pw")).sendKeys("123456");
//		driver.findElement(By.className("button r4 wide primary")).click();
		
	}
}