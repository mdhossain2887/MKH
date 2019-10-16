package utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	
	public static void clickByText(List<WebElement> elements, String exText) {
		
		for(WebElement element:elements) {
			if(element.getText().equals(exText)) {
				element.click();
			}
		}
	}
	public static void click(WebDriver driver,WebElement element) {
		waitForElement(driver, element).click();
	}
	public static WebElement waitForElement(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	public static void clickByIndex(List<WebElement> elements, int i) {
		
		elements.get(i).click();
		
	}
	public static int getCountOfProduct(WebElement element) {
		String text=element.getText();
		return Integer.parseInt(text);
	}
	

}
