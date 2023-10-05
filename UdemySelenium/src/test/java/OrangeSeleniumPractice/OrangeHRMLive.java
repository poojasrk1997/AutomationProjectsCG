package OrangeSeleniumPractice;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLive {
	
	public static void main(String[] args) throws InterruptedException  {
	
	WebDriverManager.chromedriver().setup();

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	//Login functionality
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
	//Admin functionality
	driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Pooja");
	
	
	List<WebElement> ls=driver.findElements(By.xpath("(//div[@class='oxd-select-text'])"));
	System.out.println(ls);
//	ls.get(0).click();
	
	
	
	
	
	
}
}

