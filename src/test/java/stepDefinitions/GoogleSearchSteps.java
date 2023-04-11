package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("Inside Step - browser is open ");
		String projectPath =System.getProperty("user.dir");
		
	    System.out.println("Project path is : "+projectPath);
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver_win32 (2).zip)");	
	    
	    driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
			
			
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step - user is on google search page ");
	    
	}

	@When("user is enters a text in search box")
	public void user_is_enters_a_text_in_search_box() {
		System.out.println("Inside Step - user enter a text in search box");
	    
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step - hits enter ");
	    
	   
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		System.out.println("Inside Step - user is navigated to search result ");
	    
	    
	}




}
