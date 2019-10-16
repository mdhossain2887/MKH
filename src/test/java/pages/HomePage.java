package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class HomePage {
	
	@FindBy(xpath="") List<WebElement> menus;
	@FindBy(xpath="") List<WebElement> subMenus;
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void hoverOverOnMenu(String exMenuText) {
		Actions ac=new Actions(driver);
		for(WebElement menu:menus ) {
			if(menu.getText().equals(exMenuText)) {
				ac.moveToElement(menu).build().perform();
			}
		}
		
	}
	public ArrivalsPage clickOnSubMenu() {
		Helper.clickByText(subMenus, "New Arrivals");
		return new ArrivalsPage(driver);
	}

}
