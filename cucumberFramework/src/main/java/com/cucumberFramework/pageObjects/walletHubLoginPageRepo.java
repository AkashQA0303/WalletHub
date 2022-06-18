package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberFramework.helper.WaitHelper;

public class walletHubLoginPageRepo {
	
	private WebDriver driver;

	@FindBy(xpath="//*[text()='Login']")
	public WebElement switchTab;
	
	@FindBy(xpath="//*[@placeholder='Email Address']")
	public WebElement email;
	
	@FindBy(xpath="//*[@placeholder='Password']")
	public WebElement password;
	
	@FindBy(xpath="//*[@data-hm-tap='doSubmit($event);']")
	public WebElement loginBtn;
	
	@FindBy(xpath="//*[contains(@class,'signup-login')]")
	public WebElement Loginbtn;
	
	
	WaitHelper waitHelper;
	
	public walletHubLoginPageRepo(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	
}
