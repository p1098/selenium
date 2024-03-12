package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSetSize {
	public static void main(String[] args)
	{
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//create the object of dimension class
		Dimension dimension=new Dimension(1000,2000);
		
		//set the size
		driver.manage().window().setSize(dimension);
		//launch the application
		driver.get("https://www.google.com");
		
	}

}
