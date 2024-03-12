package Assignment;

import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class RunTimePolymorphism {
	
	static WebDriver driver;  
	
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("==Enter your browser name==");
			String browser=sc.next();
			if(browser.equals("Chrome"))
			{
				driver= new ChromeDriver();
			}
			else if(browser.equals("Firefox"))
			{
				driver =new FirefoxDriver();
				
			}
			else if(browser.endsWith("Edge"))
			{
				driver=new EdgeDriver();
			}
			else
			{
				System.out.println("Invalid Browser");
			}
		}
	}

}
