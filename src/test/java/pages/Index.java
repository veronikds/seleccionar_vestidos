package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Index {
	
	private By searchField;
	private By searchButton;
	private WebDriver driver;
	private By womenLink;
	
	public Index(WebDriver driver) {
		this.driver = driver;	
		searchField = By.id("search_query_top");
		searchButton = By.name("submit_search");
		womenLink = By.linkText("Women");
	}
	
	public void search(String item) {
		driver.findElement(searchField).sendKeys(item);
		driver.findElement(searchButton).click();
	}
	
	public void clickWomenLink() {
		driver.findElement(By.linkText("Women")).click();
	}
}
