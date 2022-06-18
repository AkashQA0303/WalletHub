package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class facebookHomePageRepo {
	private WebDriver driver;
	
	
	@FindBy(xpath="(//*[@aria-label='Facebook'])[1]")
	public WebElement facebookLogo;
	
	@FindBy(xpath="//*[contains(text(),'on your mind')]")
	public WebElement status;
	
	
	@FindBy(xpath="//*[@role='textbox']")
	public WebElement statusBox;
	
	@FindBy(xpath="//*[@aria-label='Post']")
	public WebElement postBtn;
	
	@FindBy(xpath="//*[contains(text(),'Create story')]")
	public WebElement createStory;
	
	
	
	WaitHelper waitHelper;
	public facebookHomePageRepo(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	

}
