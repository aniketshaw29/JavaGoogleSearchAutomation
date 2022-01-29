package google_automation.java_google_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\ecl\\Eclipse_Workspaces\\workspace1\\java_google_automation\\chromeDrive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch website
		driver.navigate().to("http://www.google.com");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("q")).sendKeys("java");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	}
}