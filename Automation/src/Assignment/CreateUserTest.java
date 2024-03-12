package Assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateUserTest {
	public static void main(String[] args) throws InterruptedException
	{
		Random r = new Random();
		int no = r.nextInt(1000);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.jsp");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
	
        driver.findElement(By.xpath("//a[@class='content users']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@value='Create New User']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.name("username")).sendKeys( "john"+no);
        Thread.sleep(1000);
        //pass the password
        driver.findElement(By.name("passwordText")).sendKeys("john@123"+no);
        Thread.sleep(2000);
        driver.findElement(By.name("passwordTextRetype")).sendKeys("john@123"+no);
        Thread.sleep(2000);
        
        driver.findElement(By.name("firstName")).sendKeys("john"+no);
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("abraham"+no);
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//a[@class='logout']")).click();
		
				
		
		
		
		
	}

}
