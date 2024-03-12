package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetMethod1 {
	public static void main(String[] args) {
		
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Launch the webApplication
		driver.get("https://www.airvistara.com/in/en");
		
		//actual title
		String actual_title= driver.getTitle();
		
		//expected title
		String expected_title ="Book Flights & Check In Online | Vistara";
				
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
