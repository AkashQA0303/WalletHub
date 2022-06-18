package com.cucumberFramework.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class wallethubHomePageRepo {
	
	private WebDriver driver;
	
	@FindBy(xpath="//*[@aria-label='4 star rating' and @role='radio']")
	public WebElement star;
	
	@FindBy(xpath="//*[@class='rvtab-content']/article[1]/div[2]/div[2]/span[2]")
	public WebElement verifyPost;
	
	@FindBy(xpath="//*[@class='rvtab-content']/article")
	public List<WebElement> reviewList;
	
	
	@FindBy(xpath="//*[text()=' Your Review']")
	public WebElement yourReview;
	 
	
	WaitHelper waitHelper;
	
	
	public WebElement StarSelecttion(String star) {
		String xpath="//*[@aria-label='" + star + " star rating' and @role='radio']";
	//	System.out.println(xpath);
	    WebElement starXpath=driver.findElement(By.xpath(xpath));
		return starXpath;
		
	}
	
	public wallethubHomePageRepo(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	


}
