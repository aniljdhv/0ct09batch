package pom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VedioSelect {
	@FindBy (xpath="(//img[@class='thumbimg'])[1]")
	private WebElement vedioclip ;



	public VedioSelect(WebDriver driver1)
	{
	PageFactory.initElements(driver1, this);
	}
	 public void clickOnforvedioclipTab()
     {
   	 vedioclip.click();
     }
	}



