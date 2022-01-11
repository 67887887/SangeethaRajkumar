package stepdefintion;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLeadSteps extends BaseClass {

	@Given("Click on {string} Button")
	public void click_on_button(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}

	@Given("Click on phonenumber tab")
	public void click_on_phonenumber_tab_() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}

	@When("Enter the phone Number {string}")
	public void enter_the_phone_number(String phno) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
	}

	@When("Click on Find Lead Button")
	public void click_on_find_lead_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@When("Get the first resulting Result")
	public void get_the_first_resulting_result() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}

}
