package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchSourceCode {
	public static void main(String[] args)
	{
		//To launch the browser
		WebDriver driver = new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		//To launch the web application
		driver.get("https://www.amazon.com");
		//TO fetch source code
		
		String source=driver.getPageSource();
		System.out.println(source);
	}

}
