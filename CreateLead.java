package assigments.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa"); 
		driver.findElement(By.className("decorativeSubmit")).click(); 
		driver.findElement(By.linkText("CRM/SFA")).click(); 
		driver.findElement(By.linkText("Leads")).click();  
		driver.findElement(By.linkText("Create Lead")).click(); 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hcl Technologies"); 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeetha"); 
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajkumar"); 
		driver.findElement(By.name("birthDate")).sendKeys("12/26/91"); 
		

		//-->Contact Information
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("C413"); 
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("C5"); 
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9999762563"); 
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0421"); 
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Sangeetha"); 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Sangee@gmail.com"); 
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.dot.com/"); 
		
		// -->Primary Address
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sangeetha"); 
				driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Rajkumar"); 
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Provident CosmoCity"); 
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Pudhupakkam"); 
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai"); 
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("C7842"); 
				driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("05467"); 
				
				//Creating dropdown in Primary address
				
				WebElement stateProvisionDropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select selectProvision=new Select(stateProvisionDropdown);
				selectProvision.selectByVisibleText("Guam");
				
				// Creating Dropdown for country
				
				WebElement elementDropdownCountry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				Select selectCountry = new Select(elementDropdownCountry);
				selectCountry.selectByVisibleText("India"); 
				driver.findElement(By.name("submitButton")).click();

				
				String title = driver.getTitle();
				System.out.println("Title of the web page :" + title);
				System.out.println(System.getProperty("webdriver.chrome.driver"));

				// Get first Name and Print
				String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
				System.out.println("First Name : " + firstName);

				driver.close(); 
				
				
	}

}
