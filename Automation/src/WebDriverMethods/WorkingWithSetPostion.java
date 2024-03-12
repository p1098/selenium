package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSetPostion {
	public static void main(String[] args)
	{
		//To launch the browser
		WebDriver driver=new ChromeDriver();
		//create the obj. of point class
		Point point=new Point(250,500);
		//set the position
		driver.manage().window().setPosition(point);
		//launch the position
		driver.get("https://www.google.com");
	}

}
