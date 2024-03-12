package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FileofMovies {
	public static  void main(String[] args) throws InterruptedException
	{
	     WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/khope/OneDrive/Desktop/dropdown.html");
		Thread.sleep(3000);
		// WebElement multiSelectDropdown=driver.findElement(By.id("dropdown"));
		 WebElement multiselectDropdown=driver.findElement(By.xpath("//*[@id='dropdown']"));
		 multiselectDropdown.click(); 
		 //create the object of select class
		 Select s= new Select(multiselectDropdown);
		// select the options
	     s.selectByIndex(1);
		 Thread.sleep(2000);

		 s.selectByIndex(2);
		 Thread.sleep(2000);

		 s.selectByIndex(3);
		 Thread.sleep(2000);
		 
	     s.selectByIndex(4);
		 Thread.sleep(2000);

	     s.selectByIndex(5);
         Thread.sleep(2000);
		 //deselect option
		 s.deselectByIndex(1);
		 Thread.sleep(2000);

		 s.deselectByIndex(2);
		 Thread.sleep(2000);

		 s.deselectByIndex(3);
		 Thread.sleep(2000);
		 
		 s.deselectByIndex(4);
		 Thread.sleep(2000);

         s.deselectByIndex(5);
         Thread.sleep(2000);
		 // for selection
		  for(int i=0;i<5;i++)
		 {
			s.selectByIndex(i);
			 Thread.sleep(2000);
			 
		 }
		 //for deselection
		 
		 for(int i=0;i<5;i++)
			 
		 {
			 s.deselectByIndex(i);
			 Thread.sleep(2000);
		 }
	}

}
