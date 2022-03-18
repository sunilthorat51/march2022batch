package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;

public class Login 

{
	@Given("^user opens \"([^\"]*)\"browser with exe as \"([^\"]*)\"$")
	public void B_launch(String bname, String exe)
	{
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOperations.B_Launch(input);
	}
	
	@Given("^user opens URL as \"(.*)\"$")
	public void openApp (String url)
	
	{
		Object[] input1=new Object[1];
		input1[0]=url;
		SeleniumOperations.openApplication(input1);
	}
	
	@When ("user click on cancle login window")
	public void clickOnElement()
	
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);
	}
	
	@When ("user moveto login")
	public void logInWindow()
	{
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		SeleniumOperations.logInWindow(input3);
	}
	
	@When ("user click on Myprofile$")
	public void clickOnProfile()
	{
		Object[] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
		Hashtable<String, Object> output4= SeleniumOperations.clickOnProfile(input4);
		
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user click on Myprofile$", output4.get("MESSAGE").toString());
	}
	
	@When("^user enter username as \"([^\"]*)\"$")
	public void userName(String name)
	{
		Object[] input5=new Object[2];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]=name;
		Hashtable<String, Object> output5= SeleniumOperations.userName(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter username as \"([^\"]*)\"$", output5.get("MESSAGE").toString());
	}
	
	@When("^user enter password as \"([^\"]*)\"$")
	public void password(String pass)
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input6[1]=pass;
		Hashtable<String, Object> output6=SeleniumOperations.userName(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter password as \"([^\"]*)\"$", output6.get("MESSAGE").toString());
	}
	
	@When ("user clik on login button$")
	public void Login()
	{
		Object[] input7=new Object[1];
		input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		Hashtable<String, Object> output7=SeleniumOperations.login(input7);		
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user clik on login button$", output7.get("MESSAGE").toString());
	}
	
	@Then("^application shows login successfully$")
	public void application_shows_login_successfully() throws Throwable 
	{
		Thread.sleep(3000);
		Object[] input8=new Object[2];
		input8[0]="Sunil Thorat";
		input8[1]="//*[text()='sunil thorat']";
		Hashtable<String, Object> output8=SeleniumOperations.loginSuccessful(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^application shows login successfully$", output8.get("MESSAGE").toString());
	}
	
}
