package org.cts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Prudhvi\\ShopBop\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://www.shopbop.com/");
	driver.manage().window().maximize();
	WebElement signinBtn =driver.findElement(By.xpath("(//a[@class=\"login-top-link\"])[1]"));
	signinBtn.click();
	Thread.sleep(5000);
	WebElement userId = driver.findElement(By.xpath("//input[@type='email']"));
	userId.sendKeys("b.sravani094@gmail.com");
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("sravani");
	Thread.sleep(5000);
	WebElement clickBtn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	clickBtn.click();
	Thread.sleep(5000);
	WebElement searchBtn = driver.findElement(By.xpath("//input[@id='search-input']"));
	searchBtn.sendKeys("Bags");
	Robot r = new Robot ();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement BagName = driver.findElement(By.xpath("(//div[@itemprop='brand'])[1]"));
	BagName.click();
	WebElement addCart = driver.findElement(By.xpath("//button[@id='add-to-cart-btn']"));
	addCart.click();
	Thread.sleep(5000);
	WebElement checkOut1 = driver.findElement(By.xpath("//button[@id='checkout']"));
	checkOut1.click();
	WebElement checkOut2 = driver.findElement(By.xpath("//button[@id='checkoutButton']"));
	checkOut2.click();
	Thread.sleep(2000);
	WebElement addAdress = driver.findElement(By.xpath("//button[@id='addAddressButton']"));
	addAdress.click();
	WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
	firstName.sendKeys("raju");
	WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
	lastName.sendKeys("bera");
	WebElement couNtry = driver.findElement(By.xpath("//select[@id='addressCountryCode']"));
	Select s= new Select(couNtry);
	s.selectByVisibleText("India");
	WebElement adreS1 = driver.findElement(By.xpath("//input[@id='addressLine1']"));
	adreS1.sendKeys("tambaram ,chennai ,tamilanadu");
	WebElement adreS2 = driver.findElement(By.xpath("//input[@id='addressLine2']"));
	adreS2.sendKeys("plot no 9 ,rajeev pall ,tamilanadu");
	WebElement ciTy = driver.findElement(By.xpath("//input[@id='city']"));
	ciTy.sendKeys("chennai");
	WebElement staTe = driver.findElement(By.xpath("//input[@id='intlCode']"));
	staTe.sendKeys("Tamilnadu");
	WebElement postalCode = driver.findElement(By.xpath("//input[@id='postalCode']"));
	postalCode.sendKeys("600043");
	WebElement phNo = driver.findElement(By.xpath("//input[@id='phoneNumber']"));
	phNo.sendKeys("9635872341");
	WebElement saveAdd = driver.findElement(By.xpath("//input[@id='save']"));
	saveAdd.click();
	Thread.sleep(5000);
	WebElement conTinue = driver.findElement(By.xpath("//input[@id='continue']"));
	conTinue.click();
	Thread.sleep(5000);
	WebElement cardName = driver.findElement(By.xpath("//input[@id='nameoncard']"));
	cardName.sendKeys("nag raj");
	WebElement cardNo = driver.findElement(By.xpath("//input[@id='ccnumber']"));
	cardNo.sendKeys("4111111111111111");
	WebElement monTh = driver.findElement(By.xpath("(//select[@class='side-by-side-select expiration-month margin-bottom'])[1]"));
	Select s1= new Select(monTh);
	s1.selectByValue("4");
	WebElement yeAr = driver.findElement(By.xpath("(//select[@class='side-by-side-select expiration-year margin-bottom'])[1]"));
	Select s2= new Select(yeAr);
	s2.selectByValue("2022");
	WebElement conTinue1 = driver.findElement(By.xpath("//button[@id='continue']"));
	conTinue1.click();
	Thread.sleep(5000);
	WebElement placeOrder = driver.findElement(By.xpath("//button[@id='finalizeOrder']"));
	placeOrder.click();



	
	
			
			
	
	

}
}