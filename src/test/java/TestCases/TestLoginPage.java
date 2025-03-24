package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.BaseTest;
import PageObjects.LoginPage;

public class TestLoginPage extends BaseTest {

	@Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();

        // Verify successful login (e.g., redirected to home page or successful message)
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertTrue(actualTitle.contains("OrangeHRM"), "Expected title to contain 'OrangeHRM', but found: " + actualTitle);;
    }
	
	@Test
	public void testInvalidLogin() {
		LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin1234");
        loginPage.clickLoginButton();
        String errMessage = loginPage.getErrorMessage();
        System.out.println(errMessage);
        Assert.assertEquals(errMessage, "Invalid credentials");
        
	}

}



