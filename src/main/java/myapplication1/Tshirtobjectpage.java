package myapplication1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirtobjectpage extends basepage{ 
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement Tshirt;





public Tshirtobjectpage() {
	PageFactory.initElements(driver, this);
}		 
public WebElement Tshirt (){
	return Tshirt;
	
	}
	  }
   


