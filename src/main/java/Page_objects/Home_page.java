package Page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

	WebDriver driver;
	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-link-accountList")
	private WebElement signin_link;
	@FindBy(xpath="//div[@id=\'nav-flyout-ya-signin\']//span[text()=\'Sign in\'] ")
	private WebElement signin;
	
	@FindBy(id ="twotabsearchtextbox")
	private WebElement search_box;
	
	//search button
	@FindBy(id="nav-search-submit-button")
	private WebElement search_btn;
	
	public WebElement signin_link() {
		return signin_link;
	}
	public WebElement sgnin() {
		return signin;
	}
	public WebElement search_box() {
		return search_box;
	}
	public WebElement search_btn() {
		return search_btn;
	}

}
