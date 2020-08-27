package com.studentapp.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

@RunWith(SerenityRunner.class)

public class autoriaSteps {

    @Managed
    WebDriver driver;

@Test

    @Given("^User launch auto ria website$")
    public void userLaunchAutoRiaWebsite() {
    driver.get("https://auto.ria.com/uk/");
    driver.manage().window().maximize();
    }

    @When("^User selects used cars$")
    public void userSelectsUsedCars() {
    driver.findElement(By.xpath("//*[@id=\"mainSearchForm\"]/div[1]/label[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"mainSearchForm\"]/div[3]/a")).click();
    }

    @When("^User selects cars by filters$")
    public void userSelectsCarsByFilters() throws  Throwable {
        Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/div[2]/div/select/option[2]")).click();
        Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/div[3]/div/div/label[2]")).click();
        Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"at_country\"]/option[6]")).click();
        Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"autocompleteInput-brand-0\"]")).sendKeys("Hyundai");
    driver.findElement(By.xpath("//*[@id=\"autocomplete-brand-0\"]/ul/li/a")).click();
        Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"autocompleteInput-model-0\"]")).sendKeys("Sonata");
        Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"at_year-from\"]")).sendKeys("2010");
        Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"at_price-from\"]")).sendKeys("1000");
        Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"at_price-to\"]")).sendKeys("20000");
        Thread.sleep (3000);
    WebElement ele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[2]/div/div[2]/div[1]/label"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        Thread.sleep (3000);
    WebElement reg = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[3]/div/div/div[2]/div[3]/div[2]/ul/li[3]/label"));
        executor.executeScript("arguments[0].click();", reg);
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[5]/div[4]/div/div/div[1]/div/input[2]")).sendKeys("20");
    driver.findElement(By.xpath("//*[@id=\"volumeBlock\"]/div/div/div/div/input[2]")).sendKeys("3");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[5]/div[7]/div/div/div/input[2]")).sendKeys("200000");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[5]/div[8]/div/div/div/input[2]")).sendKeys("4");
    WebElement col = driver.findElement(By.xpath("//*[@id=\"select_color\"]/a"));
        executor.executeScript("arguments[0].click();", col);
    WebElement black = driver.findElement(By.xpath("//*[@id=\"select_color\"]/div/label[2]"));
        executor.executeScript("arguments[0].click();", black);
    WebElement asc = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[6]/div[1]/div/div/label[2]"));
        executor.executeScript("arguments[0].click();", asc);
    WebElement hours = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[6]/div[2]/div/div/label[5]"));
        executor.executeScript("arguments[0].click();", hours);
    WebElement sold = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[6]/div[3]/div/div/label[2]"));
        executor.executeScript("arguments[0].click();", sold);
    WebElement photo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/section[6]/div[6]/div/ul/li[1]/label"));
        executor.executeScript("arguments[0].click();", photo);
        }

    @When("^User clicks Search button$")
    public void userClicksSearchButton() throws  Throwable {
    Thread.sleep(3000);
    WebElement search = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/form/div[6]/div/div/button"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", search);
    }

    @Then("^User should be able to open a page of one car$")
    public void userShouldBeAbleToOpenAPageOfOneCar() throws  Throwable {
    Thread.sleep(7000);
    driver.findElement(By.xpath("//*[@id=\"searchResults\"]/section[1]/div[4]/div[2]/div[1]/div/a/span")).click();
    }
}
