package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver openChromeBrowser()
	{
      System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	public static WebDriver openfirefoxBrowser()
	{
      System.setProperty("webdriver.gecko.driver", "\"C:\\Users\\jadha\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe\"");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
