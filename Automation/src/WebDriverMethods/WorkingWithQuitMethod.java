package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithQuitMethod {
	public static void main(String[] args)
	{
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to launch web application
		driver.get("https://www.flipkart.com");
		//to click open a new window
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//use quit method
		driver.quit();
		
		
	}

	
}
