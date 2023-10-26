package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Tecovas_Page;


public class Tecovas_Test {
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
		Tecovas_Page obj = new Tecovas_Page(driver);
		
		obj.registration_and_Login();
		obj.editMyInfo();
		obj.shirtToCart();
		obj.mousehover_Explore();
		obj.bootToCart();
		obj.ourStories();
		obj.cart();
	}

}
