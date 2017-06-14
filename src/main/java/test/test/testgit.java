package test.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testgit 
{
	WebDriver driver;
	@BeforeTest
	public void browserlaunch()
	{
	driver = new FirefoxDriver();
	driver.get("http://testingsite.clicsource.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='top']/div[1]/div[1]/header/div[1]/div[2]/span[2]/a")).click();
		System.out.println("Clicked on Testerlogin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div/div/div/form/div[1]/div/input")).sendKeys("uma");
		Thread.sleep(1000);
		System.out.println("Entered text in username");
		driver.findElement(By.xpath("/html/body/section/div/div/div/form/div[2]/div/input")).sendKeys("Infotree@1");
		Thread.sleep(1000);
		System.out.println("Entered password");
		driver.findElement(By.xpath("/html/body/section/div/div/div/form/div[3]/button")).click();
		Thread.sleep(5000);
		System.out.println("Clicked on Loginbutton");
	    assertEquals("Uma",driver.findElement(By.xpath("/html/body/header/nav/div/ul/li/a/span/span")).getText());
	    System.out.println("Logined as Uma Tester role");
	    
	}

	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	

}
