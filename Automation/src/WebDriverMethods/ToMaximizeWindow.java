package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeWindow {
	public static void main(String[] args)
	{
	//To launch the Browser
    WebDriver driver=new ChromeDriver();
	//ToMaximize the Window
	driver.manage().window().maximize();
	
	//To launch the application web
	driver.get("https://www.amazon.com");
	}

}
