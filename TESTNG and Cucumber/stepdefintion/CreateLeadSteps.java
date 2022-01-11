package stepdefintion;

import org.openqa.selenium.By;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps extends BaseClass{
	
	@Given("Enter the username as {string}")
	public void enter_the_username_as_demo_sales_manager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage Click")
	public void homepage_should_be_displayed() {
		driver.findElement(By.linkText("CRM/SFA")).click(); 
	
	}
	
	@But("ErrorMessage should be displayed")
	public void ErrorMessage() {
			System.out.println("Error Message is displayed");
		
	}
	
	@Given("click Create Lead button")
	public void click_lead_button() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Enter the company name as {string}")
	public void enter_the_company_name_as(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	
	@Given("Enter first name as {string}")
	public void enter_first_name_as(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName); 
	}
	
	@Given("Enter last name as {string}")
	public void enter_last_name_as(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	
	@When("Click Submit Button")
	public void click_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}


}
