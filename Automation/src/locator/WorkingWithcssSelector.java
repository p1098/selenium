package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithcssSelector {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.swiggy.com/");
		
		Thread.sleep(5000);
		
	    driver.findElement(By.cssSelector("[alt='restaurants curated for biryani']")).click();
	    
	    driver.quit();
	}

}
