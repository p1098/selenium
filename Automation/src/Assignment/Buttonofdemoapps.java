package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonofdemoapps {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		//WebElement Name=driver.findElement(By.xpath("//*[@id=\'name\']"));
		
		//System.out.println(Name.isEnabled());
	}
}