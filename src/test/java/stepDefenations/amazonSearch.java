package stepDefenations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Base.MainClass;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonSearch extends MainClass {


	@When("User enter valid product name in search bar")
	public void user_enter_valid_product_name_in_search_bar() {
		Actions action = new Actions(driver);
		WebElement searchtextbar = driver.findElement(By.cssSelector("#nav-search-bar-form"));
		action.moveToElement(searchtextbar).build().perform();
		action.moveToElement(searchtextbar).click().sendKeys("Iphone 13 Pro Max").build().perform();
		
	}

	@And("user press Enter keyboar key")
	public void user_press_enter_keyboar_key() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}

	@Then("User should see result with the given product name title page")
	public void user_should_see_result_with_the_given_product_name_title_page() {
		String actualsearchtext = driver.getTitle();
		String expectedTitlePage = "Amazon.com : Iphone 13 Pro Max";
		Assert.assertEquals(actualsearchtext, expectedTitlePage);
		
	}

}
