package Academy;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import variables.Constants;


public class CompanyTest {

	
	@Test
	public void getData() throws InterruptedException {
		System.out.println("Hello Guys");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(Constants.USER_BASE_URL);
		String text =driver.findElement(By.cssSelector("h2")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase(Constants.SUBHEADER_TEXT));
		driver.close();
	
		
		
	}
}
