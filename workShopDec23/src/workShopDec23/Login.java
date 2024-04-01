package workShopDec23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("tomsmith");
		
		WebElement Pwd = driver.findElement(By.id("password"));
		Pwd.sendKeys("SuperSecretPassword!");
		
		
		WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
		Submit.click();
		
		String Successmsg = driver.findElement(By.xpath("//div[@class=\"flash success\"]")).getText();
		System.out.println(Successmsg);
				
		Thread.sleep(3000);
		
		WebElement Logout = driver.findElement(By.linkText("Logout"));
		Logout.click();
		
		
	}

}
