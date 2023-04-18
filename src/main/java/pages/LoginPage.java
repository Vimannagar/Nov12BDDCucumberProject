package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='nav-cart']")
	private WebElement carticon;

	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	private WebElement hoverelement;

	@FindBy(xpath = "//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']")
	private WebElement signinbutton;

	@FindBy(xpath = "//*[@id='ap_email']")
	private WebElement emailtextbox;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebutton;

	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement passwordtextfield;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement finalsignin;
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean verifyCartIcon()
	{
		boolean isdisplay = carticon.isDisplayed();
		
		return isdisplay;
			
	}
	
	public void enterUsername(String uname) 
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(hoverelement).perform();
		
		signinbutton.click();
		
		emailtextbox.sendKeys(uname);
		
		continuebutton.click();
		
	}
	
	
	public void enterPassword(String pwd)
	{
		passwordtextfield.sendKeys(pwd);
	}
	
	
	public void finalSignin()
	{
		finalsignin.click();
	}
	
	public String getTitleOfpage()
	{
		String title = driver.getTitle();
		
		return title;
	}

}
