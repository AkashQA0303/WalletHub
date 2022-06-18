package com.cucumberFramework.stepdefinitions;

import org.testng.Assert;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.walletHubLoginPageRepo;
import com.cucumberFramework.pageObjects.walletHubReviewPageRepo;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class walletHubReviewPage extends TestBase{
	
	WaitHelper waitHelper = new WaitHelper(driver);
	walletHubReviewPageRepo wrpr= new walletHubReviewPageRepo(driver);
	walletHubLoginPageRepo wlpr=new walletHubLoginPageRepo(driver);
	
	@Then("^user landed on \"([^\"]*)\"$")
	public void user_landed_on(String expectedURL) throws Throwable {
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contentEquals(expectedURL));
	    
	}

	@When("^user selects \"([^\"]*)\" option from Policy dropdown$")
	public void user_selects_option_from_Policy_dropdown(String option) throws Throwable {
	    waitHelper.WaitForElement(wrpr.dropDown, 60);
	    wrpr.dropDown.click();
	    Thread.sleep(2000);
	    wrpr.optionSelection(option).click();
	    
	}

	@When("^user writes a review \"([^\"]*)\"$")
	public void user_writes_a_review(String review) throws Throwable {
	    char [] ch1=review.toCharArray();
	    System.out.println(ch1.length);
	    if(ch1.length < 130) {
	    	System.out.println("130 character minimum");
	    	Assert.fail();
	    }
	    else {
	    	wrpr.reviewTxtBox.click();
	    	wrpr.reviewTxtBox.sendKeys(review);
	    }
	}

	@When("^click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
	    wrpr.submitBtn.click();
	    waitHelper.WaitForElement(wlpr.loginBtn, 60);
	}

}
