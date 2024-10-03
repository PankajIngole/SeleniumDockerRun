package DockerRun;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test2 {
	
	@Test
public void test1() throws MalformedURLException, InterruptedException {
	
	FirefoxOptions options = new FirefoxOptions();
	URL url =new URL("http://localhost:4444/wd/hub");
	WebDriver driver= new RemoteWebDriver(url,options);
	driver.get("https://www.google.co.in/");
	
	Thread.sleep(20);
	System.out.println("THIS IS FireFox ###########");
	System.out.println(driver.getTitle());
	driver.quit();
}










}
