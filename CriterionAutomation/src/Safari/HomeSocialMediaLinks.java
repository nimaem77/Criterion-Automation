package Safari;

import static org.junit.Assert.assertTrue;

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
public class HomeSocialMediaLinks {
	private static SafariDriver driver;

	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.safari.noinstall", "true"); // To stop uninstall each time
		driver = new SafariDriver();
		driver.get("https://criterion.com");
	}

	@Test
	public void testA() throws Exception {

		assertTrue(HelperMethods.isElementPresent(By.xpath("//a[@href='https://twitter.com/Criterion']"), driver));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	// twitter
	@Test
	public void testB() throws Exception {

		assertTrue(HelperMethods.isElementPresent(By.xpath("//a[@href='https://twitter.com/Criterion']"), driver));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	// tumblr
	@Test
	public void testC() throws Exception {
		assertTrue(HelperMethods.isElementPresent(By.xpath("//a[@href='http://criterioncollection.tumblr.com/']"),
				driver));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	// youtube
	@Test
	public void testD() throws Exception {

		assertTrue(HelperMethods
				.isElementPresent(By.xpath("//a[@href='https://www.youtube.com/user/criterioncollection']"), driver));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@AfterClass
	public static void tearDown() throws Exception {
		try {
			driver.close();
			driver.quit();
		} catch (NoSuchSessionException ex) {
		}
	}
}
