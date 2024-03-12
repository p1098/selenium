package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetMethod {
	public static void main(String[] args) {
		
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Launch the webApplication
		driver.get("https://www.flipkart.com/");
		
		//actual title
		String actual_title= driver.getTitle();
		
		//expected title
		String expected_title ="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
				
		//verifying the title
				if(actual_title.equals(expected_title))
				{
					System.out.println("Test case is pass");
				}
				else
				{
					System.out.println("Test case is fail");
				}
	}

}
