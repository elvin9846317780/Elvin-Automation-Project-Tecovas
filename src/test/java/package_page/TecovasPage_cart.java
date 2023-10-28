package package_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TecovasPage_cart {

	WebDriver driver;
	
	@FindBy(xpath="//button[@aria-label=\"View your cart\"]")
	WebElement cart;
	
	public TecovasPage_cart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void cart() throws Exception
	{
		Thread.sleep(500);
    	cart.click();
	}
	

}
