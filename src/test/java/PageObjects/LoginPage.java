package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By userNameField = By.name("username");
	By passwordField = By.name("password");
	By loginButton = By.xpath("//button[normalize-space()='Login']");
	By errMessage = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
	
	public void enterUsername(String username) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement usernameF = 
				wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField)).sendKeys(username);;
		//usernameF.sendKeys(username);
		 
   }

   public void enterPassword(String password) {
       driver.findElement(passwordField).sendKeys(password);
   }

   public void clickLoginButton() {
       driver.findElement(loginButton).click();
   }
   
   public String getErrorMessage() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   String msg = wait.until(ExpectedConditions.visibilityOfElementLocated(errMessage)).getText();
	   return msg;
   }

}
