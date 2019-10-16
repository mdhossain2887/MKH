package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class ProductDetailPage {
	@FindBy(xpath="") List<WebElement> allSize;
	@FindBy(xpath="") List<WebElement> allColors;
	@FindBy(xpath="") WebElement addToCart;
	@FindBy(xpath="") WebElement cart;
	@FindBy(xpath="") WebElement secondProduct;
	WebDriver driver;
	public ProductDetailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void selectColor() {
		Helper.clickByIndex(allColors, 2);
	}
	public void clickSize() {
		Helper.clickByText(allSize, "L");
	}
	public void clickAddToCart() {
		Helper.click(driver, addToCart);
	}
	public void verifyCartForOneProduct() {
		Helper.getCountOfProduct(cart);
	}
	public void navigateBack() {
		driver.navigate().back();
	}
	public void buySecondProduct() {
		Helper.click(driver, secondProduct);
		Helper.clickByIndex(allColors, 3);
		Helper.clickByText(allSize, "L");
		clickAddToCart();
	}
	public boolean verifyCartForSecondProduct() {
		int v=Helper.getCountOfProduct(cart);
		if(v==2) {
			return true;
		}
		else {
			return false;
		}
	}
}
