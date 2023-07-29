package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleHome;


public class GoogleSearch extends GoogleBase{
	GoogleHome gh;
	
	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		launchbrowser();
		
	    
	}
	@When("I enter search  {string}")
	public void i_enter_search(String string) {
		gh= new GoogleHome(driver);
		gh.enterSearch(string);
		
	    
		
	}
	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    gh.clickSearch();
		
	}
	@Then("I recieve related search reasult")
	public void i_recieve_related_search_reasult() {
	    WebElement resultStats;
	    resultStats= driver.findElement(By.id("result-stats"));
	    String results = resultStats.getText();
	    
	    System.out.println();
	    System.out.println(results);
	    System.out.println();
	    
	    closeBrowser();
	}
}
