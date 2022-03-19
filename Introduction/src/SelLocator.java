//import java.time.Duration;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelLocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.cchrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
        
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		driver.findElement(By.id("email")).sendKeys("nisha");
		driver.findElement(By.name("password")).sendKeys("1234567");
		driver.findElement(By.name("commit")).click();
System.out.println(driver.findElement(By.cssSelector("div.bodySmall m-b-3-xs text-center-xs auth-flash-error")).getText());

		// TODO Auto-generated method stub;
		
			}
	
}