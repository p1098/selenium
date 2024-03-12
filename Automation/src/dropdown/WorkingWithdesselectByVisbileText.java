package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithdesselectByVisbileText {
	public  static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		//click on ui ttesting
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
        driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
        
        driver.findElement(By.xpath("//a[text()='Single Select']")).click();
        
         WebElement dropdown= driver.findElement(By.id("select3"));
         dropdown.click();
        
         Select s=new Select(dropdown);
        
         s.selectByValue("United Kingdom");
        
        
	}
}
		
		
		
		
		