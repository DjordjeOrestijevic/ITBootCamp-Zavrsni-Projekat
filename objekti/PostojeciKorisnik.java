package objekti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostojeciKorisnik {

	public static final String HOMEURL = "https://babaipile.humanity.com/app/schedule/employee/week/overview/overview/23%2c1%2c2021/";
	public static final String USERNAME = "/html/body/div[1]/div[2]/div/form[1]/div[1]/div[2]/div/input";
	public static final String PASSWORD = "/html/body/div[1]/div[2]/div/form[1]/div[1]/div[3]/div/input";
	public static final String BTN1 = "/html/body/div[1]/div[2]/div/form[1]/div[3]/div/button[1]";
	public static final String FILE = "Data.xlsx";
	public static final String LOGOUT1 = "/html/body/table/tbody/tr/td/div[4]/div/div[5]/a";
	public static final String IKONICA = "/html/body/table/tbody/tr/td/div[7]/div/div[3]/div/i";
	
	public static void loginUser(WebDriver driver, String name) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(USERNAME));	
		we.sendKeys(Home.citajPodatak(FILE, 1,0));
	}
	
	public static void loginPassword(WebDriver driver, String pass) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    WebElement we = driver.findElement(By.xpath(PASSWORD));
	    we.click();
	    we.sendKeys(Home.citajPodatak(FILE, 1,1));	
	}
	public static void pressBTN(WebDriver driver) {
		driver.findElement(By.xpath(BTN1));
	}
	
	public static void logout(WebDriver driver) {
		driver.navigate().to(HOMEURL);
		driver.findElement(By.xpath(IKONICA)).click();
		pressBTN(driver);	
	}
	public static void pressLOGOUT1(WebDriver driver) {
		driver.findElement(By.xpath(LOGOUT1));
	}
}
