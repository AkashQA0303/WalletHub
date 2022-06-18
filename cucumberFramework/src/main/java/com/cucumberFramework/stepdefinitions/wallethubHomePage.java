package com.cucumberFramework.stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.walletHubLoginPageRepo;
import com.cucumberFramework.pageObjects.walletHubReviewPageRepo;
import com.cucumberFramework.pageObjects.wallethubHomePageRepo;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class wallethubHomePage extends TestBase {
	
	WaitHelper waitHelper = new WaitHelper(driver);
	wallethubHomePageRepo whpr= new wallethubHomePageRepo(driver);
	Actions actions= new Actions(driver); 
	walletHubReviewPageRepo wrpr= new walletHubReviewPageRepo(driver);
	walletHubLoginPageRepo wlpr=new walletHubLoginPageRepo(driver);
	
	@When("^user hover over \"([^\"]*)\" star$")
	public void user_hover_over_star(String star) throws Throwable {
		//Using dynamic value for star
	    actions.moveToElement(whpr.StarSelecttion(star)).perform();
	    Thread.sleep(2000); // just to demonstrate hover is working
	    
	}

	
	@And("^click on \"([^\"]*)\" star$")
	public void click_on_star(String star) throws Throwable {
		whpr.StarSelecttion(star).click();
		waitHelper.WaitForElement(wrpr.submitBtn, 60);
		
	}
	
	
	@Then("^verify review is present$")
	public void verify_review_is_present() throws Throwable {
		int count=0;
	    List<WebElement> review =whpr.reviewList;
	    for(int i=1;i<review.size();i++) {
	    	String xpath1="//*[@class='rvtab-content']/article["+i+"]/div[2]/div[2]/span[2]";
	    	WebElement ele=driver.findElement(By.xpath(xpath1));
	    	String expectedEmail=ele.getText();
	    	if(expectedEmail.equalsIgnoreCase("akash@750013@gmail.com")){
	    		count++;
	    	}
	    	
	    	if(count < 0) {
	    		Assert.fail("Review not posted");
	    	}
	    	
	    }
	}
}



