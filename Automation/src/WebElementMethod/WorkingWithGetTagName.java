package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTagName {
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=aintleo79an2p");
		
		WebElement loginbutton= driver.findElement(By.id("loginbutton"));
		
		String colour=loginbutton.getCssValue("font-size");
		
		System.out.println(colour);
		
		String tagName=loginbutton.getTagName();
		System.out.println(tagName);
		
	}

}
