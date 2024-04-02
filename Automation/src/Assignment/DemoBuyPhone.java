package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBuyPhone {
   public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.demoblaze.com/index.html");
	
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.id("loginusername")).sendKeys("mamajalebi123");
	driver.findElement(By.id("loginpassword")).sendKeys("mama123");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
	Thread.sleep(3000);
	//switch the control from main page to alert
	Alert alt=driver.switchTo().alert();
	Thread.sleep(3000);
	//use accept
	alt.accept();
	driver.findElement(By.xpath("//a[text()='Home ']")).click();
	driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
	driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
	Thread.sleep(3000);
	//switch the control from main page to alert
	Alert alt1=driver.switchTo().alert();
	Thread.sleep(3000);
	//use accept
	alt1.accept();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Cart']")).click();
	Thread.sleep(3000);
	
	WebElement verify = driver.findElement(By.id("totalp"));
     String actualprice=verify.getText();
     System.out.println(actualprice);
     
     String expectedprice="1180";
     if(actualprice.equals(expectedprice))
     {
    	 System.out.println("Actual price is matched to the expected price");
     }
     else
     {
    	 System.out.println("Actual price is not matched to the expected price");
     }
     driver.findElement(By.xpath("//button[text()='Place Order']")).click();
     driver.findElement(By.id("name")).sendKeys("mama");
     driver.findElement(By.id("country")).sendKeys("india");
     driver.findElement(By.id("city")).sendKeys("pune");
     driver.findElement(By.id("card")).sendKeys("942587188699877186600");
     driver.findElement(By.id("month")).sendKeys("may");
     driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("2020");
     driver.findElement(By.xpath("//button[text()='Purchase']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[text()='OK']")).click();
     
     driver.quit();
}
}
