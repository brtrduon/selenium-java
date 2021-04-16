import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]/option[11]")).click();
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]/option[56]")).click();
	}

}
