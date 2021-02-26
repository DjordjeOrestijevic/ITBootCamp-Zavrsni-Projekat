package objekti;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Firma {

	public static final String URL = "https://www.humanity.com/wizard-setup2/";
	public static final String COMPANYNAME = "/html/body/div/div/div/form/div[1]/div/div[1]/div/div/input";
	public static final String INDUSTRY = "/html/body/div/div/div/form/div[1]/div/div[2]/div/div/span";
	public static final String FUNCTIONALROLE = "/html/body/div/div/div/form/div[1]/div/div[3]/div/div/span";
	public static final String PHONE = "/html/body/div/div/div/form/div[1]/div/div[4]/div/input";
	public static final String PASSWORD = "/html/body/div/div/div/form/div[1]/div/div[5]/div/input";
	public static final String REPORTS = "/html/body/div/div/div/form/div[1]/div/div[6]/div/input";
	public static final String STARTBTN = "/html/body/div/div/div/form/div[2]/span/input";
	
	public static final String STUFF_DODAJ_E ="https://daneodsljivedobanane.humanity.com/app/staff/list/position/true/";
	public static final String IS_THERE_USER ="https://daneodsljivedobanane.humanity.com/app/staff/list/";
	public static final String EDIT_DATA_BTN ="/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[1]/a[2]";
	public static final String NAME_DTA_FIELD = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[1]/td[2]/input";
	public static final String SAVE_EMPLOEE_BTN ="/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[39]/td/input";
	private static final String SAVE_CHANGES_BTN = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[39]/td/input";
	private static final String UPLOAD_IMG_BTN = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/span[1]/input";
	private static final String AD_EMPLOEE_BTN = "/html/body/table/tbody/tr/td/div[5]/button[3]";
	
	public static final String SETTINGS = "https://babaipile.humanity.com/app/admin/settings/";
	public static final String JEZIK = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String JEZIKIZBOR = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[1]/table/tbody/tr[3]/td[2]/select/option[18]";
	public static final String NOTIFIKACIJA1 = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[2]/table/tbody/tr[1]/td[2]/input";
	public static final String NOTIFIKACIJA2 = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[2]/table/tbody/tr[2]/td[2]/input";
	public static final String NOTIFIKACIJA3 = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[2]/table/tbody/tr[3]/td[2]/input";
	public static final String SAVEBTN = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/button";
	
	public static final String PROFIL = "//*[@id=\"wrap_us_menu\"]/i";
	public static final String PODESAVANJA = "/html/body/table/tbody/tr/td/div[4]/div/a[2]";
	public static final String DODAJSLIKU = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/span[1]/input";
	public static final String IMEPOSLA = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[24]/td[2]/input";
	public static final String SACUVAJBTN = "/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/form/table/tbody/tr[42]/td/input";
	public static final String OSVEZIBTN = "/html/body/table/tbody/tr/td/div[9]/div[8]/div[3]/div/form/div[1]/table/tbody/tr[3]/td[1]/label/a";
	
	public static void firma(WebDriver driver) {
		driver.navigate().to(URL);
	}
	public static void companyName(WebDriver driver, String value) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(COMPANYNAME));
		we.sendKeys(value);
	}
	public static void industry(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(INDUSTRY));
		we.click();
	}
	public static void functionalRole(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(FUNCTIONALROLE));
		we.click();
	}
	public static void phone(WebDriver driver, String num) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(PHONE));
		we.sendKeys(num);
	}
	public static void password(WebDriver driver, String pass) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(PASSWORD));
		we.click();
		we.sendKeys(pass);
	}
	public static void repeat(WebDriver driver, String pass) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(REPORTS));
		we.click();
		we.sendKeys(pass);
	}
	public static void  startBtn(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(STARTBTN));
		we.click();
	}
	public static void findElementBy(WebDriver driver, String path) {
		WebElement we = driver.findElement(By.xpath(path));
		we.click();
	}
	
	
	public static void dohvatiZaposlenog(WebDriver driver,String text) {
		driver.navigate().to("https://daneodsljivedobanane.humanity.com/app/staff/list/");
		driver.findElement(By.linkText(text)).click();
	}
	public static void editDetails(WebDriver driver, String changedName) {
		driver.findElement(By.xpath(EDIT_DATA_BTN)).click();
		WebElement we = driver.findElement(By.xpath(NAME_DTA_FIELD));
		we.clear();
		we.sendKeys(changedName);
		driver.findElement(By.xpath(SAVE_EMPLOEE_BTN )).click();
	}
	
	public static void postaviSliku(WebDriver driver) {
		dohvatiZaposlenog(driver,"Medjed Momo");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(EDIT_DATA_BTN)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(UPLOAD_IMG_BTN)).sendKeys("C:\\Users\\Djordje\\eclipse-workspace\\zavrsniprojekat\\mm.jpg");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(SAVE_CHANGES_BTN)).click();
		
		}
	public static boolean postaviSliku1(WebDriver driver) {
		driver.navigate().to("https://babaipile.humanity.com/app/staff/detail/6085604/");
		WebElement slika = driver.findElement(By.tagName("img"));
		driver.navigate().to("https://babaipile.humanity.com/app/staff/detail/6085648/");
		WebElement pct  = driver.findElement(By.tagName("img"));
		boolean postoji = true;
		if(slika != pct) {
			postoji = true;
		}else {
			postoji = false;
		}
		return postoji;	
	}


	public static void korisnikSaApaca(WebDriver driver) {
		driver.navigate().to(STUFF_DODAJ_E);
		findElementBy(driver,AD_EMPLOEE_BTN);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		for(int i = 1; i<7 ;i++) {
			WebElement wn = driver.findElement(By.id("_asf"+i));
			wn.sendKeys(Home.citajPodatak("data.xlsx", i , 0));
			WebElement wl = driver.findElement(By.id("_asl"+i));
			wl.sendKeys(Home.citajPodatak("data.xlsx", i , 1));
			WebElement we = driver.findElement(By.id("_ase" +i));
			we.sendKeys(Home.citajPodatak("data.xlsx", i , 2));	
		}
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[9]/div[5]/div[2]/div[2]/div/table/tbody/tr/td/div[2]/table/tbody/tr[10]/td[2]")).click();
	}
		public static boolean korisnikSaApaca1(WebDriver driver, String file) {
			driver.navigate().to(STUFF_DODAJ_E);
			boolean isto = true;
			for(int i = 1;i<7; i++) {
				String ime = Home.citajPodatak(file, i, 2).toString();
				String name = driver.findElement(By.linkText(ime)).toString();
				if(ime == name) {
					isto = true;
				}else {
					isto = false;
				}
			}
			return isto;
		
	}
	public static void promena(WebDriver driver) {
		driver.navigate().to(SETTINGS);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath(NOTIFIKACIJA1)).click();
		driver.findElement(By.xpath(NOTIFIKACIJA2)).click();
		driver.findElement(By.xpath(NOTIFIKACIJA3)).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    driver.findElement(By.xpath(JEZIK)).click();
	driver.findElement(By.xpath(JEZIKIZBOR)).click();
	driver.findElement(By.xpath(OSVEZIBTN)).click();
	driver.findElement(By.xpath(SAVEBTN)).click();
	
}
	public static boolean promenaJezika(WebDriver driver) {
		driver.navigate().to(SETTINGS);
		WebElement we = driver.findElement(By.linkText("Availability"));
		boolean izmenjen = true;
		if(we == null) {
			izmenjen = true;
		}else {
			izmenjen = false;
		}
		return izmenjen;
	}
	public static void profil (WebDriver driver) {
		driver.findElement(By.xpath(PROFIL)).click();
		driver.findElement(By.xpath(PODESAVANJA)).click();
		driver.findElement(By.xpath(DODAJSLIKU)).sendKeys("C:\\Users\\Djordje\\eclipse-workspace\\zavrsniprojekat\\djoka.jpg");
		WebElement we = driver.findElement(By.xpath(IMEPOSLA));
		we.clear();
		we.sendKeys("Arhivator");
		driver.findElement(By.xpath(SACUVAJBTN)).click();
		
	}

	
	
	
}
	
	

		



