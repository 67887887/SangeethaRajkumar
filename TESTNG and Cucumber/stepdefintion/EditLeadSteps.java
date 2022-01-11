package stepdefintion;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadSteps extends BaseClass{
	
	@Given("Click on {string} Button")
	public void click_on_button(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	   
	}
	@Given("Click on NameandID tab")
	public void click_on_nameand_id_tab() {
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
	   
	}
	@Then("Enter the name as {string}")
	public void enter_the_name_as(String fname) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fname);
	    
	}
	@When("Click on FindLeads button")
	public void click_on_find_leads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Given("Click on firstResulting name")
	public void click_on_first_resulting_name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();

	   
	}
	@Then("Get the Title of page")
	public void get_the_title_of_page() {
		String titleName = driver.getTitle();
		System.out.println("Title : " + titleName);

	}
	@Then("Click on Edit button")
	public void click_on_edit_button() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
	}
	@Then("Clear the companyname")
	public void clear_the_companyname() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		

}
	@Then("Enter the NewCompanyName to be added {string}")
	public void enter_the_new_company_name_to_be_added(String cName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
		
}
	@When("Click on Submit Button")
	public void click_on_submit_button() {
		driver.findElement(By.className("smallSubmit")).click();
}

	@And("Verify the updated companyName {string}")
	public void verify_updated_company_name(String newCompanyName) {
		String updatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String replaceAll = updatedCompanyName.replaceAll("[^A-Za-z]", "");
		
		Assert.assertEquals(replaceAll,newCompanyName);
		System.out.println("Updated Sucessfully");
			
		
}


}
