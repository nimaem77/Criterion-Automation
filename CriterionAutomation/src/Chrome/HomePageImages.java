package Chrome;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author homefolder
 *
 */
public class HomePageImages {
	private static ChromeDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/homefolder/Desktop/JavaCode/chromedriver");

		driver = new ChromeDriver();

	}

	// janus films
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
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(0));

		assertTrue(url.equals("http://www.janusfilms.com/"));

	}

	// criterionchannel
	@Test
	public void testB() throws Exception {
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Criterion'])[2]/following::img[2]"))
				.click();
		Thread.sleep(1000);
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
