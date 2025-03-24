package PageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = WebDriverManagerUtil.getDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();		
	}

}
