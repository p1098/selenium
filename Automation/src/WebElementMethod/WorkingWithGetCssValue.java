package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCssValue {
	public static void main (String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=aintleo79an2p");
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		
		String colour=loginButton.getCssValue("font-size");
		
		System.out.println(colour);
	}

}
