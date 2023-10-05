package testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	private WebDriver driver;
	
	//By locators: Object repository
	
	private By username=By.name("username");
	private By password=By.name("password");
	private By click=By.xpath("//button[@type=\"submit\"]");
	
	//Creating Constructor
	
	private loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Page Action Methods
	
	public void Username(String Username)
	{
		driver.findElement(username).sendKeys(Username);
	}
	
	public void Password(String Password)
	{
		driver.findElement(password).sendKeys(Password);
	}
	
	
	
		
	

}
