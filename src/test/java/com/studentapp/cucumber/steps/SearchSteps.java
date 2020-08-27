package com.studentapp.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(SerenityRunner.class)

public class SearchSteps {
    @Managed
    WebDriver driver;

@Test

    @Given("^User launches Mixcloud website$")
    public void userLaunchesMixcloudWebsite() {
    driver.get("https://www.mixcloud.com/");
    driver.manage().window().maximize();}

    @When("^User clicks on the loginbutton$")
    public void userClicksOnTheLoginbutton() {
    driver.findElement(By.xpath("//*[contains(text(), 'Login')]")).click();
    }

    @When("^User enters valid username$")
    public void userEntersValidUsername() {
    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("zaikakaterina@yahoo.com");
    }

    @When("^User enters valid password$")
    public void userEntersValidPassword() {
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("kateruna");
    }

    @When("^User clicks on the Log in button$")
    public void userClicksOnTheLogInButton() throws  Throwable {
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[contains(text(),  'Log In')]")).click();
    }

    @When("^User should successfully be logged in$")
    public void userShouldSuccessfullyBeLoggedIn() throws Throwable {
    Thread.sleep(3000);
        WebElement Kateruna= driver.findElement(By.xpath("//*[contains(text(), 'Kateruna')]"));
        Assert.assertEquals(true, Kateruna.isDisplayed());
    }

    @When("^the User click on search field$")
    public void theUserClickOnSearchField() throws Throwable{
    Thread.sleep(3000);
        driver.findElement(By.xpath("//div/input['mixcloud_query']")).click();
    }

    @When("^the User enters artist name in the search field$")
    public void theUserEntersArtistNameInTheSearchField() throws Throwable {
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div/input['mixcloud_query']")).sendKeys("Martin Garrix");
    }

    @When("^the User clicks on artist image$")
    public void theUserClicksOnArtistImage() throws Throwable{
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/a/div/img")).click();
    }

    @When("^the User clicks on favorite button$")
    public void theUserClicksOnFavoriteButton() throws Throwable{
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[3]/div/div[2]/section/div[2]/div/footer/div/button[1]")).click();
    }

    @When("^the User clicks on Your Profile button$")
    public void theUserClicksOnYourProfileButton() throws  Throwable{
    driver.navigate().refresh();

    driver.findElement(By.cssSelector("#react-root > div > section > div:nth-child(3) > div > div > div.RebrandHeader__FullWidthHeader-sc-1sdci47-0.cYyDpg > div > div:nth-child(3) > div:nth-child(3) > div > div > img")).click();
    Thread.sleep(10000);
    driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/section/div[3]/div/div/div[2]/div/div[3]/div[3]/div[2]/div/div/div[1]/a/p")).click();
}

    @When("^the User clicks on check sign$")
    public void theUserClicksOnCheckSign() throws Throwable{
    Thread.sleep(7000);
    driver.findElement(By.cssSelector("#react-root > div > section > div:nth-child(3) > div > div > div.cf > div > div.content-wrapper > main > div.content > div > div > div.styles__SectionContainer-obazx4-0.fKqoOc > div > div > div > div.AudioCardTitle__Container-sc-1kxsru9-1.hGblkL > span > svg")).click();
}

    @Then("^the artist is deleted from favorite$")
    public void theArtistIsDeletedFromFavorite() throws Throwable{
    Thread.sleep(5000);
    driver.navigate().refresh();

    }
}
