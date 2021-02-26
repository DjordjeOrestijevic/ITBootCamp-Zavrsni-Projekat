package objekti;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
	public static final String HOMEURL = "https://www.humanity.com/";
	public static final String USERNAME = "/html/body/div[1]/div[2]/div/form[1]/div[1]/div[2]/div/input";
	public static final String PASSWORD = "/html/body/div[1]/div[2]/div/form[1]/div[1]/div[3]/div/input";
	public static final String BTN = "/html/body/div[1]/div[2]/div/form[1]/div[3]/div/button[1]";
	public static final String FILE = "Data.xlsx";
	public static final String LOGOUT = "/html/body/table/tbody/tr/td/div[4]/div/div[5]/a";
	
	public static final String FULLNAME = "//*[@id=\"top-form\"]/div/div[1]/input";
	public static final String EMAIL = "//*[@id=\"top-form\"]/div/div[2]/input";
	public static final String STARTBTN = "//*[@id=\"free-trial-link-01\"]";
	public static final String ABOUTUS = "https://www.humanity.com/about";
	public static final String LOGINBTN = "/html/body/div[1]/header/div[2]/div/div/div/div/form/div/div[3]/input";
	public static final String XABOUTUS = "/html/body/div[1]/header/div[1]/div/div/div/nav/div[2]/ul/li[6]/ul/li[1]/a/p[1]";
	
	public static final String LOGIN_POSTOJECI = "/html/body/div[1]/header/div[1]/div/div/div/nav/div[2]/div/a[2]/p";
	public static final String EMAIL_POSTOJECI = "/html/body/div[1]/div[2]/div/form[1]/div[1]/div[2]/div/input";
	public static final String PASS_POSTOJECI = "/html/body/div[1]/div[2]/div/form[1]/div[1]/div[3]/div/input";
	public static final String DUGME_POSTOJECI = "/html/body/div[1]/div[2]/div/form[1]/div[3]/div/button[1]";
	
	
	
	public static void loginUser(WebDriver driver, String name) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.xpath(USERNAME));	
		we.sendKeys(citajPodatak(FILE, 1,0));
	}
	
	public static void loginPassword(WebDriver driver, String pass) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    WebElement we = driver.findElement(By.xpath(PASSWORD));
	    we.click();
	    we.sendKeys(citajPodatak(FILE, 1,1));	
	}
	
	public static void pressBTN(WebDriver driver, String btn) {
		driver.findElement(By.xpath(btn));
	}
	
	public static void loginBtn(WebDriver driver ) {
		driver.findElement(By.xpath(LOGINBTN)).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fullName (WebDriver driver, String fullName ) {
		driver.findElement(By.xpath(FULLNAME)).sendKeys(fullName);
	}
	
	public static void email (WebDriver driver, String email ) {
		driver.findElement(By.xpath(EMAIL)).sendKeys(email);
	}
	
	public static void startBtn (WebDriver driver ) {
		driver.findElement(By.xpath(STARTBTN)).click();
	}
	
	
	public static String citajPodatak(String f, int r, int c) {
		File d = new File(f);
		InputStream inp=null;
		try { 
			inp = new FileInputStream(d);
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		XSSFWorkbook wb=null;
		try {
			wb=new XSSFWorkbook(inp);
		}catch (IOException e) {
			e.printStackTrace();
		}
	Sheet sheet1 = wb.getSheetAt(0);
	Row row = sheet1.getRow(r);
	Cell cell = row.getCell(c);
	String kredencijal = cell.getStringCellValue();
	
	return kredencijal.toString();
	}
	public static void aboutUs(WebDriver driver, String url) {
		WebElement we = driver.findElement(By.xpath(XABOUTUS));
		we.click();
		driver.navigate().to(url);
	}
	
	public static void shooting(WebDriver driver,String naziv) {	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			Robot robot = new Robot();
			String format = "jpg";
			String fileName = naziv + format;

			Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		    BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		    ImageIO.write(screenFullImage, format, new File (fileName));
		    
		    System.out.println("A full screenshot saved");
		}catch (AWTException | IOException ex) {
			System.err.println(ex);
             }
	      }
		public static void alterLog (WebDriver driver, String putanja) {
			driver.navigate().to(HOMEURL);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   driver.findElement(By.xpath(putanja)).click();
		   loginUser(driver,FULLNAME);
		   loginPassword(driver,EMAIL);
		   pressBTN(driver,STARTBTN );
		}
		
		public static void loginPostojeci(WebDriver driver, String email, String pass) {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.navigate().to(HOMEURL);
			driver.findElement(By.xpath(LOGIN_POSTOJECI)).click();
			WebElement we = driver.findElement(By.xpath(email));
			we.click();
			we.sendKeys("drzavniposao@gmail.com");
			WebElement we1 =driver.findElement(By.xpath(pass));
			we1.click();
			we1.sendKeys("Graor123");
			driver.findElement(By.xpath(DUGME_POSTOJECI)).click();
			
		}
	}

		
	
