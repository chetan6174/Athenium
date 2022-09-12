package PomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Testing {
	@FindBy(id="Selenium Training")
	private WebElement selcourse;
	
	@FindBy(id="mycart")
	private WebElement carttab;
	
	
	
	public WebElement getSelcourse() {
		return selcourse;
	}


	public WebElement getCarttab() {
		return carttab;
	}


	public WebElement getFacebook() {
		return facebook;
	}

	public 

	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public void facebookicon() {
		facebook.click();
	}

}
