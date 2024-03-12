package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpath {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/span"));
		driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/span"));
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/a")).click();
		
	}

}
//this program is not right..*