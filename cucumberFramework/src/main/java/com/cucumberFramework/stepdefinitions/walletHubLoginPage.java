package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.walletHubLoginPageRepo;
import com.cucumberFramework.pageObjects.wallethubHomePageRepo;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class walletHubLoginPage extends TestBase {
	
	WaitHelper waitHelper = new WaitHelper(driver);
	wallethubHomePageRepo whpr=new wallethubHomePageRepo(driver);
	walletHubLoginPageRepo wlpr= new walletHubLoginPageRepo(driver);
	
	@Given("^user navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String url) throws Throwable {
	    driver.get(url);	
	    waitHelper.WaitForElement(whpr.star, 60);
	}
	
	
	@Then("^user switch to Login screen$")
	public void user_switch_to_Login_screen() {
		waitHelper.WaitForElement(wlpr.switchTab, 60);
		wlpr.switchTab.click();
		waitHelper.WaitForElement(wlpr.email, 60);
	}
	
	
	@And("^user enter username \"([^\"]*)\"$")
	public void user_enter_username(String username) {
		wlpr.email.sendKeys(username);
	}
	
	@And("^user enter password \"([^\"]*)\"$")
	public void user_enter_password(String password) {
		wlpr.password.sendKeys(password);
	}

	@And("^click on Login button")
	public void click_on_Login_button(){
		wlpr.loginBtn.click();
		waitHelper.WaitForElement(whpr.yourReview, 60);
	}

}
