package Safari;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.safari.SafariDriver;

import Helper.HelperMethods;

/**
 * @author homefolder
 *
 */
public class HomePageImages {
	private static SafariDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.safari.noinstall", "true"); // To stop uninstall each time
		driver = new SafariDriver();
		driver.get("https://www.criterion.com");

	}

	@Test
	public void testA() throws Exception {

		Thread.sleep(300);
		assertTrue(HelperMethods.isElementPresent(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Criterion'])[2]/following::img[1]"),
				driver));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@Test
	public void testB() throws Exception {
		assertTrue(HelperMethods.isElementPresent(By.xpath("//a[@href='https://www.criterionchannel.com/']"), driver));
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
