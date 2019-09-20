package com.stepd;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition2 {
	static WebDriver driver;
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\raja\\eclipse-workspace\\TelecomPageMap\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	    	}

	@Given("user should be in telecom page")
	public void user_should_be_in_telecom_page() {
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("user should enter all the details")
	public void user_should_enter_all_the_details(io.cucumber.datatable.DataTable data) {
		
		List<Map<String, String>> datas = data.asMaps(String.class,String.class);
		
		driver.findElement(By.xpath("//label[@for='done']")).click();
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys(datas.get(0).get("fname1"));
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys(datas.get(0).get("lname1"));
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(datas.get(0).get("mail1"));
		WebElement adrs = driver.findElement(By.xpath("//textarea[@name='addr']"));
		adrs.sendKeys(datas.get(0).get("adrss"));
		WebElement phone = driver.findElement(By.id("telephoneno"));
		phone.sendKeys(datas.get(0).get("mobile"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should be displayed id is generated")
	public void user_should_be_displayed_id_is_generated() {
	    
	}

}
