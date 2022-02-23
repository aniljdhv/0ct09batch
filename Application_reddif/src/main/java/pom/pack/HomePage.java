package pom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy (xpath="//a[@title='Watch videos']")
	private WebElement vedio ;



	public HomePage(WebDriver driver1)
	{
	PageFactory.initElements(driver1, this);
	}
	 public void clickOnforvedioTab()
     {
   	 vedio.click();
     }
}