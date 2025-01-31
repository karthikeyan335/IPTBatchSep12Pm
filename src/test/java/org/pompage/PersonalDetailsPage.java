package org.pompage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class PersonalDetailsPage extends BaseClass {
	
	public PersonalDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Info']")
	private WebElement myInfo;

	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middleName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="(//input[contains(@class,'oxd-input')])[5]")
	private WebElement employeeId;
	
	@FindBy(xpath="(//input[contains(@class,'oxd-input')])[6]")
	private WebElement otherId;
	
	@FindBy(xpath="(//input[contains(@class,'oxd-input')])[7]")
	private WebElement driverLicenseNumber;
	
	@FindBy(xpath="(//input[contains(@class,'oxd-input')])[8]")
	private WebElement licenseExpiryDate;
	
	@FindBy(xpath="(//div[contains(@class,'oxd-select-text oxd-select-text--active')])[1]")
	private WebElement nationality;
	
	@FindBy(xpath="(//div[contains(@class,'oxd-select-text oxd-select-text--active')])[2]")
	private WebElement maritalStatus;
	
	@FindBy(xpath="(//input[contains(@class,'oxd-input')])[9]")
	private WebElement datOfBirth;
	
	@FindBy(xpath="//label[text()='Male']")   
	private WebElement maleGender;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement femaleGender;
	
	@FindBy(xpath="(//button[text()=' Save '])[1]")
	private WebElement saveButtonOne;
	
	@FindBy(xpath="(//div[contains(@class,'oxd-select-text-input')])[3]")
	private WebElement bloodType;
	
	@FindBy(xpath="(//input[contains(@class,'oxd-input')])[10]")
	private WebElement test_Field;
	
	@FindBy(xpath="(//button[text()=' Save '])[2]")
	private WebElement saveButtonTwo;
	
	
	public WebElement getMyInfo() {
		return myInfo;
	}
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmployeeId() {
		return employeeId;
	}

	public WebElement getOtherId() {
		return otherId;
	}

	public WebElement getDriverLicenseNumber() {
		return driverLicenseNumber;
	}

	public WebElement getLicenseExpiryDate() {
		return licenseExpiryDate;
	}

	public WebElement getNationality() {
		return nationality;
	}

	public WebElement getMaritalStatus() {
		return maritalStatus;
	}

	public WebElement getDatOfBirth() {
		return datOfBirth;
	}

	public WebElement getMaleGender() {
		return maleGender;
	}

	public WebElement getFemaleGender() {
		return femaleGender;
	}

	public WebElement getSaveButtonOne() {
		return saveButtonOne;
	}

	public WebElement getBloodType() {
		return bloodType;
	}

	public WebElement getTest_Field() {
		return test_Field;
	}

	public WebElement getSaveButtonTwo() {
		return saveButtonTwo;
	}
	
}
