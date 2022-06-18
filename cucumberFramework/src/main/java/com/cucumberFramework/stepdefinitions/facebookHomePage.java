package com.cucumberFramework.stepdefinitions;


import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.facebookHomePageRepo;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class facebookHomePage extends TestBase{
	
	facebookHomePageRepo fhpr = new facebookHomePageRepo(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	
	@And("^user post status as \"([^\"]*)\"$")
	public void user_post_status_as(String post) throws Throwable{
		waitHelper.WaitForElement(fhpr.facebookLogo, 60);
		fhpr.facebookLogo.click();
		waitHelper.WaitForElement(fhpr.status, 60);
		fhpr.status.click();
		waitHelper.WaitForElement(fhpr.statusBox, 60);
		fhpr.statusBox.sendKeys(post);
		fhpr.postBtn.click();
		Thread.sleep(5000);
	//	waitHelper.WaitForElement(fhpr.createStory, 60);
	}
	
	
	@Then("^close the driver$")
	public void close_the_driver() {
		driver.quit();
	}

}