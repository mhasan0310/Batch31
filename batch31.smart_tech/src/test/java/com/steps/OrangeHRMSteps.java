package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.OrangeHRMPages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class OrangeHRMSteps {
	WebDriver driver;
	OrangeHRMPages pf; 
	
//	@Given ("User go to OrangeHRM demo home page")
//	public void user_go_to_orangehrm_demo_home_page() {
//		driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		pf = new OrangeHRMPages (driver);
//	}
//	
//	@When("User type the username in the username field")
//	public void user_type_the_username_in_the_username_field() throws InterruptedException {
//		Thread.sleep(3000);
//		//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
//		pf.getUsername().sendKeys("Admin");
//	}
//
//	@And("User click on the password field")
//	public void user_click_on_the_password_field() {
//		//driver.findElement(By.xpath("//*[@name='password']")).click();
//	    pf.getPassword().click();
//	}
//
//	@And("User type the password in the password field")
//	public void user_type_the_password_in_the_password_field() throws InterruptedException {
//	    Thread.sleep(1000);
//	    //driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
//	    pf.getPassword().sendKeys("admin123");
//	}
//
//	@Then("User click on the Login button")
//	public void user_click_on_the_login_button() throws InterruptedException {
//		//Thread.sleep(1000);
//		//driver.findElement(By.xpath("//*[@type='submit']")).click();
//	    pf.getLogin().click();   
//	}
//	
//	@And("User verify the text {string}")
//	public void user_verify_the_text(String expectedText) {
//		String expected = "Dashboard";
//		String actual= driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
//	    Assert.assertEquals("the word does not match", expected,actual);
//		
//		
//
//	}
	
	@Given("^User go to OrangeHRM demo home page$")
	public void user_go_to_OrangeHRM_demo_home_page() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pf = new OrangeHRMPages (driver);
	    
	}

	@When("^User type the username in the username field$")
	public void user_type_the_username_in_the_username_field() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		pf.getUsername().sendKeys("Admin");
	    
	}

	@And("^User click on the password field$")
	public void user_click_on_the_password_field() throws InterruptedException {
		//driver.findElement(By.xpath("//*[@name='password']")).click();
	    pf.getPassword().click();
	    
	}

	@And("^User type the password in the password field$")
	public void user_type_the_password_in_the_password_field() throws InterruptedException {
		Thread.sleep(1000);
	    //driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	    pf.getPassword().sendKeys("admin123");
	    
	}

	@Then("^User click on the Login button$")
	public void user_click_on_the_Login_button() throws InterruptedException {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
	    pf.getLogin().click();   
	    
	}


}
