package DockerRun;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
public void test1() throws MalformedURLException, InterruptedException {
	
	ChromeOptions options = new ChromeOptions();
	URL url =new URL("http://localhost:4444/wd/hub");
	WebDriver driver= new RemoteWebDriver(url,options);
	driver.get("https://www.google.co.in/");
	
	Thread.sleep(20);
	System.out.println("THIS IS CHORME ###########");
	System.out.println(driver.getTitle());
	driver.quit();
}










}
