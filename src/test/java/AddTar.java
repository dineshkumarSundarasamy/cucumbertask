import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTar {
	
	static WebDriver driver;
	@Given("I want to write a step for addTariffPlan")
	public void i_want_to_write_a_step_for_addTariffPlan() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\np00474612\\eclipse-workspace\\CucumberAddTarrif\\driver\\chromedriver.exe");
		   driver = new ChromeDriver();
		  driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
	}


	
	@When("I want to add tariff plan in form {string},{string},{string},{string},{string},{string},{string}")
	public void i_want_to_add_tariff_plan_in_form(String a, String b, String c, String d, String e, String f, String g) {
		WebElement txtMRental = driver.findElement(By.id("rental1")) ;
		txtMRental.sendKeys(a);
		
		WebElement txtLocMin = driver.findElement(By.xpath("//input[@name='local_minutes']")) ;
		txtLocMin.sendKeys(b);
		  
		  WebElement txtIMin = driver.findElement(By.id("inter_minutes")) ;
		  txtIMin.sendKeys(c);
		  
		  WebElement txtSms = driver.findElement(By.id("sms_pack")) ;
		  txtSms.sendKeys(d);
		  
		  WebElement txtMChrg = driver.findElement(By.id("minutes_charges")) ;
		  txtMChrg.sendKeys(e);
		  
		  WebElement txtIChrg = driver.findElement(By.id("inter_charges")) ;
		  txtIChrg.sendKeys(f);
		  
		  WebElement txtSChrg = driver.findElement(By.id("sms_charges")) ;
		  txtSChrg.sendKeys(g);
		
		  WebElement btnsubmit = driver.findElement(By.xpath("//input[@name='submit']")) ;
		  btnsubmit.click();
}

	
	
	@Then("I verify the status in steps")
	public void i_verify_the_status_in_steps() {
	   	}
}
