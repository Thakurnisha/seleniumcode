import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignment {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1" )).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1" )).isSelected());
		driver.findElement(By.id("checkBoxOption1" )).clear();
		System.out.println(driver.findElement(By.id("checkBoxOption1" )).isSelected());
		//find count of checkboxes
		
		System.out.println(driver.findElements(By.xpath("//input[@ type =\"checkbox\"]")).size());
	}
}
