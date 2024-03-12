package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SugarWithZomato {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Blinkit")).click();
       
        driver.findElement(By.xpath("//*[@id='app']/div/div/div/header/div/div/div/div/div/div/div/div/div/div/button")).click(); 
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS']")).click();
        
       // driver.findElement(By.xpath("//input[@class='SearchBarContainer__Input-sc-hl8pft-3 irVxjq']")).sendKeys("sugar");
        Thread.sleep(2000);
      //*[@id="app"]/div/div/div[3]/div/div/div[2]/div[1]/div/div/div/div[2]/div[2]/a[2]/div/div[3]/div[2]/div[2]/div[2]
        
        driver.findElement(By.xpath("//input[@class='SearchBarContainer__Input-sc-hl8pft-3 irVxjq']")).sendKeys("sugar");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[3]/div/div/div[2]/div[1]/div/div/div/div[2]/div[2]/a[2]/div/div[3]/div[2]/div[2]/div[2]")).click();       
        
        // click on add button for adding product in cart
        for(int i=0;i<2;i++)
        {
        	driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']")).click();
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='CartButton__CartIcon-sc-1fuy2nj-6 iyUoPU']")).click(); 	
        }

}
