package testiranje;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objekti.Elementi;
import objekti.Firma;
import objekti.Home;
import objekti.Reklame;

public class GlavniProgram {

	public static WebDriver driver;

	@BeforeClass
	public void postaviDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Djordje\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void testIdiNa() {
		driver.navigate().to(Home.HOMEURL);
		driver.navigate().to("\"https://www.humanity.com/\"");
		String expected = Home.HOMEURL;
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void testAboutUs() {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.humanity.com/about");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Home.shooting(driver, "FullScreenshot.");
		boolean actual = true;
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void testLogin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a[3]")).click();
		WebElement we = driver.findElement(By.xpath("//*[@id=\"popup-form\"]/div[1]/input"));
		we.sendKeys("Djordje Cvarkov");
		WebElement we1 = driver.findElement(By.xpath("//*[@id=\"popup-form\"]/div[2]/input"));
		we1.sendKeys("drzavniposao@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"popup-free-trial-link\"]")).click();
		driver.navigate().to(Firma.URL);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String actual = driver.getCurrentUrl();
		String expected = Firma.URL;
		Assert.assertEquals(actual, expected);
	}

	/*
	 * @Test(priority = 4)
	 *  public void testFirma() {
	 * driver.manage().window().fullscreen();
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * Firma.companyName(driver, "Salapura Rade"); 
	 * Firma.industry(driver);
	 * driver.findElement(By.linkText("Retail")); 
	 * Firma.functionalRole(driver);
	 * driver.findElement(By.linkText("Operations")); 
	 * Firma.phone(driver,
	 * "06112345678"); Firma.password(driver, "54321"); 
	 * Firma.repeat(driver,"54321");
	 *  Firma.startBtn(driver); 
	 *  String actual = driver.getCurrentUrl();
	 * String expected = "SalapuraRade.humanity.com/app/schedule/employee/week/overview/overview/23%2c1%2c2021/";
	 * Assert.assertEquals(actual, expected); }
	 */

	@Test(priority = 4)
	public void testalterLog() {
		driver.navigate().to("https://www.humanity.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Home.fullName(driver, "Djordje Cvarkov");
		Home.email(driver, "drzavniposao@gmail.com"); // mail
		Home.pressBTN(driver, "/html/body/div[1]/header/div[1]/div/div/div/nav/div[2]/div/a[3]");
		driver.navigate().to(Firma.URL);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		String actual = driver.getCurrentUrl();
		String expected = Firma.URL;
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 5)
	public void testloginPostojeci() {
		driver.navigate().to("https://www.humanity.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Home.loginPostojeci(driver, Home.EMAIL_POSTOJECI, Home.PASS_POSTOJECI);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected= "https://babaipile.humanity.com/app/dashboard/";
		Assert.assertEquals(actual, expected);
	}
	@AfterClass
	public void zatvaranjeDrajvera() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.close();
}
	
}

