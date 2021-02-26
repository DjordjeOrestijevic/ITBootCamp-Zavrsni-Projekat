package testiranje;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objekti.Elementi;
import objekti.Firma;
import objekti.Home;

public class TestElementi {
	
    public static final String KORISNIK_UNET = "https://babaipile.humanity.com/app/staff/assignstaff&new=1&first=6085580/";
	
	public static final String DASHBOARD = "https://babaipile.humanity.com/app/dashboard/";
	public static final String SHIFTPLANNING = "https://babaipile.humanity.com/app/schedule/employee/week/overview/overview/26%2c1%2c2021/";
	public static final String TIMECLOCK = "https://babaipile.humanity.com/app/timeclock/";
	public static final String LEAVE = "https://babaipile.humanity.com/app/requests/vacation/";
	public static final String TRAINING = "https://babaipile.humanity.com/app/training/";
	public static final String STAFF = "https://babaipile.humanity.com/app/staff/list/load/true/";
	public static final String AVAILABILITY = "https://babaipile.humanity.com/fe/availability/#/requests/week/2021-02-21/1";
	public static final String PAYROLL = "https://babaipile.humanity.com/app/payroll/scheduled-hours/";
	public static final String REPORTS = "https://babaipile.humanity.com/app/reports/dashboard/";
	
	public static final String IMEPOSLA = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[24]/td[2]/input";

	public static WebDriver driver;

	@BeforeClass
	public void postaviDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Djordje\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
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
		String expected = "https://babaipile.humanity.com/app/dashboard/";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void testReports() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.reports(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = REPORTS;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void testPayRoll() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.payRoll(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = PAYROLL;
		Assert.assertEquals(actual, expected);
	}


	@Test(priority = 4)
	public void testStaff() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.staff(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = STAFF;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 5)
	public void testTraining() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.training(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = TRAINING;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 6)
	public void testLeave() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.leave(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = LEAVE;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 7)
	public void testTimeClock() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.timeClock(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = TIMECLOCK;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 8)
	public void testShiftPlanning() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.shiftPlanning(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = SHIFTPLANNING;
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 9)
	public void testDashBoard() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.dashboard(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = DASHBOARD;
		Assert.assertEquals(actual, expected);
	}
	@Test(priority = 10)
	public void testAvailability() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.availability(driver);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = AVAILABILITY;
		Assert.assertEquals(actual, expected);
	}
	
	
	@Test(priority=11)
	public void testDodatiZaposlenog() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.dodatiZaposlenog(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//Home.shooting(driver, "prilika.");
		}
	}
	@Test(priority = 12)
	public void  testPromenaImena() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Elementi.promenaImena(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().to(STAFF);
		String actual = driver.getCurrentUrl();
		String expected = STAFF;
		Assert.assertEquals(actual, expected);
	}
	@Test (priority = 14)
	public static void testPostaviSliku() {
	   Firma.postaviSliku(driver);
	   boolean actual = Firma.postaviSliku1(driver);
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority = 15)
	public static void testDodajZaposlenog() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Firma.korisnikSaApaca(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean actual = Firma.korisnikSaApaca1(driver,"data.xlsx");
		boolean expected = true;
		Assert.assertEquals(actual, expected);
	} 
	@Test(priority = 16)
	public static void testPromena() {
		Firma.promena(driver);
		boolean actual = Firma.promenaJezika(driver);
		boolean expected = false;
		Assert.assertEquals(actual, expected);
		
	}
	@Test(priority = 17)
	public static void postaviSliku () {
		Firma.profil(driver);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterClass
	public void zatvaranjeDrajvera() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.close();
}
	
}
