package pom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VedioPlay {
		@FindBy (xpath="//img[@alt='Ani']")
		private WebElement upload ;



		public VedioPlay(WebDriver driver1)
		{
		PageFactory.initElements(driver1, this);
		}
		 public String clickOnforuploadTab()
         {
       	 upload.click();
		return null;
         }

}
