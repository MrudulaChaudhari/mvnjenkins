package mavenforjenkins2.mavenforjenkins2;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {
@Test
public void startBrowser() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediff.com/");
	Assert.assertTrue(driver.getTitle().contains("Rediff"));
	driver.quit();
	
	
}
}
