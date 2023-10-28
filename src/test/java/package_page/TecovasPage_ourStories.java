package package_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TecovasPage_ourStories {
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Our Stories')]")
	WebElement ourStories;

	@FindBy(xpath="//a[@href=\"/blog/the-women-of-alderspring-ranch\"]")
	WebElement readMore ;
	public TecovasPage_ourStories(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void ourStories() throws Exception 
	{
    	ourStories.click();
    	Thread.sleep(1000);
    	readMore.click();
    	Thread.sleep(1000);
		
	}
}
