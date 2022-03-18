package methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	 public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	public static WebDriver driver;
	public static Hashtable<String,Object> B_Launch(Object[] inputparameters)
	{  
		try
	      {
		String name= (String) inputparameters[0];
		String exe= (String) inputparameters[1];
		System.setProperty(name, exe);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodused:B_Launch, Input_Data: "+ inputparameters[1].toString());
	}
		
	catch (Exception e)
	{
		outputParameters.put("STATUS","FAIL");
		outputParameters.put("MESSAGE","methodused:B_Launch, Input_Data: "+ inputparameters[1].toString());
	}
		return outputParameters;
		}
	
	public static Hashtable<String,Object> openApplication(Object[] inputparameters)
	{  
		try
		{
		String url=(String) inputparameters[0];
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodused:openApplication, Input_Data: "+ inputparameters[0].toString());
		}
		catch (Exception e)
		
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodused:openApplication, Input_Data: "+ inputparameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> clickOnElement(Object[] inputparameters)
	{
		try
		{
		String Xpath=(String) inputparameters[0];
		driver.findElement(By.xpath(Xpath)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodused:clickOnElement, Input_Data: "+ inputparameters[0].toString());
		}catch (Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodused:clickOnElement, Input_Data: "+ inputparameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> logInWindow(Object[] inputparameters)
	{   
		try
		{
		String abc=(String) inputparameters[0];
		WebElement xyz=driver.findElement(By.xpath(abc));
		Actions act=new Actions(driver);
		act.moveToElement(xyz).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodused:logInWindow, Input_Data: "+ inputparameters[0].toString());
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodused:logInWindow, Input_Data: "+ inputparameters[0].toString());
		}
		return outputParameters;
		}
	public static Hashtable<String,Object> clickOnProfile(Object[] inputparameters)
	{  
		try
		{
		String path=(String) inputparameters[0];
		driver.findElement(By.xpath(path)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodused:clickOnProfile, Input_Data: "+ inputparameters[0].toString());
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodused:clickOnProfile, Input_Data: "+ inputparameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> userName(Object[] inputparameters)
	{	
		try
		{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String xpath=(String) inputparameters[0];
		String user=(String) inputparameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(user);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodused:userName, Input_Data: "+ inputparameters[0].toString());
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodused:userName, Input_Data: "+ inputparameters[0].toString());
		}
		return outputParameters;
	}
	
	
	public static Hashtable<String,Object> login(Object[] inputparameters)
	{
		try
		{
		String log=(String) inputparameters[0];
		driver.findElement(By.xpath(log)).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodused:login, Input_Data: "+ inputparameters[0].toString());
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodused:login, Input_Data: "+ inputparameters[0].toString());
		}
		return outputParameters;
	}
	
	public static Hashtable<String,Object> loginSuccessful(Object[] inputparameters)
	{
		try
		{
		String givenText=(String) inputparameters[0];
		String xpath=(String) inputparameters[1];
		String actualText=driver.findElement(By.xpath(xpath)).getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		if(givenText.equalsIgnoreCase(actualText))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodused:loginSuccessful, Input_Data: "+ inputparameters[0].toString());
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodused:loginSuccessful, Input_Data: "+ inputparameters[0].toString());
		}
		return outputParameters;
	}
	/*public static Hashtable<String,Object> main(String[]args)
	{
		Object[] input=new Object[2];
		input[0]="webdriver.chrome.driver";
		input[1]="E:\\FlipkartFinal\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.B_Launch(input);
		
		Object[] input1=new Object[1];
		input1[0]="https://www.flipkart.com";
		SeleniumOperations.openApplication(input1);
		
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);
		
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.logInWindow(input3);
		
		Object[] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
		SeleniumOperations.clickOnProfile(input4);
		
		Object[] input5=new Object[2];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]="8055916704";
		SeleniumOperations.userName(input5);
		
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input6[1]="sunil@51";
		SeleniumOperations.userName(input6);
		
		Object[] input7=new Object[1];
		input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		SeleniumOperations.login(input7);
	}

*/
}









