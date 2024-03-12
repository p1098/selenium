package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Titleandurl {
	public static void main(String[] args)
	{
		//TO launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Launching web application
		driver.get("https://www.flipkart.com/");
		
		//actual title
		String actual_title=driver.getTitle();
		
		//expected title
		String expected_title="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		//verifying the title
		if(actual_title.equals(expected_title))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
		
		//To fetch the url
		String actual_url =driver.getCurrentUrl();
		String expected_url="https://www.flipkart.com/";
		if (actual_url.equals(expected_url))
		{
			System.out.println("url is correct");
		}
		else
		{
			System.out.println("url is wrong");
		}
	}

}
