package Chrome;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HomeSocialMediaLinks {
	private static ChromeDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/homefolder/Desktop/JavaCode/chromedriver");

		driver = new ChromeDriver();

	}

	// facebook
	@Test
	public void testA() throws Exception {

		driver.get("https://www.criterion.com");
		driver.findElement(By.cssSelector("li > a > svg > path")).click();
		Thread.sleep(8600);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String url = driver.getCurrentUrl();
		Thread.sleep(800);
		driver.switchTo().window(tabs.get(0));

		assertTrue(url.equals("https://www.facebook.com/CriterionCollection"));

	}

	// twitter
	@Test
	public void testB() throws Exception {
		driver.findElement(By.xpath("//a[@href='https://twitter.com/Criterion']")).click();
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		String url = driver.getCurrentUrl();
		Thread.sleep(1000);

		driver.switchTo().window(tabs.get(0));

		assertTrue(url.equals("https://twitter.com/Criterion"));

	}

	// tumblr
	@Test
	public void testC() throws Exception {
		driver.findElement(By.xpath("//a[@href='http://criterioncollection.tumblr.com/']")).click();
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(3));
		String url = driver.getCurrentUrl();
		Thread.sleep(1000);

		driver.switchTo().window(tabs.get(0));

		assertTrue(url.equals("https://criterioncollection.tumblr.com/"));

	}

	// youtube
	@Test
	public void testD() throws Exception {
		Thread.sleep(600);
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/user/criterioncollection']")).click();
		Thread.sleep(2000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(4));
		String url = driver.getCurrentUrl();
		Thread.sleep(1000);
		System.out.println(url);
		driver.switchTo().window(tabs.get(0));
		assertTrue(url.equals("https://www.youtube.com/user/criterioncollection"));

	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}
}
