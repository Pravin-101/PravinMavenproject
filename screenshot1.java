package assignment1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot1 {
	
	@Test
	public void takesscreenshot() throws IOException {
		WebDriverManager.chromedriver().setup();
		// creating an object of chromedriver class and upcasting it to WebDriver interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// enter required application url
		driver.get("https://www.google.com");
		TakesScreenshot scrshot=((TakesScreenshot)driver);
		
		File scrfile=scrshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrfile, new File("C:\\Users\\Admin\\eclipse-workspace\\mavenproject1\\src\\test\\java\\assignment1\\scerenshotfile\\scr4.png"));
		
		driver.get("https://bcud.unipune.ac.in/");
TakesScreenshot scrshot1=((TakesScreenshot)driver);
		
		File scrfile1=scrshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrfile1, new File("C:\\Users\\Admin\\eclipse-workspace\\mavenproject1\\src\\test\\java\\assignment1\\scerenshotfile\\scr3.png"));
		
		driver.close();

		
	}

}
