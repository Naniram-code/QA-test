package stepDefenations;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Base.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountAndListTest extends MainClass {
       
	@Given("user load google chrome and lunch  application")
	public void user_load_google_chrome_and_lunch_application() {
	
		System.out.println(" Youser search Url="+ driver.getCurrentUrl());
	}

	@When("User move mouse curser Account and lists  dynamic droupdown menu")
	public void user_move_mouse_curser_account_and_lists_dynamic_droupdown_menu() {
		Actions action = new Actions(driver);
		WebElement accountAndList =driver.findElement(By.cssSelector("#nav-link-accountList"));
		action.moveToElement(accountAndList).build().perform();
	
	
	}

	@And("user press click {string} account and list options")
	public void user_press_click_account_and_list_options(String link) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText(link))).click().build().perform();
	}

	@Then("User should see result of link page URL")
	public void user_should_see_result_of_link_page() {
	 System.out.println("URL=====>"+driver.getCurrentUrl());
	}

	@And("user verify {string} Titlepage")
	public void user_verify_text(String Titlepage) {
		String expectedFlightsPageTitle = Titlepage;
		String actualFlightsPageTitle = driver.getTitle();
		Assert.assertEquals(actualFlightsPageTitle, expectedFlightsPageTitle); 
		
	}

}