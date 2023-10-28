package package_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import package_page.TecovasPage_Registration;
import package_page.TecovasPage_bootToCart;
import package_page.TecovasPage_cart;
import package_page.TecovasPage_editMyInfo;
import package_page.TecovasPage_mousehoverExplore;
import package_page.TecovasPage_ourStories;
import package_page.TecovasPage_shirtToCart;

public class Test_tecovas {
WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.tecovas.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() throws Exception
	{
		TecovasPage_Registration ob1 = new TecovasPage_Registration(driver);
		ob1.registration_and_Login();
		
		TecovasPage_editMyInfo ob2 = new TecovasPage_editMyInfo(driver);
		ob2.editMyInfo();
		
		TecovasPage_shirtToCart ob3 = new TecovasPage_shirtToCart(driver);
		ob3.shirtToCart();
		
		TecovasPage_mousehoverExplore ob4 = new TecovasPage_mousehoverExplore(driver);
		ob4.mousehover_Explore();
		
		TecovasPage_bootToCart ob5 = new TecovasPage_bootToCart(driver);
		ob5.bootToCart();
		
		TecovasPage_ourStories ob6 = new TecovasPage_ourStories(driver);
		ob6.ourStories();
		
		TecovasPage_cart ob7 = new TecovasPage_cart(driver);
		ob7.cart();
	}
}
