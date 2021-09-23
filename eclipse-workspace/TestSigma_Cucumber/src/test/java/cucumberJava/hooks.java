package cucumberJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.junit.Cucumber;



import cucumber.api.java.After;
import cucumber.api.java.Before;	


public class hooks {
     public static WebDriver driver;
     
     @Before
     public void OpenBrowser() {
    	 System.out.println("Called open browser");
 		System.setProperty("webdriver.chrome.driver","E:\\Java Eclipse\\chrome 85\\chromedriver.exe");  
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
     }
     
     @After
     public void closeBrowser() {
    	 //driver.close();
     }
     
}
