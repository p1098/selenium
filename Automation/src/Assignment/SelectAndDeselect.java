package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		Thread.sleep(2000);

		WebElement multiselectDropdown=driver.findElement(By.id("select-multiple-native"));
		Select s=new Select(multiselectDropdown);
		
		//select the option
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		//deselect the option by deselect by visibletext
		Thread.sleep(2000);
		s.deselectByVisibleText("Germany");
		s.deselectByVisibleText("Poland");
		Thread.sleep(2000);
	}

}
