package plainTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class UnitTestCase
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\FlipkartFinal\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		Actions act=new Actions(driver);
		
		WebElement abc=driver.findElementByXPath("//*[@class='_1_3w1N']");
		
		act.moveToElement(abc).build().perform();
		
		driver.findElementByXPath("//*[@class='_3vhnxf']").click();
		    		
		
       driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("8055916704");
		
      driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("sunil@51");
		
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();  
	
		
		
		
		
	}
	

}
