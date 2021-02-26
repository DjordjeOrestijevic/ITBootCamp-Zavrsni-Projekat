package objekti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elementi {
	
	public static final String STAFF = "https://babaipile.humanity.com/app/staff/list/load/true/";
    public static final String ADDEMPLOYEES = "/html/body/table/tbody/tr/td/div[5]/button[3]";
    
    
	public static final String URL2 = "https://babaipile.humanity.com/app/dashboard/";
	public static final String XDASHBOARD = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[1]/a/span";
	public static final String XSHIFTPLANNING = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[2]/a/span";
	public static final String XTIMECLOCK = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[3]/a/span/i";
	public static final String XLEAVE = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[4]/a/span/i";
	public static final String XTRAINING = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[5]/a/span/i";
	public static final String XSTAFF = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[6]/a/span";
	public static final String XAVAILABILITY = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[7]/a/span";
	public static final String XPAYROLL = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[8]/a/span";
	public static final String XREPORTS = "/html/body/table/tbody/tr/td/div[7]/div/div[2]/ul/li[9]/a/span/p";
	

	
	
	public static void dashboard(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XDASHBOARD));
		we.click();
	}
	public static void shiftPlanning(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XSHIFTPLANNING));
		we.click();
	}
	
	public static void timeClock(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XTIMECLOCK));
		we.click();
	}
	
	public static void leave(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XLEAVE));
		we.click();
	}
	public static void training(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XTRAINING));
		we.click();
	}
	public static void staff(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XSTAFF));
		we.click();
	}
	public static void availability(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XAVAILABILITY));
		we.click();
	}
	public static void payRoll(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XPAYROLL));
		we.click();
	}
	public static void reports(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(XREPORTS));
		we.click();
	}
	public static void dodatiZaposlenog(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(STAFF);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Home.shooting(driver, "slika.");
		WebElement we = driver.findElement(By.xpath(ADDEMPLOYEES));
		we.click();
		WebElement we1 =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[2]/input"));
		we1.click();
		we1.sendKeys("Dragan");
		WebElement we2 =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[3]/input"));
		we2.click();
		we2.sendKeys("Torbica");
		WebElement we3 =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[2]/td[4]/input"));
		we3.click();
		we3.sendKeys("veselibosanac@manjaca.ba");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[9]/td[2]/button")).click();
		driver.navigate().to("https://babaipile.humanity.com/app/staff/assignstaff&new=1&first=6085648/");
		Home.shooting(driver, "prilika.");
	}
	
	public static void promenaImena(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(STAFF);
		WebElement we = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]"));
		we.click();
		driver.navigate().to("https://babaipile.humanity.com/app/staff/detail/6081206/");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[1]/a[2]")).click();
		WebElement we1 =driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[1]/td[2]/input"));
		we1.click();
		we1.clear();
		we1.sendKeys("Jove");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[39]/td/input")).click();
		
	
	}


}
