package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class ArrivalsPage {
	@FindBy(xpath="") WebElement firstProduct;
	WebDriver driver;
	public ArrivalsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public ProductDetailPage clickOnProduct() {
		Helper.click(driver, firstProduct);
		return new ProductDetailPage(driver);
	}

}
