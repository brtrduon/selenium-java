import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		WebElement source = driver.findElement(By.id("fromCity"));
		source.clear();
		source.sendKeys("MUM");
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException err) {
			System.out.print(err);
		}
		source.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.id("toCity"));
		destination.clear();
		destination.sendKeys("DEL");
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException err) {
			System.out.print(err);
		}
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
	}

}
