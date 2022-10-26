package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SANMATHI");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("PALANISAMY");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("san");
		driver.findElement(By.name("createLeadForm_departmentName")).sendKeys("Testing department");
		driver.findElement(By.name("createLeadForm_description")).sendKeys("TESTLEAF PLATFORM");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sanmathisan@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("CreateLeadForm_CompanyName")).clear();
		driver.findElement(By.id("CreateLeadForm_CompanyName")).sendKeys("TEST LEAF");
		driver.findElement(By.id("CreateLeadForm_firstName")).sendKeys("SANMATHI MONIKA");
		driver.findElement(By.id("CreateLeadForm_firstName")).clear();
		driver.findElement(By.id("CreateLeadForm_lastName")).sendKeys("PALANISAMY");
		driver.findElement(By.id("CreateLeadForm_firstNameLocal")).sendKeys("sai");
		driver.findElement(By.className("submit")).click();
		String title1=driver.getTitle();
		System.out.println(title1);	
		
		
		
		
		

	}

}
