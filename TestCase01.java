package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.LogIn;

public class TestCase01 {
	

	WebDriver driver = new FirefoxDriver();
	LogIn data = new LogIn(driver);
	
  @Test(priority=0)
  public void openingSite() {
	  data.webSite("https://wordpress.com/wp-login.php");
	  
	  
  }
  @Test(dependsOnMethods="openingSite")
  public void logInTest()
  {
	  data.logIn("dddf", "ssdfd");
  }
  
@Test(dependsOnMethods="logInTest")
  public void publishPostTest()
  {
	  data.publishPost("Raghu is best Leader", "Vanam will get job surely at the best company");
  }
  @Test(dependsOnMethods="publishPostTest")
  public void close()
  {
	  driver.close();
  }
}
