package workShopDec23;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenDeom {
	
	@Test(dataProvider = "getData")
	
	public void Login(String username,String pwd) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.id("username")).sendKeys(username);//tomsmith
		driver.findElement(By.id("password")).sendKeys(pwd);//SuperSecretPassword!
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3);
		driver.close();

	}
	
	@DataProvider
	Object[][] getData(){
		
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "tomsmith";
		data[0][1] = "SuperSecretPassword!";
		
		data[1][0] = "admin";
		data[1][1] = "admin";
		
		return data;
		
		
		
	}
	
}
