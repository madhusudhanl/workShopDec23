package workShopDec23;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenshotDemo2 {
	
	@Test
	public void Login() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.id("username")).sendKeys("ad");//tomsmith
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("_yyyymmdd_hhmmss").format(new Date());
		String Filename = "SS"+timestamp+".png";
		
		File destFile = new File("F:\\Work\\Workshop11Dec-15Dec2023\\ss\\"+Filename+".png"); 
		FileUtils.copyFile(scrFile, destFile);
		
	}
	

}
