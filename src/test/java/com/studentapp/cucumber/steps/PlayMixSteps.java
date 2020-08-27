package com.studentapp.cucumber.steps;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;


@RunWith(SerenityRunner.class)


public class PlayMixSteps {
	 @Managed  WebDriver driver;
	
@Test	 

 @Given("^User navigates to Mixcloud website$")
 public void user_navigates_to_mixcloud_website() {
 	driver.get("https://www.mixcloud.com/");
    driver.manage().window().maximize();
 }
 @When("^User clicks on the login button on page$")
 public void user_clicks_on_the_login_button_on_page() throws Throwable {
 driver.findElement(By.xpath("//*[contains(text(), 'Login')]")).click();
 }
 @When("^User enters a valid username$")
 public void user_enters_a_valid_username() {
 	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("skoptev+test@ukr.net");
  }
 @When("^User enters a valid password$")
 public void user_enters_a_valid() {
 	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("qaLabTest");
  }
 @When("^User clicks on the log in button$")
 public void user_clicks_on_the_log_in_button() throws Throwable {
 	Thread.sleep(3000);
 	driver.findElement(By.xpath("//*[contains(text(),  'Log In')]")).click();
    }	
 @When("^User should be successfully logged in$")
 public void user_should_be_logged_in() throws Throwable {
 	Thread.sleep(2000);
 	WebElement QaLab=driver.findElement(By.xpath("//*[contains(text(), 'QAlab')]"));
 	Assert.assertEquals(true,  QaLab.isDisplayed());
 }
 @When("^User clicks Search field$")
	public void user_clicks_Search_field() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input['mixcloud_query']")).click();
		driver.findElement(By.xpath("//div/input['mixcloud_query']")).sendKeys("armin van buuren");
	}
 @When("^User enters artistname in the Search field$")
	public void user_enters_in_the_Search_field() throws Throwable {
     System.out.println("Okay! Let's Dance, Guys!");
	}
 @Then("^User plays all available tracks$")
	public void user_plays_all_available_tracks() throws Throwable {
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("section.cf.searching div.container.site-wrapper.search-height-container div.cf:nth-child(3) div.RebrandSearch__SearchContainer-sc-1bebego-0.bzwkFj div.RebrandSearchResults__SearchResultsContainer-sc-1me0jh9-0.hPGoha div.RebrandSearchResults__ResultsHalves-sc-1me0jh9-1.dbVulr div.RebrandCloudcastSearchResults__CloudcastSearchResultsContainer-izt7kn-0.kkLceu div.RebrandCloudcastSearchResults__SearchAudioCardContainer-izt7kn-1.hfosMz:nth-child(1) div.SearchAudioCard__SearchAudioCardContainer-mrx8e1-0.fyBMBP span.play-button.SearchAudioCard__SearchPlayButton-mrx8e1-1.bnnBpo:nth-child(2) span.play-icon.state > svg:nth-child(1)")).click();

     Thread.sleep(15000);
	}
}

