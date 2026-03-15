package ashishFinal.ashishFinalSeleniumFramwork;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class standaloneTest {
 @Test
	public  void main1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64 (8)\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
	
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/upload-download-test/");
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
				driver.close();
	}

}
