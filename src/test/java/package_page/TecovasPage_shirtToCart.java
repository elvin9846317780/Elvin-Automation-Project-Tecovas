package package_page;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TecovasPage_shirtToCart {
	WebDriver driver;
	
	@FindBy(xpath="//button[@aria-label=\"Open the search bar\"]")
	WebElement searchIcon ;
	
	@FindBy(xpath="/html/body/header/nav/div[1]/div[3]/div[1]/div[1]/input")
	WebElement searchField;
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/a/div")
	WebElement shirt1;
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div[1]/div[2]/div[5]/div[2]/button[5]")
	WebElement shirtSize;

	@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div[1]/div[2]/div[6]/form/button")
	WebElement addToCart;

	
	public TecovasPage_shirtToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void shirtToCart() throws Exception
	{
		
        Thread.sleep(500);
        searchIcon.click();
        Thread.sleep(500);
        searchField.sendKeys("Shirt",Keys.ENTER);
        Thread.sleep(500);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		shirt1.click();
		shirtSize.click();
		addToCart.click();
		Thread.sleep(7000);
	}

}
