package week2.weekdayass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();

		cd.get("http://leaftaps.com/opentaps/");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = cd.getTitle();
		System.out.println(title);
		cd.findElement(By.id("username")).sendKeys("DemoSalesManager");
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Leads")).click();
		cd.findElement(By.linkText("Find Leads")).click();
		cd.findElement(By.xpath("//span[text()='Name and ID']")).click();
		Thread.sleep(1000);
		cd.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sangeetha");
		cd.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		cd.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		String titleName = cd.getTitle();
		System.out.println("Title : " + titleName);
		cd.findElement(By.xpath("//a[text()='Edit']")).click();
		cd.findElement(By.id("updateLeadForm_companyName")).clear();
		cd.findElement(By.id("updateLeadForm_companyName")).sendKeys("Capgemini");
		cd.findElement(By.className("smallSubmit")).click();
		cd.close();

	}

}
