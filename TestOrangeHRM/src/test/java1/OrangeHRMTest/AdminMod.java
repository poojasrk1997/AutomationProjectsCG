package OrangeHRMTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminMod {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement wb1=driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']"));
		wb1.click();
//	    WebElement wb2=driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement userRole=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='oxd-select-wrapper")));
		userRole.click();
		
		//String  desiredOptionText="Admin";
		
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(//div[@role='listbox'] and )))
		
		
		
//		wb2.click();
//		wb2.sendKeys(Keys.ARROW_DOWN);
//		wb2.sendKeys(Keys.ENTER);
		
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='oxd-select-text-input'][(text()='Admin')]")));
	
		
//driver.close();
	}

}
