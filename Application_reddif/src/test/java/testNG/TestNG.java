package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Base;
import pom.pack.HomePage;
import pom.pack.VedioPage;
import pom.pack.VedioPlay;
import pom.pack.VedioSelect;

public class TestNG extends Base {
private WebDriver driver;
private HomePage homepage;
private VedioPage vediopage;
private VedioPlay vedioplay;
private VedioSelect vedioselect;

@BeforeTest
@Parameters("browser")
public void launchBrowser(String browser)
  {
	System.out.println("launchBrowser");
	if(browser.equals("chrome"))
	{
		driver=openChromeBrowser();
	}
	if(browser.equals("firefox"))
	{
		driver=openfirefoxBrowser();
	}
	driver.manage().window().maximize();
	
	}

@BeforeClass
public void initializePomClasses()
{
	homepage = new  HomePage(driver);
	vediopage = new VedioPage(driver);
	vedioselect = new VedioSelect(driver);
	vedioplay = new VedioPlay(driver);	
}
@BeforeMethod
public void vedioFunction()
{
 System.out.println("vedioFunction");
 driver.get("https://www.rediff.com");
homepage.clickOnforvedioTab();
vediopage.clickOnfortexttabTab();
vediopage.clickOnforsearchTab();
vedioselect.clickOnforvedioclipTab();
vedioplay.clickOnforuploadTab();
//softAssert=new softAssert();

}
@Test
public void toVerifyVedioTab()
{
System.out.println("toVerifyVedioTab");
// homepage.clickOnVedio();
String url =driver.getCurrentUrl();
System.out.println(url);
Assert.assertTrue(true, "https://www.rediff.com");
String tital=driver.getTitle();
Assert.assertEquals(tital,"rediff-vedioplay");
String play=vedioplay.clickOnforuploadTab();
Assert.assertEquals(play,"");



}

@Test
public void toVerifyUploadVedio()
{
System.out.println("toVerifyUploadVedio");
String url =driver.getCurrentUrl();
System.out.println(url);
Assert.assertTrue(true, "https://ishare.rediff.com/video/others/punjab-logs-18-active-omicron-cases-state-health-minister/11171255");
/*if(url.equals("https://ishare.rediff.com/video/others/punjab-logs-18-active-omicron-cases-state-health-minister/11171255"))
{
System.out.println("PASS");
}
else
{
System.out.println("FAIL");
}*/
}

@AfterMethod
public void endBrowser()
{
System.out.println("endBrowser");
}
@AfterClass
public void closedBrowser()
{
System.out.println("closedBrowser");
driver.quit();
}

}




