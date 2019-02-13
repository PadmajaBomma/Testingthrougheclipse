package StepDefs1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoLoginStepDefinition1 {
	
	WebDriver driver;
	
	@Given("^Open the browser and pass the application URL$")
	public void open_the_browser_and_pass_the_application_URL() throws Throwable {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\padmaja.alavala\\OneDrive - Accenture\\Back Up - Padmaja Alavala\\Selenium 3 docs\\Selenium 3 Plus Training\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");	
	
	   
	}

	@When("^Enter valid User ID and Password$")
	public void enter_valid_User_ID_and_Password() throws Throwable {
	   
		driver.findElement(By.name("userName")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
	    
	}

	@Then("^Signout options should be visible in the next page$")
	public void signout_options_should_be_visible_in_the_next_page() throws Throwable {
	    
		driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).click();
	    
	}

}
