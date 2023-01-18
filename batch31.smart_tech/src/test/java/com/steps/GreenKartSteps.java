package com.steps;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GreenKartSteps {

	WebDriver driver; 
	
	@Given("^Go to Green Kart home page$")
	public void go_to_Green_Kart_home_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//String actual = driver.getTitle();
		//System.out.println(actual);
	}

	@Given ("^User verify the page title$")
	public void user_verify_the_page_title() throws Throwable {
		 //String expected = "GreenKart - veg and fruits kart";
		 //String actual = driver.getTitle();
		 //System.out.println(actual);
	//if (driver.getTitle().equals("GreenKart - veg and fruits kart")) {
		Assert.assertEquals("GreenKart - veg and fruits kart", driver.getTitle());
		//System.out.println("Test Pass");
	} 
	//else {
			//System.out.println("Test Fail");
		//}
//}

	@When("^User capture all the items from the page$")
	public void user_capture_all_the_items_from_the_page() throws Throwable {
		List <WebElement> items = driver.findElements(By.xpath("//*[@class='product-price']"));
		//Collections.sort(items);
		//System.out.println(items);
		items.size();
		System.out.println(items.size());
		for (int i = 0; i < items.size(); i++) {
			String value = items.get(i).getText();
			//int myint = Integer.parseInt(value); //from string to integer
			//System.out.println(myint);
		}	
		
	}

	@When("^User print the sorted prices in the decending order$")
	public void user_print_the_sorted_prices_in_the_decending_order() throws Throwable {
	   
	    
	}

	@When("^User add the second and the third items into cart$")
	public void user_add_the_second_and_the_third_items_into_cart() throws Throwable {
	   
	    
	}

	@Then("^User go to cart page$")
	public void user_go_to_cart_page() throws Throwable {
	   
	    
	}

	@Then("^User verify the total price$")
	public void user_verify_the_total_price() throws Throwable {
	   
	    
	}

	@Then("^User go to next page to select the country where it will be shipped \"([^\"]*)\"$")
	public void user_go_to_next_page_to_select_the_country_where_it_will_be_shipped(String arg1) throws Throwable {
	   
	    
	}

	@Then("^User verify successfully the shipped items$")
	public void user_verify_successfully_the_shipped_items() throws Throwable {
	   
	    
	}
}
