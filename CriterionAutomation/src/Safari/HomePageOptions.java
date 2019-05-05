package Safari;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.safari.SafariDriver;

import Helper.HelperMethods;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HomePageOptions {
	
	private static SafariDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

		@BeforeClass
		public static void setUp() throws Exception {
			System.setProperty("webdriver.safari.noinstall", "true"); //To stop uninstall each time
			driver = new SafariDriver();
		    driver.get("https://www.criterion.com");

		}


	  
	  
	  //Test of all clickable links on home page
	  //Shop the collection
	  @Test
	  public void testCollectionHomePageScrollTestA() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Shop the Collection')]"),driver));
	   
	  }
	  
	  //COMING SOON
	  @Test
	  public void testCollectionHomePageScrollTestB() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Coming Soon')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  //New Release
	  @Test
	  public void testCollectionHomePageScrollTestC() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'New Release')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  //DVDS & BLU-RAYS
	  @Test
	  public void testCollectionHomePageScrollTestD() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'DVDs & Blu-rays')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  //The Current
	  @Test
	  public void testCollectionHomePageScrollTestE() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'The Current')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  //ON FILM
	  @Test
	  public void testCollectionHomePageScrollTestF() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'On Film')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  //Inside Criterion
	  @Test
	  public void testCollectionHomePageScrollTestG() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Inside Criterion')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  @Test
	  public void testCollectionHomePageScrollTestH() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Your Account')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }

	  @Test
	  public void testCollectionHomePageScrollTestI() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Login')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  @Test
	  public void testCollectionHomePageScrollTestJ() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Our Mission')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  @Test
	  public void testCollectionHomePageScrollTestK() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Contact Us')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  @Test
	  public void testCollectionHomePageScrollTestL() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'FAQ')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  @Test
	  public void testCollectionHomePageScrollTestM() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'General')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  @Test
	  public void testCollectionHomePageScrollTestN() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Order Support')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  @Test
	  public void testCollectionHomePageScrollTestO() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Tech Support')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  @Test
	  public void testCollectionHomePageScrollTestP() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Channel Support')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  @Test
	  public void testCollectionHomePageScrollTestQ() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'My Criterion')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  @Test
	  public void testCollectionHomePageScrollTestR() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Sign Up for Our Newsletter')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	  
	  @Test 
	  public void testCollectionHomePageScrollTestS() throws Exception {
	   assertTrue(HelperMethods.isElementPresent(By.xpath("//*[contains(text(), 'Follow Us')]"),driver));
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	  }
	
	  
	  @AfterClass
	  public static void tearDown() throws Exception {
		
			  
	 try {
	    driver.close(); 
	    driver.quit();
	 }catch(NoSuchSessionException ex) {
		 ex.printStackTrace();
	 }
	  }

	}

