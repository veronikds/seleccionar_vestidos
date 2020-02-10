package search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.StaticWaiter;
import pages.Category;
import pages.Index;
import pages.Items;


public class searchTest {
	
	private WebDriver driver;
	private Index index;
	private Items item;
	private Category category;
	
	@BeforeClass
	public void beforeAll() {
		System.out.println("Preparando...");
		System.out.println("Listo");
		System.out.println("Iniciando pruebas de ADN.");
		System.out.println("Estableciendo valores como predefinidos.");
		System.out.println("Verificando funcionamiento adecuado de maquinaria.");
		System.out.println("Realizando prueba 578: Araneae/Platyrrhini.");
		System.out.println("Observando al mono araña creado.");
		System.out.println("Wait... what?");
	}
	
	@AfterClass
	public void afterAll() {
		System.out.println("Verificando resguardo de pruebas realizadas.");
		System.out.println("La celda N° 578 se encuentra abierta.");
		System.out.println("Oh-ou...");
		System.out.println("Ambiente destruido.");
	}
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		//options.addArguments("--window-size-600,480");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window().mazimize();
		//driver.manage().window().fullscreen();
		//driver.manage().window().setSize(new Dimension(600,480));
		//driver.manage().window().setPosition(new Point(100,100));
		driver.navigate().to("http://automationpractice.com/index.php");
		index = new Index(driver);
		item = new Items(driver);
		category = new Category(driver);
	}
	
	@AfterMethod
	private void tearDown() {
		driver.close();
		driver.quit();
	}

	@Test
	public void sortDressBlue() {
		index.search("Dress");
		category.selectByText("Price: Lowest first");
		category.clickColor();	
		String URL = driver.getCurrentUrl(); 
		Assert.assertEquals(URL, "http://automationpractice.com/index.php?id_product=1&controller=product#/size-s/color-blue");
	}
	
}
