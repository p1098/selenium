package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetRect {
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=aintleo79an2p");
		
		WebElement passwordTextfield=driver.findElement(By.name("pwd"));
		
		org.openqa.selenium.Rectangle rect= passwordTextfield.getRect();
		
		int height=rect.getHeight();
		System.out.println(height);
		int width=rect.getWidth();
		System.out.println(width);
		
		int x=rect.getX();
		System.out.println(x);
		int y=rect.getY();
		System.out.println(y);
		
		passwordTextfield.getRect();
	}

}
