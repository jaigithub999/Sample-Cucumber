package org.stepdefinitionclass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepsdefinition {
	public WebDriver driver;

	// There were undefined steps. You can implement missing steps with the snippets
	// below:

	@Given("user launch application")
	public void user_launch_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http:www.facebook.com");

	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("nisha");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("nisha@321");
	}

	@When("user click login button")
	public void user_click_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

	@Then("user navigate to incorrect credential page")
	public void user_navigate_to_incorrect_credential_page() {
		WebElement error = driver
				.findElement(By.xpath("//div[text()=\"The password that you've entered is incorrect. \"]"));
		Assert.assertTrue(error.isDisplayed());
	}

	@Given("user launch application fb")
	public void user_launch_application_fb() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http:www.facebook.com");
	}

	@When("user enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Nisha");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Nisha@321");
	}

	@When("user click fb login button")
	public void user_click_fb_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

	@Then("user navigate to incorrect credential page with error message")
	public void user_navigate_to_incorrect_credential_page_with_error_message() {
		WebElement error = driver
				.findElement(By.xpath("//div[text()=\"The password that you've entered is incorrect. \"]"));
		Assert.assertTrue(error.isDisplayed());
	}

}
