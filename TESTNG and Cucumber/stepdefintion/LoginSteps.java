package stepdefintion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseClass {

	@Given("Enter the UserName as {string}")
	public void enter_the_username_as_demo_sales_manager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the Password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage Should be Displayed")
	public void homepage_should_be_displayed() {
		driver.findElement(By.linkText("CRM/SFA")).click(); 
	
	}
	
	@But("ErrorMessage Should be Displayed")
	public void ErrorMessage() {
			System.out.println("Invalid UserName and Password");
		
	}
}
	