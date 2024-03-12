package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSubmit {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement searchTextfield=driver.findElement(By.name("q"));
		
		//search some product
		searchTextfield.sendKeys("laptop");
		//use submit method
		searchTextfield.submit();
		
		
	}

}
