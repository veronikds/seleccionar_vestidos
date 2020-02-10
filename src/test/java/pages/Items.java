package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Items {
	
	private WebDriver driver;
	private By lighterBanner;
	private By noResultsBanner;
	
	public Items(WebDriver driver) {
		this.driver = driver;
		lighterBanner = By.className("lighter");
		noResultsBanner = By.xpath("//*[@id='center_column']/p");
	}
	public String getLighterBannerText() {
		return driver.findElement(By.className("lighter")).getText();
	}
	public String getNoResuktsBannerText() {
		return driver.findElement(noResultsBanner).getText();
	}
}
