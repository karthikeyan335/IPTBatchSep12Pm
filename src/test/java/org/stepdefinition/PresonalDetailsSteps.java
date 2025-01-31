package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.pompage.LoginPage;
import org.pompage.PersonalDetailsPage;
import org.utility.BaseClass;

import io.cucumber.java.en.*;

public class PresonalDetailsSteps extends BaseClass {
	
	LoginPage l;
	PersonalDetailsPage p;
	
	@Given("The user should be in orange login page")
	public void the_user_should_be_in_orange_login_page() {
	    launchBrowser("chrome");
	    urlLaunch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		maximize();
		implicitWait(20);
	}

	@When("The user has to enter the {string} and {string} and click the login button")
	public void the_user_has_to_enter_the_and_and_click_the_login_button(String user, String pass) {
	   l=new LoginPage();
	   sendkeys(l.getUsername(), user);
	   sendkeys(l.getPassword(), pass);
	   click(l.getLoginBtn());
	}

	@Then("The user has to verify the {string} page")
	public void the_user_has_to_verify_the_page(String verifyOne) {
	    Assert.assertTrue("verify the dashboard page", currentUrl().contains(verifyOne));	
	}

	@When("The user has click the my info button and verify the {string} page")
	public void the_user_has_click_the_my_info_button_and_verify_the_page(String verifyTwo) {
		p=new PersonalDetailsPage();
		click(p.getMyInfo());
		Assert.assertTrue("verify the personal details page", currentUrl().contains(verifyTwo));
	}

	@When("The user has to enter the required details of it and save it")
	public void the_user_has_to_enter_the_required_details_of_it_and_save_it() throws AWTException, InterruptedException {
	    
		click(p.getFirstName());
		controlA();
		sendkeys(p.getFirstName(), "David");
		
		click(p.getMiddleName());
		controlA();
		sendkeys(p.getMiddleName(), "Miller");
		
		click(p.getLastName());
		controlA();
		sendkeys(p.getLastName(), "John");
		
		click(p.getEmployeeId());
		controlA();
		sendkeys(p.getEmployeeId(), "965874");
		
		click(p.getOtherId());
		controlA();
		sendkeys(p.getOtherId(), "7412547");
		
		click(p.getDriverLicenseNumber());
		controlA();
		sendkeys(p.getDriverLicenseNumber(), "8745214");
		
		click(p.getLicenseExpiryDate());
		controlA();
		sendkeys(p.getLicenseExpiryDate(), "2028-05-05");
		
		click(p.getNationality());
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		
		Thread.sleep(1000);
		
		click(p.getMaritalStatus());
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		click(p.getDatOfBirth());
		controlA();
		sendkeys(p.getDatOfBirth(), "2002-05-08");
		
		click(p.getFemaleGender());
		
		click(p.getSaveButtonOne());
	    
	}
	

}
