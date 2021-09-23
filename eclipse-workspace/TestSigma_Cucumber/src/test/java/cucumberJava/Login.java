package cucumberJava;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	public WebDriver driver;
	// private StringBuffer verificationErrors = new StringBuffer();
	
	public Login() {
		driver = hooks.driver;
	}
	
	@Given("^User lands on Login page$")
	public void user_lands_on_Login_page() {
	    // Write code here that turns the phrase above into concrete actions
    	driver.get("http://travel.testsigma.com/");
    	driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	    throw new cucumber.api.PendingException();
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
		driver.findElement(By.xpath("//label[@id='firstname_lable']")).sendKeys("admin");
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
		driver.findElement(By.xpath("//input[@id='icon_telephone']")).sendKeys("12345");
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("^click on login button$")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("^user should able to login$")
	public void user_should_able_to_login() {
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("^user name should be shown$")
	public void user_name_should_be_shown() {
		
		String Expected = driver.findElement(By.xpath("//a[contains(text(),'admin')]")).getText();
		assertEquals(Expected,"admin");
		System.out.print("Login successfull");
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}



}
