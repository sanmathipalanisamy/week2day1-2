package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	 private static String name;
	private static String id;

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(3000));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("san");
		driver.findElement(By.name("lastname")).sendKeys("p");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9363501800");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("san@16");
        
        WebElement Day=driver.findElement(By.id("day"));
        Select date = new Select(Day);
        date.selectByIndex(0);
        
        WebElement Month=driver.findElement(By.id("month"));
        Select  op = new Select(Month);
        op.selectByVisibleText("aug");
        
        WebElement Year=driver.findElement(By.id("year"));
        Select  op1 = new Select(Year);
        op1.selectByVisibleText("1996");
        
        driver.findElement(By.xpath("//input[@name='sex']) [1]")).clear();
        driver.findElement(By.name("websubmit")).click();
        
        
        
        
        
        
        
        
        
        
        
				
		
	}

}
