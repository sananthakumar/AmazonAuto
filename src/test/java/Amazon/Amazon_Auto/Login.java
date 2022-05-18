package Amazon.Amazon_Auto;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_objects.Home_page;
import Page_objects.Signin;

public class Login extends base {
	
	 public WebDriver driver;
	 Home_page home;
	 Signin signin;
	 
	 @BeforeTest
	 public void initialize_Driver() throws IOException {
		 
		 driver=intialize_Driver();
		  home=new Home_page(driver);
	 }
	 @Test()
		public void Go_home() throws IOException  {
		 String URL=get_URL();
		 driver.get(URL);
		 System.out.println(driver.getTitle());
	 }
	 @Test()
	 public void login_Check() {
		 Signin sinin=new Signin(driver);
		 home.signin_link().click();
		 WebDriverWait wait=exp_wait(driver);
		 wait.until(ExpectedConditions.visibilityOf(sinin.email()));
		 sinin.email().sendKeys("sananthkumar1611@gmail.com");
		 sinin.continue_btn().click();
		 wait.until(ExpectedConditions.visibilityOf(sinin.password()));
		 sinin.password().sendKeys("Ananth@123");
		 sinin.signin_btn().click();		 
	 }
	 

}
