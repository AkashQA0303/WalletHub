package com.cucumberFramework.stepdefinitions;


import org.testng.Assert;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.facebookHomePageRepo;
import com.cucumberFramework.pageObjects.facebookLoginRepo;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class facebookLogin extends TestBase{
	
	facebookLoginRepo loginPage = new facebookLoginRepo(driver);
	facebookHomePageRepo fhpr = new facebookHomePageRepo(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^user is on the Login page URL \"([^\"]*)\"$")
	public void user_is_on_the_Login_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@When("^user enter username as \"([^\"]*)\"$")
	public void user_enter_username_as(String emailID) throws Throwable{
		waitHelper.WaitForElement(loginPage.emailID, 60);
		loginPage.emailID.sendKeys(emailID);
	}
	
	@Then("^user enter password as \"([^\"]*)\"$")
	public void enter_password_as(String password) throws Throwable{
		loginPage.Password.sendKeys(password);
	}
	
	@And("^click on login button")
	public void click_on_login_button() throws Throwable{
		loginPage.LogInBtn.click();
	}
	
	
	@Then("^user logged in")
	public void user_logged_in() throws Throwable{
		waitHelper.WaitForElement(fhpr.facebookLogo, 60);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals("https://www.facebook.com/?sk=welcome", "https://www.facebook.com/?sk=welcome");
	}
	
	
	

	
}
