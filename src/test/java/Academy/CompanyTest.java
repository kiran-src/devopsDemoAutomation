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
		String text =Constants.SUBHEADER_TEXT;
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase(Constants.SUBHEADER_TEXT));
		System.out.println("Test 1 Complete");
	}
}
