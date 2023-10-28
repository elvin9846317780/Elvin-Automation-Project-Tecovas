package package_page;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TecovasPage_bootToCart {
	
	WebDriver driver;

	@FindBy(xpath="//body/main[@id='mainContent']/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement Boot1 ;
	
	@FindBy(xpath="//body/main[@id='mainContent']/div[1]/div[1]/div[2]/div[5]/div[2]/button[7]")
	WebElement BootSize ;

	@FindBy(xpath="/html/body/main/div[1]/div[1]/div[2]/div[5]/div[3]/button[1]/p")
	WebElement BootWidth ;
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div[1]/div[2]/div[6]/form/button")
	WebElement addToCart;
	
	public TecovasPage_bootToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void bootToCart() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Boot1.click();
        BootSize.click();
        JavascriptExecutor js = (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(500); 
        BootWidth.click();
        Thread.sleep(250);
        addToCart.click();
        Thread.sleep(10000);
	}
}
