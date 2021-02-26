package objekti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reklame {

	public static final String POZDRAV = "/html/body/div[2]/div/div/div[1]/button";
	public static final String  REKLAMA1 = "/html/body/div/div/div/div[1]/div/div/span";
	public static final String REKLAMA2 = "/html/body/div[9]/div/div/div/div[2]/div[2]/div[2]/button";
	public static WebDriver driver;
	
	
	public static void reklame(WebDriver driver,String reklama) {
		driver.findElement(By.xpath(reklama)).click();
	}
	
	
	
	
	
}
