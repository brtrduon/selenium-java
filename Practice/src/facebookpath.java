import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
//		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("xpath");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
//		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("css stuff");
		driver.findElement(By.cssSelector("#pass")).sendKeys("asdsgetg");
		driver.findElement(By.cssSelector("[value='1']")).click();
	}

}
