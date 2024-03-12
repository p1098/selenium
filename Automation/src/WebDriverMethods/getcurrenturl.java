package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {
	public static void main(String[] args)
	{
		//To Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To launch web application
		driver.get("https://www.airvistara.com/in/en");
		
		//To fetch the url
		String actual_url= driver.getCurrentUrl();
		String expected_url="https://www.airvistara.com/in/en";
	
		if(actual_url.equals(expected_url))
		{
		  System.out.println("url is correct");	
		}
		else
		{
			System.out.println("url is wrong");
		}
	}

}
