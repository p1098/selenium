package Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterWithNaukri {
	public static void main(String[] args)
	{
		;		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\'register_Layer\']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("name")).sendKeys("dinesh",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("email")).sendKeys("dineshjalebi@gmail.com",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("password")).sendKeys("mama123#",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("mobile")).sendKeys("7083579387",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
	    driver.findElement(By.xpath("(//h2[@class='main-3'])[2]")).click();


	   driver.findElement(By.xpath("//span[text()='Kolkata']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	   driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	   driver.findElement(By.xpath("//a[text()='Login']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	   
	   
	   
	   driver.findElement(By.id("usernameField")).sendKeys("mamajalebi@gmail.com",Keys.ENTER);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mama123#",Keys.ENTER);
	   
 	}

}
