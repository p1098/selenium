package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigate {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.zomato.com");
		Thread.sleep(2000);
		//to go back
		driver.navigate().back();
		Thread.sleep(2000);
		//to go forward
		driver.navigate().forward();
		//to fresh the browser
		driver.navigate().refresh();
	
	}

}
