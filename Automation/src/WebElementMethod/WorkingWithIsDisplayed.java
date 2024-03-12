package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsDisplayed {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		
		WebElement text=driver.findElement(By.xpath("//*[@id=\'loginBox\']/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[1]/td"));
		
		System.out.println(text.isDisplayed());
	}

}
