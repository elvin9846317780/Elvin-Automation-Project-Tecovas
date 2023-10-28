package package_page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TecovasPage_editMyInfo {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div[2]/div[1]/div[1]/a[2]/div")
	WebElement myInfo;
	
	@FindBy(xpath="//input[@placeholder=\"MOBILE NUMBER (OPTIONAL)\"]")
	WebElement mobileField ;

	@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div[2]/div[2]/div[1]/div/div[5]/button")
	WebElement saveDetails;
	
	public TecovasPage_editMyInfo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void editMyInfo() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		myInfo.click();
		Thread.sleep(500);
		
		mobileField.sendKeys("+1 404-658-8089");
		Thread.sleep(500);
		saveDetails.click();
		Thread.sleep(500);	
	}
	
}
