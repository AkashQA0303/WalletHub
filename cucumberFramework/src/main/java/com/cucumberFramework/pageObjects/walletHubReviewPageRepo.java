package com.cucumberFramework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class walletHubReviewPageRepo {
	
	private WebDriver driver;
	
	@FindBy(xpath="//*[@class='wrev-drp']")
	public WebElement dropDown;
	
	@FindBy(xpath="//li[contains(text(),'Health Insurance')]")
	public WebElement selectValue;
	
	@FindBy(xpath="//*[@class='android textarea-user']/textarea")
	public WebElement reviewTxtBox;
	
	@FindBy(xpath="//*[contains(text(),'Submit')]")
	public WebElement submitBtn;
	
	
	public WebElement optionSelection(String option) {
		String xpath="//li[contains(text(),'"+option+"')]";
		System.out.println(xpath);
	    WebElement starXpath=driver.findElement(By.xpath(xpath));
		return starXpath;
	}
	
	
	WaitHelper waitHelper;
	
	public walletHubReviewPageRepo(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
}
