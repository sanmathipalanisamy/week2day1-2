package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	private static By drive;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("CreateLeadForm_CompanyName")).sendKeys("TCS");
		driver.findElement(By.id("CreateLeadForm_firstName")).sendKeys("SANMATHI");
		driver.findElement(By.id("CreateLeadForm_lastName")).sendKeys("PALANISAMY");
		driver.findElement(By.id("CreateLeadForm_firstNameLocal")).sendKeys("san");
		driver.findElement(By.name("CreateLeadForm_departmentName")).sendKeys("Testing department");
		driver.findElement(By.name("CreateLeadForm_description")).sendKeys("TESTLEAF PLATFORM");
		driver.findElement(By.id("CreateLeadForm_primaryEmail")).sendKeys("sanmathisan@gmail.com");
		driver.findElement(By.className("submit")).click();
		String title=driver.getTitle();
		System.out.println(title);
				
		
	}

}
