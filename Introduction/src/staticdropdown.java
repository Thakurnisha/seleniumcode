

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticdropdown {

	public static <Webelement> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.get("https:spicejet.com");
		Thread.sleep(5000);	
		
		//WebElement staticDropdown = driver.findElement(By.xpath("//div[@ class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e' and contains(text(),'Currency')]"));
		//Select dropdown = new Select(staticDropdown);
		driver.findElement(By.xpath("//div[@ class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e' and contains(text(),'Currency')]")).click();
       List<WebElement> options =driver.findElements(By.xpath("//div[@ class=\"css-76zvg2 r-homxoj r-ubezar\" ]")).click();
        for (int i=1;i<41;i++);			
        {	
		
        	System.out.println(options);
        	// System.out.println(driver.findElement(By.xpath("//div[@ class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e' and contains(text(),'Currency')]")).getText());
        }
      		  //updateddropdown
      		  
	/*	driver.get("https://spicejet.com");
		driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).click();
		System.out.println(driver.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep")).getText());*/
		
 
		
	}

}
