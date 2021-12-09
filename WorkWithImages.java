package week2.weekdayass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithImages {
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@ src='../images/home.png']")).click();
		driver.navigate().to("http://leafground.com/pages/Image.html");
	    String brokenText = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']")).getText();
		System.out.println(brokenText);
		if(brokenText.equals(driver.findElement(By.xpath("//label[text()='Am I Broken Image?']")).getText()))
		{
			System.out.println("Yes u are broken");
			
		}
		else 
		{
			System.out.println("You are not Broken");
		}
		}
		
	}	

