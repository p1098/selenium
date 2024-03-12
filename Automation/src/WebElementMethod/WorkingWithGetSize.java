package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSize {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=aintleo79an2p");
		Thread.sleep(2000);
		
		WebElement usernameTextfield=driver.findElement(By.name("username"));
		// use get size method
		Dimension dimension=usernameTextfield.getSize();
		System.out.println(dimension);
		
		
	}

}
