package pom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VedioPage {


		@FindBy (xpath="//input [@id='srchword']")
		private WebElement texttab ;

		@FindBy (xpath="//input [@title='Search']")
		private WebElement search ;



		public VedioPage(WebDriver driver1)
		{
		PageFactory.initElements(driver1, this);
		}
		 public void clickOnfortexttabTab()
         {
       	 texttab.sendKeys("Omicron cases");
       	 
         }
		 public void clickOnforsearchTab()
         {
       	 search.click();
         }


}