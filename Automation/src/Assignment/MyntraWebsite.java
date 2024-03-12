package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraWebsite {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div/div/input")).sendKeys("Kurtas For Men",Keys.ENTER);
		//identify all the kurta and print it
		List<WebElement> kurtaName= driver.findElements(By.xpath("//*[@id='desktopSearchResults']/div/section/ul/li/a"));
		
		List<WebElement> kurtaPrice=driver.findElements(By.xpath("//*[@id='desktopSearchResults']/div/section/ul/li/a/div/div/span/span"));
		
		for(WebElement name:kurtaName)
		{
			System.out.println(name.getText());
		}
		
		for(WebElement Price:kurtaPrice)
		{
			System.out.println(Price.getText());
		}
		
	}

}

