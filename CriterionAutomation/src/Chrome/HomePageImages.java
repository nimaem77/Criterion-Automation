package Chrome;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePageImages {
 	private static ChromeDriver driver;
	  private String baseUrl;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
			 System.setProperty("webdriver.chrome.driver", "/Users/homefolder/Desktop/JavaCode/chromedriver");

	    driver = new ChromeDriver();

	    baseUrl = "https://www.criterion.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testCollectionHomePageScroll() throws Exception {
	    driver.get("https://www.criterion.com");
	    driver.findElement(By.xpath("//*[contains(text(), 'New Release')]")).click();
	    
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.close();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

}
