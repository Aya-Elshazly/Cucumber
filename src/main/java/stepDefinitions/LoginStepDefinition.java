package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	 WebDriver driver; 
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
	 System.setProperty("webdriver.chrome.driver","E:\\Automation sources\\chromedriver.exe");
     driver = new ChromeDriver();
	 driver.get("https://www.freecrm.com/index.html");
	 }
	 
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	 }
	 
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 WebElement loginBtn =
	 driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com']"));
	 loginBtn.click();
	 }
	 
	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password(){
	 driver.findElement(By.name("email")).sendKeys("aya.elshazly3@gmail.com");
	 driver.findElement(By.name("password")).sendKeys("P@$$w0rd123");
	 }
	 
	 @Then("^user clicks on login$")
	 public void user_clicks_on_login() {
	 WebElement login =
	 driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
	 login.click();
	 }
	 
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("Cogmento CRM", title);
	 }
	 
	

}
