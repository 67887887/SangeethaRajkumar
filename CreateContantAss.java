package week2.weekdayass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContantAss {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sangeetha");
		driver.findElement(By.id("lastNameField")).sendKeys("Rajkumar");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Sangee");
		driver.findElement(By.name("lastNameLocal")).sendKeys("Raj");
		driver.findElement(By.name("description")).sendKeys("The entered details are good");
		driver.findElement(By.name("departmentName")).sendKeys("Computer Science");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sangee@gmail.com");

		// Creating dropdown in Primary address

		WebElement stateProvisionDropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select selectProvision = new Select(stateProvisionDropdown);
		selectProvision.selectByVisibleText("Guam");

		driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("This is very Important");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String titleName = driver.getTitle();
		System.out.println("Title : " + titleName);

	}

}
