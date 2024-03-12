package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSetPosition {
	
	public static void main(String[] args) {
		
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// create the object of the point class
		Point point = new Point(250,500);
		
		//set the position
		driver.manage().window().setPosition(point);
		
		// launch the application
		driver.get("https://www.google.com");
		
	}

}
