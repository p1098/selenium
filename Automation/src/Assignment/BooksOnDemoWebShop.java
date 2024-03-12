package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooksOnDemoWebShop {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
         Thread.sleep(2000);
		driver.findElement(By.className("email")).sendKeys("mamajalebi@gmail.com");
        driver.findElement(By.className("password")).sendKeys("mama123#");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		
	    driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
	    driver.findElement(By.id("checkout")).click();
	    
	    driver.findElement(By.xpath("//input[@title='Continue']")).click();
	    driver.findElement(By.xpath("//input[@id='PickUpInStore']")).click();
	    
	    driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
	    driver.findElement(By.xpath("//input[@value='Payments.CashOnDelivery']")).click();
	    driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
	    
	    driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
	    driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
	    driver.findElement(By.linkText("Click here for order details.")).click();
	    driver.findElement(By.linkText("PDF Invoice")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Log out")).click();
	    Thread.sleep(2000);
	    driver.close();
	}

}
