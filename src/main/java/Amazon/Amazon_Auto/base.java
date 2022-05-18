 package Amazon.Amazon_Auto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
	
	 public WebDriver driver;
	 public Properties prop;
	 
	 public static Properties load_properties() throws IOException {
		 Properties prop=new Properties();
		 FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Properties");
		 prop.load(fs);
		 return prop;
	 }
	 public String get_URL() throws IOException {
		 Properties prop=load_properties();
		 String url=prop.getProperty("url");
		return url;
	 }
	 
	 public WebDriver intialize_Driver() throws IOException {
		 Properties prop=load_properties();
		 String browser=prop.getProperty("browser");
		 
		   if(browser.contains("chrome")) {
	    	   System.setProperty("webdriver.chrome.driver",
	   				System.getProperty("user.dir")+"\\\\resources\\chromedriver.exe");
	    	   ChromeOptions options=new ChromeOptions();
	//Headless mode code
	    	   //    	   ChromeOptions options=new ChromeOptions();
//	    	   options.addArguments("--headless");
//	   		 driver=new ChromeDriver(options);
	    	   if(browser.contains("headless"))
	    		   options.addArguments("headless");
	    	   driver =new ChromeDriver(options);
	       }
	       
	       else if(browser.equalsIgnoreCase("firefox")) {
	    	   System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\resources\\geckodriver.exe");
				//Creating webdriver
				 driver=new FirefoxDriver();
	       }
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	       return driver;	
	    
		 
	 }
	 public WebDriverWait exp_wait(WebDriver drv) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(drv,5);
		 return wait ;
		 
	 }
	

}
