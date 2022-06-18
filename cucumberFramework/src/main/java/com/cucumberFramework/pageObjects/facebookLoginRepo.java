package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class facebookLoginRepo {
	
private WebDriver driver;
	
	@FindBy(xpath="//*[@name='email']")
	public WebElement emailID;
	
	@FindBy(xpath="//*[@name='pass']")
	public WebElement Password;
	
	
	@FindBy(xpath="//*[@name='login']")
	public WebElement LogInBtn;
	
	@FindBy(xpath="//*[contains(text(),'Forgot password')]")
	public WebElement ForgetPassword;
	
	@FindBy(xpath="//*[contains(text(),'Create new account')]")
	public WebElement CreateNewAccountBtn;
	
	
	WaitHelper waitHelper;
	
	public facebookLoginRepo(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	

	
}
