package stepdefintion;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadSteps extends BaseClass {

	String leadId;

	@Given("Click on CRM\\/SFA")
	public void click_on_crm_sfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@Given("Click on Leads Button")
	public void click_on_leads_button() {
		driver.findElement(By.linkText("Leads")).click();

	}

	@Given("Click on Find Leads")
	public void click_on_find_leads_tab() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}

	@Given("Click on phonenumber tab")
	public void click_on_phonenumber_tab_() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		

	}
	@Given("Enter the phoneNumber {string}")
	public void enter_the_phone_number(String phno) {
		
		driver.findElement(By.name("phoneNumber")).sendKeys(phno);

	}

	@Given("Click on Find Leads Button")
	public void click_on_find_leads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Given("Get the first resulting LeadId and click the firstName")
	public void get_the_first_resulting_lead_id_and_click_the_first_name() throws InterruptedException {
		Thread.sleep(1000);
		leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadId);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
	}

	@Given("Click on Delete button")
	public void click_on_delete_button() {
		driver.findElement(By.className("subMenuButtonDangerous")).click();
	}

	@Then("Click on FindLeads and Namea and ID")
	public void click_on_find_leads_and_namea_and_id() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();

	}

	@Then("Pass the captured LeadId")
	public void pass_the_captured_lead_id() {
		driver.findElement(By.name("id")).sendKeys(leadId);

	}

	@When("click on Find Leads button")
	public void click_on_find_leads() {
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

}
