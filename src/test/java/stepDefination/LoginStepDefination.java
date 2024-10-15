package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefination {
	
   static WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	   WebDriverManager.chromedriver().setup(); // This will download and setup the appropriate ChromeDriver version
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.saucedemo.com/");
	}

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@And("Click on login Button")
	public void click_on_login_button() {
	   driver.findElement(By.id("login-button")).click();
	}

	@Then("User is navigate to Home page")
	public void user_is_navigate_to_home_page() {
	   String expectedTitle = "Swag Labs";
	   String actualTitle = driver.getTitle();
	   Assert.assertEquals(actualTitle, expectedTitle);
	}

	@And("close the browser")
	public void close_the_browser() {
	   driver.close();
	}
}
