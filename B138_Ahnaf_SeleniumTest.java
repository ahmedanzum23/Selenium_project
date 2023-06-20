package batch7project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.chrome.ChromeDriver;





import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)) ; 
		driver.manage().window().maximize() ;
		//driver.manage().window().minimize() ;
		
		//Thread.sleep(1000); 
		
		//implicit wait
		
		
		//log-in
		driver.findElement(By.id("user-name")).sendKeys("standard_user") ;
		Thread.sleep(3000); 
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000); 
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(3000); 
		
		
		
		//Add to cart
		
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000); 
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);
		
		
		//checkout
		
		driver.findElement(By.id("first-name")).sendKeys("a") ;
		Thread.sleep(3000); 
		driver.findElement(By.id("last-name")).sendKeys("b");
		Thread.sleep(3000); 
		
		driver.findElement(By.id("postal-code")).sendKeys("1234");
		Thread.sleep(3000); 
		
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000); 
		
		driver.findElement(By.id("finish")).click();
		Thread.sleep(3000); 
		
		//log-out
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(5000); 
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
		
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)) ;  
		
		
		//driver.close();
		//driver.quit();
		 
	}

}
