package package_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TecovasPage_mousehoverExplore {

	WebDriver driver;
	@FindBy(xpath="//header/nav[1]/div[1]/div[2]/a[3]/div[1]/div[1]")
	WebElement explore;

	@FindBy(xpath="//header/nav[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/p[2]")
	WebElement exoticsCollection ;
	
	public TecovasPage_mousehoverExplore(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void mousehover_Explore() throws Exception
	{
		 
		Actions act = new Actions(driver);
        Thread.sleep(6000);
        act.moveToElement(explore).perform();
        Thread.sleep(500);
        exoticsCollection.click();
        Thread.sleep(2500);
	}
}
