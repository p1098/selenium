package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithisSelected {
	public static void main (String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=aintleo79an2p");
		
		
		WebElement checkbox=driver.findElement(By.id("keeploggedIncheckbox"));
		
		checkbox.click();
		
		if(checkbox.isSelected())
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			checkbox.click();
		}
		
	}

}
