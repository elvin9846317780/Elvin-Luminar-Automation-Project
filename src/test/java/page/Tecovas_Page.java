package page;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	public class Tecovas_Page {

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

		@FindBy(xpath="/html/body/header/nav/div[1]/div[3]/div[2]/button")
		WebElement Account;
		
		@FindBy(xpath="/html/body/header/nav/div[5]/button")
		WebElement logout;
		
		@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div[2]/div[1]/div[1]/a[2]/div")
		WebElement myInfo;
		
		@FindBy(xpath="//input[@placeholder=\"MOBILE NUMBER (OPTIONAL)\"]")
		WebElement mobileField ;

		@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/div[2]/div[2]/div[1]/div/div[5]/button")
		WebElement saveDetails;
		
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

		@FindBy(xpath="//header/nav[1]/div[1]/div[2]/a[3]/div[1]/div[1]")
		WebElement explore;

		@FindBy(xpath="//header/nav[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]/p[2]")
		WebElement exoticsCollection ;

		@FindBy(xpath="//body/main[@id='mainContent']/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]")
		WebElement Boot1 ;
		
		@FindBy(xpath="//body/main[@id='mainContent']/div[1]/div[1]/div[2]/div[5]/div[2]/button[7]")
		WebElement BootSize ;

		@FindBy(xpath="/html/body/main/div[1]/div[1]/div[2]/div[5]/div[3]/button[1]/p")
		WebElement BootWidth ;
		
		@FindBy(xpath="//button[@aria-label=\"View your cart\"]")
		WebElement cart;
		
		@FindBy(xpath="//a[contains(text(),'Our Stories')]")
		WebElement ourStories;

		@FindBy(xpath="//a[@href=\"/blog/the-women-of-alderspring-ranch\"]")
		WebElement readMore ;



		
		public Tecovas_Page(WebDriver driver)
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
			firstName.sendKeys("Georgie");
			Thread.sleep(500);
			secondName.sendKeys("Bailiey");
			Thread.sleep(500);
			email.sendKeys("gbyitest20@gmail.com");
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
		
		public void editMyInfo() throws Exception
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			myInfo.click();
			Thread.sleep(500);
			
			mobileField.sendKeys("+1 404-756-95g89");
			Thread.sleep(500);
			saveDetails.click();
			Thread.sleep(500);	
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
		
		public void mousehover_Explore() throws Exception
		{
			 
			Actions act = new Actions(driver);
	        Thread.sleep(6000);
	        act.moveToElement(explore).perform();
	        Thread.sleep(500);
	        exoticsCollection.click();
	        Thread.sleep(2500);
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
		
		public void ourStories() throws Exception 
		{
	    	ourStories.click();
	    	Thread.sleep(1000);
	    	readMore.click();
	    	Thread.sleep(1000);
			
		}
		
		public void cart() throws Exception
		{
			Thread.sleep(500);
	    	driver.findElement(By.xpath("//button[@aria-label=\"View your cart\"]")).click();
		}
		
		public void test()
		{
			
		}
	}
