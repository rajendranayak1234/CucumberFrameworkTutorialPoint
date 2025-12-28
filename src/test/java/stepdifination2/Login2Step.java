package stepdifination2;

import org.openqa.selenium.WebDriver;

import Page1.Login1Page;
import factory2.DriverFactory2;
import io.cucumber.java.en.*;

public class Login2Step {
	//tested comment detail added
	WebDriver driver;
	public Login1Page lp;
	@Given("User enter valid Username {string}")
	public void user_enter_valid_username(String Username) {
		driver=DriverFactory2.getDriver();
		lp=new Login1Page(driver);
	  lp.enterUserNameField(Username);  
	}

	@Given("User enter valid Password {string}")
	public void user_enter_valid_password(String Password) {
		lp.enterUserPasswordField(Password);
	    
	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
		lp.clickOnSignButton();
	    
	}


	
	
	
}
