package org.stepdefinitionfile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLogin {

	public WebDriver driver;
	@Given("Launch the url into the Browser")
	public void launch_the_url_into_the_browser() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    String title = driver.getTitle();
	    System.out.println(title);
	}

	@When("To pass valid username {string} into Email Field")
	public void to_pass_valid_username_into_email_field(String string) {
	    driver.findElement(By.id("email")).sendKeys(string);
	}

	@When("To pass valid password {string} into password Field")
	public void to_pass_valid_password_into_password_field(String string) {
	    driver.findElement(By.id("pass")).sendKeys(string);
	}

	@When("To Click the Login Button")
	public void to_click_the_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginBtn);
	    
	}

	@Then("Close the Browser")
	public void close_the_browser() {
	    
	}

	
	
}
