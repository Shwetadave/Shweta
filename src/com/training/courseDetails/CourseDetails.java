package com.training.courseDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseDetails {
	private WebDriver driver;

	public CourseDetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "form-login_submitAuth")
	private WebElement loginBtn;

	@FindBy(linkText = "Course catalog")
	private WebElement courseCatalog;

	@FindBy(name = "search_term")
	private WebElement catalogSearchText;

	@FindBy(className = "btn-default")
	private WebElement searchBtn;

	@FindBy(xpath = "//*[@title='Subscribe']")
	private WebElement subscribeClickText;

	@FindBy(xpath = "//*[@title='My courses']")
	private WebElement myCourse;

	@FindBy(xpath = "//*[@title='JAva']")
	private WebElement subscribedCourse;
	
	@FindBy(xpath = "//*[@title='Course description']")
	private WebElement courseDescription;
	
	@FindBy(className = "img-circle")
	private WebElement loginImage;

	@FindBy(xpath = "//*[@title='Logout']")
	private WebElement logout;

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}

	public void sendPassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void clickLoginBtn() {
		this.loginBtn.click();
	}

	public void clickcourseCatalogBtn() {
		this.courseCatalog.click();
	}

	public void searchCatalogSearchText(String text) {
		this.catalogSearchText.clear();
		this.catalogSearchText.sendKeys(text);
	}

	public void searchBtn() {
		this.searchBtn.click();
	}

	public void subscribeClick() {
		this.subscribeClickText.click();
	}

	public void myCourseClick() {
		this.myCourse.click();
	}
	
	public void subscribedClick() {
		this.subscribedCourse.click();
	}
	
	public void courseDescriptionClick() {
		this.courseDescription.click();
	}
	
	public void loginImageClick() {
		this.loginImage.click();
	}
	
	public void logoutClick() {
		this.logout.click();
	}
}
