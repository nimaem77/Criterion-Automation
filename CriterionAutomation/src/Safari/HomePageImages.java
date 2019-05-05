package Safari;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author homefolder
 *
 */
public class HomePageImages {
	private static SafariDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.safari.noinstall", "true"); //To stop uninstall each time
		driver = new SafariDriver();
		
	}

	@Test
	public void testA() throws Exception {

		driver.get("https://www.criterion.com");
		Thread.sleep(300);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Criterion'])[2]/following::img[1]"))
				.click();
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		String url = driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(url);
		
		driver.switchTo().window(tabs.get(0));

		assertTrue(url.equals("http://www.janusfilms.com/"));

	}

	@Test
	public void testB() throws Exception {
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Criterion'])[2]/following::img[2]"))
				.click();
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		String url = driver.getCurrentUrl();
		assertTrue(url.equals("https://www.criterionchannel.com/"));

	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

}
