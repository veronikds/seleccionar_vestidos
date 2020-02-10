package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Category {
	
	private WebDriver driver;
	private By sortDropDown;
	private By colorButton;
	
	public Category(WebDriver driver) {
		this.driver = driver;
		sortDropDown = By.id("selectProductSort");
		colorButton = By.id("color_2");
	}
	
	public void selectByText(String textToSearch) {
	Select order = new Select(driver.findElement(sortDropDown)); 
	order.selectByVisibleText(textToSearch);
	}
	
	public void selectByValue(String value) {
		Select order = new Select(driver.findElement(sortDropDown));
		order.selectByValue(value);
	}
	
	public void selectByIndex(int value) {
		Select order = new Select(driver.findElement(sortDropDown));
		order.selectByIndex(value);
	}
	public void clickColor() {
		driver.findElement(colorButton).click();
	}
}