package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClearMethod {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=aintleo79an2p");
		Thread.sleep(2000);
		
		WebElement usernameTextfield=driver.findElement(By.name("username"));
		// i will pass admin inside userTextfield
		usernameTextfield.sendKeys("admin");
		Thread.sleep(2000);
		usernameTextfield.clear();
		Thread.sleep(2000);
		// i will pass admin 123
		usernameTextfield.sendKeys("admin123");
		
	}

}
