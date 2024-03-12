package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassName {
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://flipkart.com/");
		
		WebElement searchtext=driver.findElement(By.name("q"));
	    searchtext.sendKeys("laptop");
		
		WebElement search= driver.findElement(By.className("_2iLD__"));
		search.click();
	}

}
