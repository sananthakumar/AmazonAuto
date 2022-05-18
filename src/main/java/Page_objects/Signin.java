package Page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	
	WebDriver driver;
	public Signin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//email/mob
	@FindBy(id="ap_email")
	private WebElement email;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(id="continue")
	private WebElement continue_btn;
	
	@FindBy(id="signInSubmit")
	private WebElement signin_btn;
	
	public WebElement email() {
		return email;
	}
	
	public WebElement password() {
		return password;
	}

	public WebElement continue_btn() {
		return continue_btn;
	}
	public WebElement signin_btn() {
	return signin_btn;	
	}

	

}
