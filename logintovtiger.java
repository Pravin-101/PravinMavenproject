package assignment1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintovtiger {
@Test (enabled=false)
public void logintovtiger() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	Thread.sleep(3000);
	String Expectedname="vtiger";
	String actualname=driver.getTitle();
//	driver.findElement(By.id("username")).sendKeys("admin");
	//driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"loginFormDiv\"]/form/div[3]/button")).click();
	Assert.assertEquals(actualname,Expectedname,"Acutal title and Expected title is not matching");
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[5]/div/a/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"menubar_item_right_LBL_SIGN_OUT\"]")).click();
}

@Test (enabled=false)
public void addwidget() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"loginFormDiv\"]/form/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"tab_2\"]/div/div[1]/div/div[1]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"tab_2\"]/div/div[1]/div/div[1]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"select2-chosen-2\"]")).click();

}
@Test  (enabled=true)
public void testcase3() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"loginFormDiv\"]/form/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"appnavigator\"]/div/span")).click();
	//driver.findElement(By.xpath("//*[@id=\"MARKETING_modules_dropdownMenu\"]/div/span[3]")).click();
	//Thread.sleep(3000);
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id=\"MARKETING_modules_dropdownMenu\"]/div/span[3]"))).perform();
	action.moveToElement(driver.findElement(By.xpath("//*[@id=\"MARKETING_modules_dropdownMenu\"]")), 150, 0).click().build().perform();
	String actualtitle=driver.getTitle();
	String expectectedtitle="Contacts";
	Assert.assertEquals(actualtitle, expectectedtitle);
	driver.findElement(By.xpath("//*[@id=\"Contacts_listView_basicAction_LBL_ADD_RECORD\"]")).click();
	driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("Lohote");
	driver.findElement(By.xpath("//*[@id=\"EditView\"]/div[3]/div/div/button")).click();
	String actualtitle1=driver.getTitle();
	String expectectedtitle1="Contacts - Lohote";
	Assert.assertEquals(actualtitle1, expectectedtitle1);
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[5]/div/a/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"menubar_item_right_LBL_SIGN_OUT\"]")).click();
	driver.close();
	
}

}
