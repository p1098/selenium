
package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightBookPaytm {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
	
	driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
	
	driver.findElement(By.id("from")).click();
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("PNQ");
	driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();                                                                                      //enter del in to text field
	
	driver.findElement(By.id("to")).click();
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("BOM");

	driver.findElement(By.xpath("//div[text()='Mumbai, Maharashtra, India']")).click();
	
	driver.findElement(By.id("departureDate")).click();
	driver.findElement(By.xpath("(//div[text()='15'])[2]")).click();
	driver.findElement(By.id("flightSearch")).click();
	//click on search flight
	
	 
	//(By.xpath(null)[text]()='air india']/ancestor;;div(@class=");
	//fetch the price of flight
	 List<WebElement> flightPrice = driver.findElements(By.xpath("//div[@class='_1zafZ']/ancestor::div[@class='M9kpV']"));
	
	for(WebElement price:flightPrice)
	{
		System.out.println(price.getText());
		System.out.println("------------------------------------------------------");

	}
	//System.out.println("Flight Price: "+ FlightPrice);
	
	//println(flightprice.getText())
	
	
	
	
		 
		////div[@class='_1zafZ']/ancestor::div[@class='_1gMv6']/../../. that dot dot is used for searching the parent *******
		
	}

			
	
}
