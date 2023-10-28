package package_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TecovasPage_Registration {
	WebDriver driver;

	@FindBy(xpath="/html/body/header/nav/div[1]/div[3]/div[2]/button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"modal-content\"]/div/div/div/button[2]")
	WebElement registration ;
	
	@FindBy(xpath="//*[@id=\"tecovasInput-first-name-default-input-id\"]")
	WebElement firstName ;
	
	@FindBy(xpath="//*[@id=\"tecovasInput-last-name-default-input-id\"]")
	WebElement secondName;
	
	@FindBy(xpath="//*[@id=\"tecovasInput-email-address-default-input-id\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"tecovasInput-password-default-input-id\"]")
	WebElement password ;
	
	@FindBy(xpath="//*[@id=\"tecovasInput-confirm-password-default-input-id\"]")
	WebElement confirmPassword;
	
	@FindBy(xpath="//*[@id=\"modal-content\"]/div/div/div/div[7]/button")
	WebElement iAgree;
	
	@FindBy(xpath="//*[@id=\"modal-content\"]/div/div/div/div[9]/button")
	WebElement createAnAccount;
	
	public TecovasPage_Registration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void registration_and_Login() throws Exception
	{
		login.click();
		Thread.sleep(500);
		registration.click();
		Thread.sleep(500);
		firstName.sendKeys("Alex");
		Thread.sleep(500);
		secondName.sendKeys("Jacob");
		Thread.sleep(500);
		email.sendKeys("ajbitest20@gmail.com");
		Thread.sleep(500);
		password.sendKeys("rr@#$%!@#123rfff4");
		Thread.sleep(500);
		confirmPassword.sendKeys("rr@#$%!@#123rfff4");
		Thread.sleep(500);
		iAgree.click();
		Thread.sleep(500);
		createAnAccount.click();
		Thread.sleep(500);
	}
}
