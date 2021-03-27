import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Driver object for Chrome Browser
		
		// we will strictly implement methods of webdriver
		
		//	Class name = ChromeDriver
		//				
		//		X driver = new X();
		
		// invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//	for firefox, instead of chromedriver, it will be gecko driver
		//	for IE, it will be InternetExplorerDriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}
}
